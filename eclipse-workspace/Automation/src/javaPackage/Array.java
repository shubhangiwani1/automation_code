package javaPackage;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

 int a [] = {45,2,3,4,5};
 
 System.out.println("length of array is " +a.length);
 
 System.out.println(a[2]);
 a[2] =23;
System.out.println(a[2]);
 
  for (int i =0 ;i< a.length;i++)
  {
   System.out.print(a[i] +" ");
   
   	}
  System.out.println("\nResulting array");
 Arrays.sort(a);
  for (int k: a)
  {
	  System.out.print(k +" ");
  }
 
	
}}