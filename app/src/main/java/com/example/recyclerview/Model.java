package com.example.recyclerview;

public class Model {
    private int image;
    private String title;
    private String subTitle;

    public Model() {}

    public Model(int image, String title, String subTitle) {
        this.image = image;
        this.title = title;
        this.subTitle = subTitle;
    }

    public int getImageId() {
        return image;
    }

    public void setImageId(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }
}
