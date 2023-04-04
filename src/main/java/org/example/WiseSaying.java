package org.example;

public class WiseSaying {
    private int id;
    private String content;
    private String Aname;
    WiseSaying(int id, String content, String Aname){
        this.id = id;
        this.content = content;
        this.Aname = Aname;
    }

    public String getContent() {
        return content;
    }

    public int getId() {
        return id;
    }

    public String getAname() {
        return Aname;
    }

    public void setAname(String aname) {
        Aname = aname;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
