package com.ashi.corepatherns.template;

public class XMLDataRenderer extends DataRenderer {

	@Override
	public String readData() {
		return "XML data";
	}

	@Override
	public String processData(String data) {
		return "Proccessed" + data;
	}

}
