package javaPackage;

import java.util.HashSet;

public class Duplicateelementinstring {

	public static void main(String[] args) {
		
	String s ="shubhangi";
	String words [] = s.split("");
	
	for(int i =0; i<words.length; i++) {
		
		for(int j = i+1; j<words.length ;j++) {
			
			if (words[i].equals(words [j])) {
				
			System.out.println(words[i]);
			}
		}
	}
		
		
}
}