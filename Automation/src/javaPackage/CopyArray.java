package javaPackage;

public class CopyArray {

	public static void main(String[] args) {
   int []a = {5,6,7,8};
   int []b = new int [a.length];
   
   b =a ;
   System.out.println("first array");
   
   for (int i =0; i<a.length;i++)
   {
    System.out.print(a[i]+ " ");
	      }
   
   System.out.println("\ncopied array");
   
   for (int k =0; k<b.length;k++)
   {
	   System.out.print(b[k]+ " ");
   }
	}
}
