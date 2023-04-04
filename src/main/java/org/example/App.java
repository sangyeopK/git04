package org.example;

import java.util.ArrayList;

public class App {
    ArrayList<WiseSaying> list = new ArrayList<>();

    public void run() {
        WiseSayingController wiseSayingController = new WiseSayingController();
        System.out.println("=== 명언앱 ===");

        while (true) {
            System.out.println("명령 ) : ");
            String command = ContainerSc.getSc().nextLine();
            Rq rq = new Rq(command);
            if (command.equals("종료")) {
                SystemController.exit();
                return;
            } else if (command.equals("등록")) {
                wiseSayingController.add();
            } else if (command.equals("목록")) {
                wiseSayingController.listout();
            } else if (command.startsWith("삭제")) {
                wiseSayingController.remove(rq);
            } else if (command.startsWith("수정")) {
                wiseSayingController.edit(rq);
            }
        }
    }
}
