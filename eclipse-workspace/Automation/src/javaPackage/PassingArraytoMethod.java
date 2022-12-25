package javaPackage;

public class PassingArraytoMethod {

	public static void PassingArray (int a []) {
	
	int b = a[0];
	for (int i =0 ; i< a.length; i++) {
		if (b>=a[i])
		{
			System.out.println(b);
		}
		else
		{
			System.out.println("ABCD") ;
		}
	}
	}
		
	public static void main(String[] args) {
	int c[] = {22,2,44,5};
	PassingArray(c);

	}
	}


