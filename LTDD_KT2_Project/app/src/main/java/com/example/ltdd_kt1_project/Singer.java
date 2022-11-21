package com.example.ltdd_kt1_project;


public class Singer {

    private String singerName;
    private String nation;
    private String nickName;

    // Image name (Without extension)
    private int singer;
    private int star;

    public Singer(String singerName, String nation, String nickName, int laptop, int star) {
        this.singerName = singerName;
        this.nation = nation;
        this.nickName = nickName;
        this.singer = singer;
        this.star = star;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getSinger() {
        return singer;
    }

    public void setSinger(int laptop) {
        this.singer = singer;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }
}




