package javaPackage;

public class PyramidStar{
	
	static int i , j , row=5;
		
	public static void main(String[] args) {
		for (i=0; i< row; i++) {
			for (j = 2*(row-1);j >= 0; j-- )
			{
				System.out.print(" ");
			}
			for (j=0; j<=i; j++ )  
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

