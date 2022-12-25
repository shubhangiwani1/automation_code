package javaPackage;

import java.util.Arrays;

public class MergerArray {

	public static void main(String[] args) {
    int [] array1 = {9,4,5};
    int [] array2 = {6,25,8};
    
      
    System.out.println( "First array");
    
    for (int i= 0 ;i <array1.length ; i++)
    {
    	System.out.print(array1[i] +" ");
    }
    	System.out.println();
    System.out.println( "Second array");
    	
    	for (int j= 0 ;j <array2.length ; j++)
        {
        	System.out.print(array2[j] + " ");
        }
    
    	int length1=array1.length;
    	int length2 = array2.length;
    	 	
    	int [] result = new int [length1 + length2];
    	System.arraycopy(array1, 0, result, 0, length1);
    	System.arraycopy(array2, 0, result, length1, length2);
    	System.out.println("\nResulting array");
    	
    	System.out.println(Arrays.toString(result));
               	    	
        Arrays.sort(result);
        
        for (int o :result)
        {
        	 System.out.print(o +" ");
        }
       
       	
    }
		
	}


