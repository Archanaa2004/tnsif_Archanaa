package com.tnsif.day07.Keywords.StaticAbstractFinal;
class Demo { //final class
	//final String name="archanaa"; //final variable
	final void show() {  //final method
		System.out.println("final statement");
	}
}
class dance extends Demo{
	void pick() {
		System.out.println("write");
	}
}
class Play extends dance{
	void dance() {
		System.out.println("print");
	}

public class Manager {

	public static void main(String[] args) {
		Play obj=new Play();
		obj.pick();
		obj.dance();
		obj.show();
	}
}
}

