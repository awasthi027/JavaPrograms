package com.ashi.javaconcepts.autobxing;

public class BoxingExample {
	
  public static void boxingExample() {
	  int a = 50;  
      Integer a2 = new Integer(a); //Boxing  
      Integer a3 = 5; //Boxing  
      
      System.out.println(a2+" "+a3);  
  }
}
