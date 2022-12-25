package javaPackage;

public class ReverseString2 {
	
	 public static void main(String args[]) {
		String s = "*shubhangi n**&";
		
		String reverse =  " ";
		s = s.replaceAll("[* &]", "");
		System.out.println("removed special char : " +s);

		for (int i=s.length()-1 ; i>=0 ;i--) {
			
			reverse = reverse+ s.charAt(i);
		
		}
		 System.out.println("reverse string is " +reverse);
		 

	}
}
