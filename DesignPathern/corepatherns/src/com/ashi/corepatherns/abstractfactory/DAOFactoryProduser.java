package com.ashi.corepatherns.abstractfactory;



public class DAOFactoryProduser {
	
	
	public static DAOAbstractFactory produse(String factoryType) {
		DAOAbstractFactory daf = null;
		if (factoryType.equals("xml")) {
			daf = new XMLDaoFactory();
		}else if (factoryType.equals("db")) {
			daf = new DaoFactory();
		}
		return daf;
	}
	

}
