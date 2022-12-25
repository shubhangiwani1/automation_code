package javaPackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreatenewFile {

	public static void main(String[] args) throws IOException {
		File obj = new File("C:\\Users\\shubh\\AACCCCp.txt");
		
		try {
			if (obj.createNewFile()) {
				
				System.out.println("file created" +obj.getName());
			}
			
			else {
				System.out.println("operation failed");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		//write to file
		
		FileWriter myobj = new FileWriter("C:\\Users\\shubh\\AACCCCp.txt");
		myobj.write("Java is fun");
		myobj.close();
		
		
	}
	
	

}
