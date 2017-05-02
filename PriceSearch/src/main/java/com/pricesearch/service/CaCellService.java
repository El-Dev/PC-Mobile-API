package com.pricesearch.service;

import com.pricesearch.entity.CaCell;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Reverside on 29/Mar/17.
 */
public class CaCellService{
    public ArrayList<CaCell> getCaCellResults(String search) throws Exception{
        //final String urlLink = "https://www.cacell.co.za/Search-Results?osCsid=peg9b7d753ll9e9i2qu04k64f4&keywords="+search+"&categories_id&x=57&y=4";
        final String urlLink = "https://www.cacell.co.za/Search-Results?keywords="+search;

        Document document = Jsoup.connect(urlLink).get();
        Elements linksEven = document.select("tr .productListing-even td > a");
        Elements priceEven = document.select("tr .productListing-even td");
        Elements imageEven = document.select("tr .productListing-even td > a > img");
        Elements linksOdd = document.select("tr .productListing-odd td > a");
        Elements priceOdd = document.select("tr .productListing-odd td");
        Elements imageOdd = document.select("tr .productListing-odd td > a > img");

        List<String> priceList = new ArrayList<>();
        List<String> urlList = new ArrayList<>();
        List<String> titleList = new ArrayList<>();
        List<String> imageList = new ArrayList<>();

        for(Element p: priceEven){
            String price = p.text();

            if(price.isEmpty())
                continue;

            if (price.length() < 13 ){
                if(price.contains("R")) {
                    priceList.add(price);
                }
            }
        }

        for (Element link : imageEven) {
            String img = link.absUrl("src");

            if(img.contains("buttons"))
                continue;

            if(img.isEmpty())
                continue;

            imageList.add(img);
        }

        for (Element link : linksEven) {
            String title = link.ownText();
            String url = link.absUrl("href");

            if (!url.startsWith("http"))
                continue;

            if(url.contains("Search"))
                continue;

            if(url.contains("manufacture"))
                continue;

            if(title.isEmpty())
                continue;

            if (title.length() > 9){
                urlList.add(url);
                titleList.add(title);

            }
        }

        //Odd List
        for(Element p: priceOdd){
            String price = p.text();

            if(price.isEmpty())
                continue;

            if (price.length() < 13 ){
                if(price.contains("R")) {
                    priceList.add(price);
                }
            }
        }

        for (Element link : imageOdd) {
            String img = link.absUrl("src");

            if(img.contains("buttons"))
                continue;

            if(img.isEmpty())
                continue;

            imageList.add(img);
        }

        for (Element link : linksOdd) {
            String title = link.ownText();
            String url = link.absUrl("href");

            if (!url.startsWith("http"))
                continue;

            if(url.contains("Search"))
                continue;

            if (url.contains("manufacture"))
                continue;

            if(title.isEmpty())
                continue;

            if (title.length() > 9){
                urlList.add(url);
                titleList.add(title);

            }
        }

        ArrayList<CaCell> searchList = new ArrayList<>();
        for (int x = 0; x < priceList.size(); x++){
            CaCell c = new CaCell(titleList.get(x),urlList.get(x),priceList.get(x),imageList.get(x));
            if(x == 3)
                break;
            searchList.add(c);
        }
        return searchList;
    }
}
