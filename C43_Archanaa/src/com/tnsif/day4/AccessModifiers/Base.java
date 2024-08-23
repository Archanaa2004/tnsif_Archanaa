package com.tnsif.day4.AccessModifiers;

public class Base {
	/*
	 * Declaring default, public, private and protected variables 
	 */
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	/*
	 * Declaring methods with default, public, private, protected types
	 */

	void methodDefault()
	{
		System.out.println("Default access Base class");
		System.out.println("Default Variable : "+varDefault);
	}
	
	public void methodPublic()
	{
		System.out.println("Public access Base class");
		System.out.println("Public Variable : "+varPublic);
	}
	
	private void methodPrivate()
	{
		System.out.println("Private access Base class");
		System.out.println("Private Variable : "+varPrivate);
	}
	
	protected void methodProtected()
	{
		System.out.println("Protected access Base class");
		System.out.println("Protected Variable : "+varProtected);
	}
	/* To use private method in same class
	 * public static void main(String[] args) {
	         Base b2=new Base();
	         b2.varPrivate=21; 
		     b2.methodPrivate();
*/
}
