package javaPackage;

public abstract class AbstractClass1 {
	static int a =5; //static variable
	int b = 7;       //global variable
	final int c = 10;//final variable
	
	// default constructor
	AbstractClass1(){
		System.out.println("Hello abstract class");
	}
	//abstract method
	abstract void eat();
	
	//non abstract method
	public void abc() {
		System.out.println("hello non abstract method");
	}
	
		

	

}
