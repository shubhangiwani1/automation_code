package javaPackage;

public class UnaryOperator {

	public static void main(String[] args) {
		int a =10;
		int b =11;
		
		System.out.println(a++);
		System.out.println(a);
		System.out.println(a--);
		System.out.println(a);
		System.out.println(++a + b++);//11 11 11 12
		System.out.println(b-- + --b);//12 11 10 10
		System.out.println(--b + --b);//9 9 8 8
				

	}

}
