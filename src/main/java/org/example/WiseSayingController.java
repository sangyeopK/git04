package org.example;

import java.util.ArrayList;

public class WiseSayingController {
    ArrayList<WiseSaying> list = new ArrayList<>();
    int num = 0;

    void add() {
        num++;
        System.out.println("명언을 등록하세요");
        String content = ContainerSc.getSc().nextLine();
        System.out.println(content);
        System.out.println("작가를 등록하세요");
        String Aname = ContainerSc.getSc().nextLine();
        System.out.println(Aname);
        int id = num;
        WiseSaying wiseSaying = new WiseSaying(id, content, Aname);
        list.add(wiseSaying);
        System.out.println(num + "번 명언이 등록 되었습니다");
    }

    void listout() {
        System.out.println("번호 / 명언 / 작가");
        System.out.println("-".repeat(20));
        for (int i = list.size() - 1; i >= 0; i--) {
            WiseSaying wiseSaying = list.get(i);
            System.out.printf("%d / %s / %s\n", wiseSaying.getId(), wiseSaying.getContent(), wiseSaying.getAname());
        }
    }

    void remove(Rq rq) {
        int id = rq.getIntParam("id");
        if (findById(id) == null) {
            System.out.printf("삭제할 값이 없습니다\n");
        } else {
            WiseSaying wiseSaying = findById(id);
            list.remove(wiseSaying);
            System.out.printf("%d번 명언이 삭제 되었습니다\n", id);
        }
    }

    void edit(Rq rq) {
        int id = rq.getIntParam("id");
        if (findById(id) == null) {
            System.out.printf("수정할 값이 없습니다\n");
        } else {
            WiseSaying wiseSaying = findById(id);
            System.out.printf("기존명언 %s", wiseSaying.getContent());
            System.out.printf("수정할 명언");
            String content = ContainerSc.getSc().nextLine().trim();

            System.out.printf("기존작가 %s", wiseSaying.getContent());
            System.out.printf("수정할 작가");
            String Aname = ContainerSc.getSc().nextLine().trim();

            wiseSaying.setAname(Aname);
            wiseSaying.setContent(content);
        }
    }


    private WiseSaying findById(int id) {
        for (WiseSaying wiseSaying : list) {
            if (wiseSaying.getId() == id) {
                System.out.println(wiseSaying);
                return wiseSaying;
            }
        }
        return null;
    }
}