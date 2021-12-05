package com.ashi.javaconcepts.objectreferencetypes;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.ref.ReferenceQueue;

public class MainClassTest {
	
    public static void main(String[] args) {
    
    	weakReferenceExample();
    	softReferenceExample();
    	phantomReferenceExample();
	}
    
    /* Strong References: This is the default type/class of Reference
     *  Object. Any object which has an active strong reference are not 
     *  eligible for garbage collection. The object is garbage collected only 
     * when the variable which was strongly referenced points to null.*/
    
    
    /* Weak References: Weak Reference Objects are not the default type/class 
     * of Reference 
     * Object and they should be explicitly specified while using them.
     * */
    public static void weakReferenceExample() {
   	 // Strong Reference 
        MainClass g = new MainClass();    
        g.message("Reference Strong"); 
          
        // Creating Weak Reference to MainClass-type object to which 'g'  
        // is also pointing. 
        WeakReference<MainClass> weakref = new WeakReference<MainClass>(g); 
        g = null;  
        g = weakref.get();  
        g.message("Weak Reference");
    }
    /* 
     * Soft References: In Soft reference, even if the object 
     * is free for garbage collection then also its not garbage collected, 
     * until JVM is in need of memory badly.The objects gets cleared from the
     *  memory when JVM runs out of memory.
     * To create such references java.lang.ref.SoftReference class is used.
     
     * */
    public static void softReferenceExample() {
    	 MainClass g = new MainClass();    
         g.message("Reference Strong==="); 
           
         // Creating Weak Reference to MainClass-type object to which 'g'  
         // is also pointing. 
         SoftReference<MainClass> softref = new SoftReference<MainClass>(g); 
         g = null;  
         g = softref.get();  
         g.message("Reference Soft"); 
    }
     /*
     * Phantom References: The objects which are being referenced
     *  by phantom references are eligible for garbage collection. But, before removing them from the memory, JVM puts them in a queue called ‘reference queue’ . 
     * They are put in a reference queue after calling finalize() 
     * method on them.To create such references java.lang.ref.PhantomReference class is used.
     **/
    
    public static void phantomReferenceExample() {
    	 // Strong Reference 
        MainClass g = new MainClass();    
        g.message("Reference Strong======="); 
          
        // Creating Phantom Reference to MainClass-type object to which 'g'  
        // is also pointing. 
        PhantomReference<MainClass> phantomRef = null; 
        ReferenceQueue< MainClass> refQueue = new ReferenceQueue<>();
		phantomRef = new PhantomReference<MainClass>(g,refQueue); 
        g = null; 
        g = phantomRef.get();  
        g.message("Reference Phantom======="); 
   }
}
