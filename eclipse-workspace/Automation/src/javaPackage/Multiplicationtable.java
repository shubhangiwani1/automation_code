package javaPackage;

import java.util.Scanner;

public class Multiplicationtable {
	
	static int  n;
	
	
	
	public static void main(String[] args) {
		 System.out.println("enter number to get it's table");
		 Scanner in= new Scanner(System.in) ;
		 n = in.nextInt();
		 
		 for (int i =0; i<=10;i++)
		 {
			 System.out.println("multiplication table " +(n*i));
			
		 }
		 
		 
	}



}
