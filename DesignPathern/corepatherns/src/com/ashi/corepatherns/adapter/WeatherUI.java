package com.ashi.corepatherns.adapter;



public class WeatherUI {
	
    public static void showTemparature(int zipCode) {
    	WeatherAdapter wAdapter = new WeatherAdapter();
    	System.out.println(wAdapter.findTemperature(19406));
    	
    }
    
    public static void main(String[] args) {
	   showTemparature(19406);
	}
}
