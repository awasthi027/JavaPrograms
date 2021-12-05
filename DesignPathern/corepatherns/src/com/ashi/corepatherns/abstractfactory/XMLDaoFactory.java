package com.ashi.corepatherns.abstractfactory;

public class XMLDaoFactory extends DAOAbstractFactory {

	@Override
	public DAO createDAO(String type) {;
		DAO dao = null;
		if (type.equals("emp")) {
			dao = new XMLEmpDao();
		}else if (type.equals("dept")) {
			dao = new XMLDeptDao();
		}
		return dao;
	}

}
