package com.ashi.javaconcepts.generic;

public class GenericTest {

	public static void main(String[] args) {
		GenericClass<String, Integer> obj = new GenericClass<String, Integer>("Generic Class Example !", 100);

		obj.print();
	}
}
