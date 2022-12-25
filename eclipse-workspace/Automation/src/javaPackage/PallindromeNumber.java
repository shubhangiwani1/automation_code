package javaPackage;


public class PallindromeNumber {


	public static void main(String[] args) {
	
	
		int temp, sum=0, rem;
		
		int num = 25;
		
		temp=num;
		
		while(num>0) {
			
			rem = num%10;
			sum = (sum*10)+rem;
			num = num/10;
		}

		if(temp == sum) {
			System.out.println("number is pallindrome");
		}
		else {
			System.out.println("number is not pallindrome");
		}
	}}
	
