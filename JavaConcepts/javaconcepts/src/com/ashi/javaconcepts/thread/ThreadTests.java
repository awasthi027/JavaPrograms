package com.ashi.javaconcepts.thread;

public class ThreadTests {
  
	public static void main(String[] args) {
		runThreadConcept();
		startThreadConcept();
		
	}
	
	public static void startThreadConcept() {
		System.out.println("=============startThreadConcept");
		MyThread newThread = new MyThread();
		newThread.start();
		
	}
	
	public static void runThreadConcept() {
		System.out.println("===============runThreadConcept");
		MyThread newThread = new MyThread();
		newThread.run();
		newThread.stop();
	}
}

class MyThread extends Thread {
	
    public void run()  {
        System.out.println("Current thread name: "
                           + Thread.currentThread().getName());
  
        System.out.println("run() method called");
    }
}