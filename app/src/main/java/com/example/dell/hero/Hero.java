package com.example.dell.hero;

/**
 * Created by Dell on 15-Jan-18.
 */

public class Hero {

    private int image;
    private String name;

    Hero(int img, String name) {
        image = img;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }
}

