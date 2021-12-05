package com.ashi.corepatherns.singleton.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.ashi.corepatherns.singleton.DateUtils;

public class SingletonTest {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		DateUtils  dataUtilisOne =  DateUtils.getInstance();
		DateUtils dataUtilisTwo =  DateUtils.getInstance();
		
		System.out.println("Sample Object compare test:- ");
		System.out.println(dataUtilisOne == dataUtilisTwo);
		
		synchroizedTestCase();
	}
	
	public static void synchroizedTestCase() throws FileNotFoundException, IOException, ClassNotFoundException {
		DateUtils  dataUtilisOne =  DateUtils.getInstance();
		ObjectOutputStream oo = new ObjectOutputStream(new 
				FileOutputStream(new File("/Users/ashishawasthi/Documents/singleton/dateutils.ser")));
		oo.writeObject(dataUtilisOne);
		DateUtils  dataUtilisTwo = null;
		
		ObjectInputStream ip = new ObjectInputStream(new 
				FileInputStream(new File("/Users/ashishawasthi/Documents/singleton/dateutils.ser")));
		dataUtilisTwo = (DateUtils)ip.readObject();
		dataUtilisTwo =  DateUtils.getInstance();
		System.out.println("Synchronized test:- ");
		System.out.println(dataUtilisOne == dataUtilisTwo);
		oo.close();
		ip.close();
	}

}
