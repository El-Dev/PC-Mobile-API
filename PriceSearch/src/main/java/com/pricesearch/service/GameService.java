package com.pricesearch.service;

import com.pricesearch.entity.Game;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Reverside on 10/Apr/17.
 */
public class GameService {
    public ArrayList<Game> getGameResults(String search) throws Exception{
        final String searchLink = "http://www.game.co.za/catalogsearch/result/?q="+search+"+&order=price";

        Document document = Jsoup.connect(searchLink).get();
        Elements brands = document.select("h2.product-brand");
        Elements links = document.select("h2.product-name a");
        Elements prices = document.select("span.price");
        Elements images = document.select("li.item a > img");


        List<String> brandList = new ArrayList<>();
        List<String> titleList = new ArrayList<>();
        List<String> urlList = new ArrayList<>();
        List<String> priceList = new ArrayList<>();
        List<String> imageList = new ArrayList<>();

        for (Element b : brands){
            String brand = b.text();

            brandList.add(brand);
        }

        for (Element link : links) {
            String title = link.ownText();
            String url = link.absUrl("href");

            if (!url.startsWith("http"))
                continue;


            urlList.add(url);
            titleList.add(title);
        }

        for (Element image : images){
            String img = image.absUrl("src");

            if(!img.contains("small_image"))
                continue;

            imageList.add(img);
        }

        for (Element p : prices){
            String price = p.text();
            priceList.add(price);
        }

        ArrayList<Game> searchList = new ArrayList<>();
        for (int i = 0; i < titleList.size(); i++){
            Game game = new Game(titleList.get(i),urlList.get(i),priceList.get(i),imageList.get(i),brandList.get(i));
            if(i == 3)
                break;
            searchList.add(game);
        }
        return searchList;
    }

    public ArrayList<Game> getGameCellphones(String page) throws Exception{
        final String searchLink = "http://www.game.co.za/cellular.html?p="+page;

        Document document = Jsoup.connect(searchLink).get();
        Elements brands = document.select("h2.product-brand");
        Elements links = document.select("h2.product-name a");
        Elements prices = document.select("div.price-box span span.price");
        Elements images = document.select("li.item a > img");


        List<String> brandList = new ArrayList<>();
        List<String> titleList = new ArrayList<>();
        List<String> urlList = new ArrayList<>();
        List<String> priceList = new ArrayList<>();
        List<String> imageList = new ArrayList<>();

        for (Element b : brands){
            String brand = b.text();

            brandList.add(brand);
        }

        for (Element link : links) {
            String title = link.ownText();
            String url = link.absUrl("href");

            if (!url.startsWith("http"))
                continue;


            urlList.add(url);
            titleList.add(title);
        }

        for (Element image : images){
            String img = image.absUrl("src");

            if(!img.contains("small_image"))
                continue;

            imageList.add(img);
        }

        for (Element p : prices){
            String price = p.ownText();
            priceList.add(price);
        }

        ArrayList<Game> searchList = new ArrayList<>();
        for (int i = 0; i < titleList.size(); i++){
            Game game = new Game(titleList.get(i),urlList.get(i),priceList.get(i),imageList.get(i),brandList.get(i));
            if(i == 8)
                break;
            searchList.add(game);
        }
        return searchList;
    }

    public ArrayList<Game> getGameCameras(String page) throws Exception{
        final String searchLink = "http://www.game.co.za/photography-navigation.html?p="+page;

        Document document = Jsoup.connect(searchLink).get();
        Elements brands = document.select("h2.product-brand");
        Elements links = document.select("h2.product-name a");
        Elements prices = document.select("div.price-box span span.price");
        Elements images = document.select("li.item a > img");


        List<String> brandList = new ArrayList<>();
        List<String> titleList = new ArrayList<>();
        List<String> urlList = new ArrayList<>();
        List<String> priceList = new ArrayList<>();
        List<String> imageList = new ArrayList<>();

        for (Element b : brands){
            String brand = b.text();

            brandList.add(brand);
        }

        for (Element link : links) {
            String title = link.ownText();
            String url = link.absUrl("href");

            if (!url.startsWith("http"))
                continue;


            urlList.add(url);
            titleList.add(title);
        }

        for (Element image : images){
            String img = image.absUrl("src");

            if(!img.contains("small_image"))
                continue;

            imageList.add(img);
        }

        for (Element p : prices){
            String price = p.text();
            priceList.add(price);
        }

        ArrayList<Game> searchList = new ArrayList<>();
        for (int i = 0; i < titleList.size(); i++){
            Game game = new Game(titleList.get(i),urlList.get(i),priceList.get(i),imageList.get(i),brandList.get(i));
            if(i == 10)
                break;
            searchList.add(game);
        }
        return searchList;
    }

