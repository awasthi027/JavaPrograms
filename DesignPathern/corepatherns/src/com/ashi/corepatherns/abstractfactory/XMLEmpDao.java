package com.ashi.corepatherns.abstractfactory;

public class XMLEmpDao implements DAO{

	@Override
	public void save() {
		System.out.println("Saving employee in xml DB");
		
	}

}
