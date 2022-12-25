package javaPackage;



public class DuplicatefromArray {
	 

	public static void main(String[] args)  {
		
		String [] a = {"this","this","is","even","is"};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i].equals(a[j])){
					System.out.println(a[i]);
				}
						
			}
		}
		
	}

	}





