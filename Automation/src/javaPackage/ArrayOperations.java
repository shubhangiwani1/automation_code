package javaPackage;
import java.util.Arrays;
public class ArrayOperations {

	public static void main(String[] args) {
		 int []a = {10,6,7,8};
		 
		 for (int k : a)
		 {
			 System.out.print(k +" ");
		 }
		 
	for (int i =0; i< a.length;i++)
	{
		System.out.print(a[i] +" ");
	}
		 
	System.out.println(Arrays.toString(a));
	
	int m [] [] = {{1,2,6},{3,4,5}};
	
	System.out.println(Arrays.deepToString(m));
	
	for (int i = 0; i<m.length;i++)
	{
		for (int j=0;j<m[0].length;j++)
		{
			System.out.print(m[i][j] +" ");
			}
	
		System.out.println();
	}
	
	String [] s = {"abc", "sham"};
	
	for (String d :s)
	{
		System.out.println(d);
	
	}
	String [] [] p = {{"pad", "tall"}, {"cat","dog"}};
  
	
	System.out.println(Arrays.deepToString(p));
 
	}
}

	














	
	

