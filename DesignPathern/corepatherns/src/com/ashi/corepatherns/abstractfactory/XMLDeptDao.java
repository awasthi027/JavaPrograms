package com.ashi.corepatherns.abstractfactory;

public class XMLDeptDao implements DAO {

	@Override
	public void save() {
		System.out.println("Saving department in xml DB");
		
	}

}
