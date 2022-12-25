package javaPackage;

public class UniqueArrayelement {

	public static void main(String[] args) {
		
		int a[]= {2,5,3,4,4,3};
		
			
		for (int i=0;i<a.length ;i++) {
			int count=0;
			
			for (int j= 0 ;j<a.length; j++) {
				if (a[i] == a[j]) {
					count= count+1;
				}
			}
			if(count == 1)
				System.out.println(a[i] +" ");
			
			}
			
		}
			


	}
