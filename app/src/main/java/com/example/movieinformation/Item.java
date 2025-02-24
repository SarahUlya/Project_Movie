package com.example.movieinformation;

public class Item {
    int image;
    String name;
    String title;
    String descripsi;
    String link;

    public Item (int image, String name, String title, String descripsi, String link){
        this.image = image;
        this.name = name;
        this.title = title;
        this.descripsi = descripsi;
        this.link = link;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescripsi() {
        return descripsi;
    }

    public void setDescripsi(String descripsi) {
        this.descripsi = descripsi;
    }

}
