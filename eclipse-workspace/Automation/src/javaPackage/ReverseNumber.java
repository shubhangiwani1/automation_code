package javaPackage;

public class ReverseNumber {

	public static void main(String[] args) {

		int n = 2395, reverse =0;
		 while(n!=0)
		 {
			 reverse=reverse*10;
			 reverse=reverse+n%10;
			 n=n/10;
					 
					 }
		
	System.out.println(reverse);
		
	}
		}


