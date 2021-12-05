package com.ashi.corepatherns.abstractfactory.test;

import com.ashi.corepatherns.abstractfactory.DAO;
import com.ashi.corepatherns.abstractfactory.DAOAbstractFactory;
import com.ashi.corepatherns.abstractfactory.DAOFactoryProduser;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		DAOAbstractFactory daf  = DAOFactoryProduser.produse("xml");
	     DAO  dao = daf.createDAO("emp");
	     dao.save();
	}
}
