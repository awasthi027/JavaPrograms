package com.ashi.corepatherns.builder;

import com.ashi.corepatherns.builder.HTTPClient.HttpClientBuilder;

public class Test {

	public static void main(String[] args) {
		
	 HttpClientBuilder builder = new HttpClientBuilder();
	 builder.url("Url");
	 builder.method("POST");
	 builder.build();
	

	}

}
