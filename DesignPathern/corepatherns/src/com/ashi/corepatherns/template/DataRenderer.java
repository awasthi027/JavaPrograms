package com.ashi.corepatherns.template;

public abstract class DataRenderer {

	public void render() {
		String data = readData();
		processData(data);
		System.out.println(data + " has been proccessed.....");
		
	}
	public abstract String readData();
	public abstract String processData(String data);
	
}
