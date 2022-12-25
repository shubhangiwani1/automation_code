package javaPackage;

public class MethodOverload4 extends MethodOverload3{

	public static void main(String[] args) {
		System.out.println(MethodOverload3.add(5, 9));
		System.out.println(MethodOverload3.add(8, 9, 1));
		
		System.out.println(MethodOverload4.add(9, 10));
		System.out.println(MethodOverload4.add(1, 1, 1));
		
	}

}
