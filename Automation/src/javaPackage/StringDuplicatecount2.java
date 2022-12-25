package javaPackage;

public class StringDuplicatecount2 {

	public static void main(String[] args) {

		String s = "abcdabcdaa";
		char a[] =s.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			
			int rc = 1;
			for(int j=i+1; j<a.length;j++) {
				
				if(a[i]==a[j]) {
					rc = rc+1;
					a[j]=0;
				}
			}
			if(a[i]!=0) {
				System.out.println(a[i] +" =repeated count"+rc);
				rc=1;
			}
		}
		
		
		
	}}
		