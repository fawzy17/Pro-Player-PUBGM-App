package com.example.proplayerlist;

public class Player {
    private String Name;
    private String Detail;
    private String Desc;
    private int favorit;
    private int foto;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String detail) {
        Detail = detail;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public int getFavorit() {
        return favorit;
    }

    public void setFavorit(int favorit) {
        this.favorit = favorit;
    }
}
