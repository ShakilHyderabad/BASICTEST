package com.nt.test;

public class Test {
	public static void main(String[] args) {
		
	
	
		int a;

	try {
		a=10;
		
	}
 catch(ArithmeticException e) {
	 a=20;

 }
	finally {
		a=30;
		System.out.println("Finally with updated just");


		System.out.println("its conflicts...its abcd");


	}
	
	System.out.println("last conflicats....");
	
	System.out.println(a);	
	System.out.println("updated");
	
	
}
}