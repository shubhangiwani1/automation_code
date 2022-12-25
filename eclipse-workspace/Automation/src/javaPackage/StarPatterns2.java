package javaPackage;

public class StarPatterns2{
	
	static int i , j , row=5;
		
	public static void main(String[] args) {
		for (i=1; i<=row; i++) {
			for (j = 1;j <= i; j++ )
			{
				System.out.print("*");
			}
	System.out.println();
		}
	}
}

