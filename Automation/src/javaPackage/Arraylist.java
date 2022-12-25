package javaPackage;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		 ArrayList<String> al= new ArrayList<String> ();
		  
		  al.add("one");
		  al.add("two");
		  	
		  for(int i =0; i<al.size();i++)
			System.out.println(al.get(i));
		}
	}

