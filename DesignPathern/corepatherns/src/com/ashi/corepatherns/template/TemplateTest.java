package com.ashi.corepatherns.template;

public class TemplateTest {
    public static void main(String[] args) {
		DataRenderer dataRenderer = new XMLDataRenderer();
		dataRenderer.render();
		 dataRenderer = new CSVDataRenderer();
	 	dataRenderer.render();
	}
}
