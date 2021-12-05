package com.ashi.javaconcepts.stringpool;

public class StringPool {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");

		System.out.println("s1 == s2 :" + (s1 == s2)); // true
		System.out.println("s1 == s3 :" + (s1 == s3)); // false

	}

}
