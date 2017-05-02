package com.pricesearch.service;

import com.pricesearch.entity.Dionwired;
import org.apache.tomcat.util.buf.UEncoder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Reverside on 11/Apr/17.
 */
public class DionwiredService {
    public ArrayList<Dionwired> getDionwiredResults(String search) throws Exception{

        final String urlLink = "http://www.dionwired.co.za/catalogsearch/result/?q="+search;

        Document document = Jsoup.connect(urlLink).get();
        Elements links = document.select("h2.product-name a");
        Elements prices = document.select("span.price");
        Elements images = document.select("a.product-image > img");

        List<String> titleList = new ArrayList<>();
        List<String> imageList = new ArrayList<>();
        List<String> urlList = new ArrayList<>();
        List<String> priceList = new ArrayList<>();

        for (Element link : links){
            String title = link.ownText();
            String url = link.absUrl("href");

            titleList.add(title);
            urlList.add(url);
        }

        for (Element p : prices){
            String price = p.text();
            priceList.add(price);
        }

        for (Element img : images){
            String image = img.absUrl("data-original");
            imageList.add(image);
        }

        ArrayList<Dionwired> searchList = new ArrayList<>();
        for (int i = 0; i < titleList.size(); i++){
            Dionwired dionwired = new Dionwired(titleList.get(i),urlList.get(i),priceList.get(i),imageList.get(i));
            if (i == 3)
                break;
            searchList.add(dionwired);
        }
        return searchList;
    }

    public ArrayList<Dionwired> getDionwiredGames(String page) throws Exception{

        final String urlLink = "http://www.dionwired.co.za/entertainment.html/?p="+page;

        Document document = Jsoup.connect(urlLink).get();
        Elements links = document.select("h2.product-name a");
        Elements prices = document.select("span.price");
        Elements images = document.select("a.product-image > img");

        List<String> titleList = new ArrayList<>();
        List<String> imageList = new ArrayList<>();
        List<String> urlList = new ArrayList<>();
        List<String> priceList = new ArrayList<>();

        for (Element link : links){
            String title = link.ownText();
            String url = link.absUrl("href");

            titleList.add(title);
            urlList.add(url);
        }

        for (Element p : prices){
            String price = p.text();
            priceList.add(price);
        }

        for (Element img : images){
            String image = img.absUrl("data-original");
            imageList.add(image);
        }

        ArrayList<Dionwired> searchList = new ArrayList<>();
        for (int i = 0; i < titleList.size(); i++){
            Dionwired dionwired = new Dionwired(titleList.get(i),urlList.get(i),priceList.get(i),imageList.get(i));
            if (i == 8)
                break;
            searchList.add(dionwired);
        }
        return searchList;
    }

    public ArrayList<Dionwired> getDionwiredComputers(String page) throws Exception{

        final String urlLink = "http://www.dionwired.co.za/computing-office.html/?p="+page;

        Document document = Jsoup.connect(urlLink).get();
        Elements links = document.select("h2.product-name a");
        Elements prices = document.select("span.price");
        Elements images = document.select("a.product-image > img");

        List<String> titleList = new ArrayList<>();
        List<String> imageList = new ArrayList<>();
        List<String> urlList = new ArrayList<>();
        List<String> priceList = new ArrayList<>();

        for (Element link : links){
            String title = link.ownText();
            String url = link.absUrl("href");

            titleList.add(title);
            urlList.add(url);
        }

        for (Element p : prices){
            String price = p.text();
            priceList.add(price);
        }

        for (Element img : images){
            String image = img.absUrl("data-original");
            imageList.add(image);
        }

        ArrayList<Dionwired> searchList = new ArrayList<>();
        for (int i = 0; i < titleList.size(); i++){
            Dionwired dionwired = new Dionwired(titleList.get(i),urlList.get(i),priceList.get(i),imageList.get(i));
            if (i == 8)
                break;
            searchList.add(dionwired);
        }
        return searchList;
    }

