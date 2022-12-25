package javaPackage;

public class Staticblockeg {
	static String abc;
	static int x;
	
 static {
	 abc = "java is fun";
	 x=100;
 }
 
 static {
	 abc = "shubh";
	 x=200;
 }
 
 
	public static void main(String[] args) {
		System.out.println(abc+x);

	}

}
