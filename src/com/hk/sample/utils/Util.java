package com.hk.sample.utils;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Util{
	
	public static String getURLContent(){
		
			
		
		
		return null;
	}
	
	
	public  static void main (String[] args)throws IOException {
		
		
		String url = "http://www.wiziwig.tv/competition.php?part=sports&competitionid=2&discipline=Football";
		
		 Document doc = Jsoup.connect(url).get();
		 
		 Elements trs = doc.select("tr");
		 
		 for(Element tr: trs){
			 //System.out.println(tr.text());
			 if(tr.text().contains("Manchester United vs. Chelsea")){
				 Elements urls = tr.getElementsByAttribute("href");
				 for (Element urlName: urls){			 
					// System.out.println(urlName.text());
					 if(urlName.text().equalsIgnoreCase("live")){
						 System.out.println( urlName.attr("abs:href"));
					 }
				 }
				 
			 }
		 }
		 
	}
}