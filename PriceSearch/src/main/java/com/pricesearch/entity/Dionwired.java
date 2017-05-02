package com.pricesearch.entity;

/**
 * Created by Reverside on 11/Apr/17.
 */
public class Dionwired {
    private String title;
    private String url;
    private String price;
    private String image;

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

    public Dionwired(){}

    public Dionwired(String title, String url, String price, String image) {
        this.title = title;
        this.url = url;
        this.price = price;
        this.image = image;
    }
}
