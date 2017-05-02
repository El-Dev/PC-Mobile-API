package com.pricesearch.entity;

import java.util.ArrayList;

/**
 * Created by Reverside on 10/Apr/17.
 */
public class Game {
    private String title;
    private String url;
    private String price;
    private String image;
    private String brand;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Game() {
    }

    public Game(String title, String url, String price, String image,String brand) {
        this.title = title;
        this.url = url;
        this.brand = brand;
        this.price = price;
        this.image = image;
    }
}
