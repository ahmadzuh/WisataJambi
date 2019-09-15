package com.example.wisatajambi.Adapter;

public class Model {

    int image;
    String description, desc_nature;

    public Model(int image, String description, String desc_nature) {
        this.image = image;
        this.description = description;
        this.desc_nature = desc_nature;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDesc_nature() {
        return desc_nature;
    }

    public void setDesc_nature(String desc_nature) {
        this.desc_nature = desc_nature;
    }
}
