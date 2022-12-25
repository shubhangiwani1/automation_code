package javaPackage;

public class StringliteralOperations {

	public static void main(String[] args) {
		String a = "Hello";//String literal - go in string pool
		String b="Hello";
		String c= new String("Hello");
		
		System.out.println(a==b);  //true
		System.out.println(a.equals(b));//true
		
		a.concat("Java");
		System.out.println(a);//Hello
		
		a=a.concat("java");
		System.out.println(a);//Hellojava
		
		int length = a.length();
		System.out.println(length);
		
	System.out.println(a==c);//false
	System.out.println(a.equals(c));//false
	
	
	
	


	}

}
