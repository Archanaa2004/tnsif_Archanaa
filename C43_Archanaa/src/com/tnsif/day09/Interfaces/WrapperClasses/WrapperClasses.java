package com.tnsif.day09.Interfaces.WrapperClasses;

public class WrapperClasses {

	public static void main(String[] args) {
		//Unboxing - converting explicitly
		Integer i= new Integer(10);
		System.out.println(i);
		int b= i.intValue(); // predifined 
		System.out.println(b);
		
	// without using intVal
	int c= i;
	System.out.println(c);
	
	//Autoboxing - Converting Implicitly
	int a=100;
	Integer i1=a;
	System.out.println(i1);
}
}