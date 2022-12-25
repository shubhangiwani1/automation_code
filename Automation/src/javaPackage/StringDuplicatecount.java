package javaPackage;

public class StringDuplicatecount {

	public static void main(String[] args) {

		String s = "this this is a shree shree";
		String a[] =s.split(" ");

				
		for (int i =0; i<a.length;i++) {
			int wrc = 1;
			for (int j= i+1; j<a.length; j++) {
				if (a[i].equals(a[j])) {
					wrc = wrc+1;
					a[j]= "0";
				}
				
			}
			if (a[i]!= "0") {
				System.out.println(a[i] +"---"+wrc);
				wrc=1;
			}
		}
	}
}
