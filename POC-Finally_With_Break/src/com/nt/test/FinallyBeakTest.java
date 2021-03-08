package com.nt.test;

public class FinallyBeakTest {
	public static void main(String[] args) {
		System.out.println(m1());
		
	}
   static int m1() {
	   
	   try{
		   System.out.println("in outer try");
		   try{
			   System.out.println("inner try");
			   System.out.println(10/0);
		   }
		   catch(NullPointerException e) {
			   System.out.println("in inner catch");
		   } 
		   finally {
			   System.out.println("inner finally");
			   return 20;
		  }
		  //System.out.println("after inner try catch finally");
	   }
	   catch(ArithmeticException e) {
		   System.out.println("in outer catch");
	   }
	   finally {
		   System.out.println("outter finally");
		  
	  }
	 	 System.out.println("after outer try/catch/finally");
	    return 30;
   }
}
	   
	 