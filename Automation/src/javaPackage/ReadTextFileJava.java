package javaPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadTextFileJava {

	public static void main(String[] args) throws Exception {
		
	FileReader fr = new FileReader("C:\\D Drive\\Personal\\abc.txt.txt");	
	
	BufferedReader br = new BufferedReader(fr);
	
	String s ;
	
	while((s=br.readLine())!= null) {
		
		System.out.println(s);
				
	}

	FileWriter fw = new FileWriter("C:\\D Drive\\Personal\\abc.txt.txt");
	
	String text = "Computer Science Portal GeeksforGeeks aa";
	
	fw.write(text);
	fw.close();
	
	System.out.println("File is created successfully with the content");
	
		 
	}}
