package javaPackage;

public class StringobjectOperations2 {

	public static void main(String[] args) {	
	
		
		String a = new String("Hello") ;
		String b= new String("Hello");//String object - stored in heap area
		
		System.out.println(a==b); //false
   	System.out.println(a.equals(b));//true
		
   	a.concat("Java");
 	System.out.println(a);//Hello
		
		a=a.concat("java");
		System.out.println(a);//Hello java
		


	
	}

}
