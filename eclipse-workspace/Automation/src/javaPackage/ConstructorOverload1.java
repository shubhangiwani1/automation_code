package javaPackage;

public class ConstructorOverload1 {
	
	 ConstructorOverload1(){
		System.out.println("No arg constructor dis");
	}
	
	ConstructorOverload1(int a){
		System.out.println("int arg constructor ");
	
	}
	ConstructorOverload1(String a){
		System.out.println("String arg constructor ");
	}
	ConstructorOverload1 (int a, int b){
		
		System.out.println("dual int constructor");
	}
	public static void main(String[] args) {
	
		
		ConstructorOverload1 co1 = new ConstructorOverload1();
		ConstructorOverload1 co2 = new ConstructorOverload1(5);
		ConstructorOverload1 co3 = new ConstructorOverload1("sham");
		ConstructorOverload1 co4 = new ConstructorOverload1(5,6);

	}

}
