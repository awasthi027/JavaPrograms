package com.ashi.corepatherns.abstractfactory;

public class DBDeptDapo  implements DAO {

	@Override
	public void save() {
		System.out.println("Saving department in DB");
		
	}

}
