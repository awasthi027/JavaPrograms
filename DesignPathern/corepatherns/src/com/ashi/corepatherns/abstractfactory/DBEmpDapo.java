package com.ashi.corepatherns.abstractfactory;

public class DBEmpDapo  implements DAO {

	@Override
	public void save() {
		System.out.println("Saving employee  in DB");
		
	}

}
