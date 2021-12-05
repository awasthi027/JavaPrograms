package com.ashi.corepatherns.abstractfactory;

public class DaoFactory extends DAOAbstractFactory {

	@Override
	public DAO createDAO(String type) {;
		DAO dao = null;
		if (type.equals("emp")) {
			dao = new DBEmpDapo();
		}else if (type.equals("dept")) {
			dao = new DBDeptDapo();
		}
		return dao;
	}

}