    public ArrayList<Dionwired> getDionwiredTablets(String page) throws Exception{

        final String urlLink = "http://www.dionwired.co.za/default-category/cellular-tablet/tablets-new.html/?p="+page;

        Document document = Jsoup.connect(urlLink).get();
        Elements links = document.select("h2.product-name a");
        Elements prices = document.select("span.price");
        Elements images = document.select("a.product-image > img");

        List<String> titleList = new ArrayList<>();
        List<String> imageList = new ArrayList<>();
        List<String> urlList = new ArrayList<>();
        List<String> priceList = new ArrayList<>();

        for (Element link : links){
            String title = link.ownText();
            String url = link.absUrl("href");

            titleList.add(title);
            urlList.add(url);
        }

        for (Element p : prices){
            String price = p.text();
            priceList.add(price);
        }

        for (Element img : images){
            String image = img.absUrl("data-original");
            imageList.add(image);
        }

        ArrayList<Dionwired> searchList = new ArrayList<>();
        for (int i = 0; i < titleList.size(); i++){
            Dionwired dionwired = new Dionwired(titleList.get(i),urlList.get(i),priceList.get(i),imageList.get(i));
            if (i == 12)
                break;
            searchList.add(dionwired);
        }
        return searchList;
    }

    public ArrayList<Dionwired> getDionwiredAudio(String page) throws Exception{

        final String urlLink = "http://www.dionwired.co.za/audio.html/?p="+page;

        Document document = Jsoup.connect(urlLink).get();
        Elements links = document.select("h2.product-name a");
        Elements prices = document.select("span.price");
        Elements images = document.select("a.product-image > img");

        List<String> titleList = new ArrayList<>();
        List<String> imageList = new ArrayList<>();
        List<String> urlList = new ArrayList<>();
        List<String> priceList = new ArrayList<>();

        for (Element link : links){
            String title = link.ownText();
            String url = link.absUrl("href");

            titleList.add(title);
            urlList.add(url);
        }

        for (Element p : prices){
            String price = p.text();
            priceList.add(price);
        }

        for (Element img : images){
            String image = img.absUrl("data-original");
            imageList.add(image);
        }

        ArrayList<Dionwired> searchList = new ArrayList<>();
        for (int i = 0; i < titleList.size(); i++){
            Dionwired dionwired = new Dionwired(titleList.get(i),urlList.get(i),priceList.get(i),imageList.get(i));
            if (i == 8)
                break;
            searchList.add(dionwired);
        }
        return searchList;
    }

    public ArrayList<Dionwired> getDionwiredCellphones(String page) throws Exception{

        final String urlLink = "http://www.dionwired.co.za/default-category/cellular-tablet/mobile-phones.html/?p="+page;

        Document document = Jsoup.connect(urlLink).get();
        Elements links = document.select("h2.product-name a");
        Elements prices = document.select("span.price");
        Elements images = document.select("a.product-image > img");

        List<String> titleList = new ArrayList<>();
        List<String> imageList = new ArrayList<>();
        List<String> urlList = new ArrayList<>();
        List<String> priceList = new ArrayList<>();

        for (Element link : links){
            String title = link.ownText();
            String url = link.absUrl("href");

            titleList.add(title);
            urlList.add(url);
        }

        for (Element p : prices){
            String price = p.text();
            priceList.add(price);
        }

        for (Element img : images){
            String image = img.absUrl("data-original");
            imageList.add(image);
        }

        ArrayList<Dionwired> searchList = new ArrayList<>();
        for (int i = 0; i < titleList.size(); i++){
            Dionwired dionwired = new Dionwired(titleList.get(i),urlList.get(i),priceList.get(i),imageList.get(i));
            if (i == 8)
                break;
            searchList.add(dionwired);
        }
        return searchList;
    }

    public ArrayList<String> getDionwiredDetails(String link) throws Exception{

        final String linkUrl = link+" ";

        Document document = Jsoup.connect(linkUrl).get();
        Elements desc = document.select("div.product-collateral div.std");

        ArrayList<String> detailList = new ArrayList<>();
        for(Element d : desc){
            String details = d.text();
            detailList.add(details);
        }
        return  detailList;
    }
}
