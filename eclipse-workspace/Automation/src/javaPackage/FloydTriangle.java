package javaPackage;

import java.util.Scanner;
public class FloydTriangle {
   public static void main(String args[]){
	   
	   int n, num =1, c, d;
	   Scanner in = new Scanner(System.in);
	   System.out.println( "enter number of row for Floyd triangle");
	   
	   n= in.nextInt();
	   System.out.println("Floyd Triangle:-");
	   for (c=1; c<=n ; c++)
	   {
		   for (d=1; d<=c ; d++)
		   {
			   
		   System.out.print(num+ " ");
		   num++;
		   }
         System.out.println();
   }
}
}