    public ArrayList<Game> getGameComputers(String page) throws Exception{
        final String searchLink = "http://www.game.co.za/computers-and-stationery.html?p="+page;

        Document document = Jsoup.connect(searchLink).get();
        Elements brands = document.select("h2.product-brand");
        Elements links = document.select("h2.product-name a");
        Elements prices = document.select("div.price-box span span.price");
        Elements images = document.select("li.item a > img");


        List<String> brandList = new ArrayList<>();
        List<String> titleList = new ArrayList<>();
        List<String> urlList = new ArrayList<>();
        List<String> priceList = new ArrayList<>();
        List<String> imageList = new ArrayList<>();

        for (Element b : brands){
            String brand = b.text();

            brandList.add(brand);
        }

        for (Element link : links) {
            String title = link.ownText();
            String url = link.absUrl("href");

            if (!url.startsWith("http"))
                continue;


            urlList.add(url);
            titleList.add(title);
        }

        for (Element image : images){
            String img = image.absUrl("src");

            if(!img.contains("small_image"))
                continue;

            imageList.add(img);
        }

        for (Element p : prices){
            String price = p.text();
            priceList.add(price);
        }

        ArrayList<Game> searchList = new ArrayList<>();
        for (int i = 0; i < titleList.size(); i++){
            Game game = new Game(titleList.get(i),urlList.get(i),priceList.get(i),imageList.get(i),brandList.get(i));
            if(i == 8)
                break;
            searchList.add(game);
        }
        return searchList;
    }

    public ArrayList<Game> getGameGames(String page) throws Exception{
        final String searchLink = "http://www.game.co.za/gaming.html?p="+page;

        Document document = Jsoup.connect(searchLink).get();
        Elements brands = document.select("h2.product-brand");
        Elements links = document.select("h2.product-name a");
        Elements prices = document.select("div.price-box span span.price");
        Elements images = document.select("li.item a > img");


        List<String> brandList = new ArrayList<>();
        List<String> titleList = new ArrayList<>();
        List<String> urlList = new ArrayList<>();
        List<String> priceList = new ArrayList<>();
        List<String> imageList = new ArrayList<>();

        for (Element b : brands){
            String brand = b.text();

            brandList.add(brand);
        }

        for (Element link : links) {
            String title = link.ownText();
            String url = link.absUrl("href");

            if (!url.startsWith("http"))
                continue;


            urlList.add(url);
            titleList.add(title);
        }

        for (Element image : images){
            String img = image.absUrl("src");

            if(!img.contains("small_image"))
                continue;

            imageList.add(img);
        }

        for (Element p : prices){
            String price = p.text();
            priceList.add(price);
        }

        ArrayList<Game> searchList = new ArrayList<>();
        for (int i = 0; i < titleList.size(); i++){
            Game game = new Game(titleList.get(i),urlList.get(i),priceList.get(i),imageList.get(i),brandList.get(i));
            if(i == 8)
                break;
            searchList.add(game);
        }
        return searchList;
    }

    public ArrayList<Game> getGameAudio(String page) throws Exception{
        final String searchLink = "http://www.game.co.za/tv-audio.html?p="+page;

        Document document = Jsoup.connect(searchLink).get();
        Elements brands = document.select("h2.product-brand");
        Elements links = document.select("h2.product-name a");
        Elements prices = document.select("div.price-box span span.price");
        Elements images = document.select("li.item a > img");


        List<String> brandList = new ArrayList<>();
        List<String> titleList = new ArrayList<>();
        List<String> urlList = new ArrayList<>();
        List<String> priceList = new ArrayList<>();
        List<String> imageList = new ArrayList<>();

        for (Element b : brands){
            String brand = b.text();

            brandList.add(brand);
        }

        for (Element link : links) {
            String title = link.ownText();
            String url = link.absUrl("href");

            if (!url.startsWith("http"))
                continue;


            urlList.add(url);
            titleList.add(title);
        }

        for (Element image : images){
            String img = image.absUrl("src");

            if(!img.contains("small_image"))
                continue;

            imageList.add(img);
        }

        for (Element p : prices){
            String price = p.text();
            priceList.add(price);
        }

        ArrayList<Game> searchList = new ArrayList<>();
        for (int i = 0; i < titleList.size(); i++){
            Game game = new Game(titleList.get(i),urlList.get(i),priceList.get(i),imageList.get(i),brandList.get(i));
            if(i == 8)
                break;
            searchList.add(game);
        }
        return searchList;
    }
}
