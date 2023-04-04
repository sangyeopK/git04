package org.example;

import java.util.HashMap;

public class Rq {
    private final HashMap<String, String> params;
    private final String actionWord;

    Rq(String command) {
        String[] commandBits = command.split("\\?", 2);
        params = new HashMap<>();
        actionWord = commandBits[0];
        if(commandBits.length == 1)return;
        String command1 = commandBits[1];
        String[] command1Bits = command1.split("=", 2);
        String key = command1Bits[0];
        String value = command1Bits[1];

        params.put(key, value);
    }

    public String getParams(String name) {
        return params.get(name);
    }

    public String getActionWord() {
        return actionWord;
    }

    public int getIntParam(String name) {
        return Integer.parseInt(getParams(name));
    }
}
