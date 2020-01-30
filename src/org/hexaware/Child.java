package org.hexaware;

public class Child extends Parent {

	public void method3() {
		System.out.println("CHILAX");
	}
	public void method4() {
System.out.println("VINO");

	}
	public static void main(String[] args) {
		Child obj =new Child();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		
	}
	
	
	
}
