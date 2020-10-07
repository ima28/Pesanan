package com.example.pesan.Activity;

public class ItemModel { private String name;
    private int image;

    public ItemModel(String name, String type, int image) {
        this.name = name;
        this.image=image;
    }

    public String getName() {
        return name;
    }


    public int getImage() {
        return image;
    }

}