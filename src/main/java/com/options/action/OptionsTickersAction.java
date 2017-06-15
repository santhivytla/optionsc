package com.options.action;

//public class OptionsTickersAction


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.options.model.MessageStore;
import com.options.model.StrikeBean;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionSupport;
 
public class OptionsTickersAction extends ActionSupport {
 
    private static final long serialVersionUID = 1L;
 
    private StrikeBean strikeBean;
    private String tickersList;
    //private String selectedTicker = null;
    
	public String getTickersList() {
		return tickersList;
	}

	public void setTickersList(String tickers) {
		this.tickersList = tickersList;
	}
     
    public String execute() throws Exception {
    	
    	JSONParser jsonParser = new JSONParser();
    	JSONArray jsonarray = new JSONArray();

    	try {
    		
    		//System.out.println("Selected Ticker=="+selectedTicker);
    		//read expirations
    		//readExpirations(selectedTicker);
    		//JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("options1.txt"));
    		
    		
    		
    		 jsonarray.add("FB|Face Book");
    		 jsonarray.add("WFC|Wells Fargo & Company");
    		 jsonarray.add("GOOG|Alphabet Inc");
    		 jsonarray.add("LNKD|LinkedIn Corporation");
    		 jsonarray.add("F|Ford Motor");
    		 jsonarray.add("MCD|McDonald's");
    		 jsonarray.add("H|Hyatt Hotels Corporation");
    		 jsonarray.add("MSFT|Microsoft Corporation");
    		 jsonarray.add("AMZN|Amazon");
    		 
    		 jsonarray.add("EBAY|eBay Inc");
    		 
    		 jsonarray.add("BAC|Bank of America Corporation");
    		 
    		 jsonarray.add("HD|The Home Depot");
    		 
    		 jsonarray.add("AEO|American Eagle Outfitters");
    		 
    		 jsonarray.add("GPS|The Gap");
    		 
    		 
    		 
    		 System.out.println(jsonarray);
    		}
    		
    	catch (Exception e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    	/*JSONArray strikeArray=new JSONArray();
    	JSONObject jobj=new JSONObject();
    	jobj.put("name", "ashok");
    	jobj.put("phone", "6504388421");
    	strikeArray.add(jobj);
    	strikeBean = new StrikeBean(strikeArray) ;*/
    	strikeBean=new StrikeBean(jsonarray);
    	
    	Gson gson = new GsonBuilder().create();
    	tickersList = gson.toJson(jsonarray);
    	System.out.println("Expirations************"+tickersList);
    	
        return SUCCESS;
    }
 
    public StrikeBean getStrikeBean() {
        return strikeBean;
    }
 
    public void StrikeBean(StrikeBean strikeBean) {
        this.strikeBean = strikeBean;
    }
    
 
 
}

