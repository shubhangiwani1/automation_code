package javaPackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSet_try {

	public static void main(String[] args) {
		 
	
		
		String[] str = {"abc", "def", "mno", "xyz", "pqr", "xyz","abc"};
			Set<String> hs = new HashSet<String>();
		 for (int i=0;i< str.length ;i++)
		 {
//		 if(!hs.add(str[i])){
//					 	
//		System.out.println("Duplicate Element is : "+str[i]);
		
		 if(hs.add(str[i])){
			 
			 	
				System.out.println("Duplicate Element is : "+str[i]);
		
		 }
		 }
		 }
		}