package com.tnsif.day06.Inheritance;

public class A {
	    void show() {
			System.out.println("I'm a parent");
		}
	public static class A1 extends A{
		public void demo() {
				System.out.println("I'm a child");
			}
	}
	public static void main(String[] args) {
		A1 obj=new A1();
			obj.demo();
			obj.show();
		}
	}

