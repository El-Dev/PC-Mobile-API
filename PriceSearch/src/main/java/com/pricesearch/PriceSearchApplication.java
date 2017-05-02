package com.pricesearch;

import com.pricesearch.service.CaCellService;
import com.pricesearch.service.DionwiredService;
import com.pricesearch.service.GameService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class PriceSearchApplication extends SpringBootServletInitializer {

	@Bean
	public CaCellService caCellService(){return new CaCellService();}

	@Bean
	public GameService gameService(){return new GameService();}

	@Bean
	public DionwiredService dionwiredService(){return new DionwiredService();}

	public static void main(String[] args) throws Exception{

//		final String link = "http://www.dionwired.co.za/default-category/cellular-tablet/mobile-phones/apple-iphone-6s-64gb-space-grey.html";
//		Document document = Jsoup.connect(link).get();
//		Elements desc = document.select("div.product-collateral div.std");
//
//
//		ArrayList<String> detailList = new ArrayList<>();
//		for(Element d : desc){
//			String details = d.text();
//			detailList.add(details);
//		}
//
//		for(int i = 0; i < detailList.size(); i++)
//			System.out.println(detailList.get(i));

		SpringApplication.run(applicationClass, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(applicationClass);
	}

	private static Class<PriceSearchApplication> applicationClass = PriceSearchApplication.class;
}
