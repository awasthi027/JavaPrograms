package com.ashi.corepatherns.singleton;

import java.io.Serializable;

public class DateUtils implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static volatile DateUtils shared;

	// This is called egar inilialization. It will when being utiilize
	// private static DataUtilis shared = new DataUtilis();

	// Anotther way for static init. it will execute when class load

	static {
		shared = new DateUtils();
	}

	private DateUtils() {
	}
	// This will be thread safe
	public static DateUtils getInstance() {
		if (shared == null) {
			synchronized (DateUtils.class) {
				if (shared == null) {
					shared = new DateUtils();
				}
			}
		}
		return shared;
	}
	// avoid serilization
	private Object readResolve() {
		return shared;
	}
   
	// avoid cloning
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		throw new CloneNotSupportedException();
	}

}

// Implement Cloneable interface to avoid clone object by singelton class 
