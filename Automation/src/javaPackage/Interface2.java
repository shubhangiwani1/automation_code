package javaPackage;

public class Interface2 implements Interface1{
	
	public void a() {
	 System.out.println("a method");
	}
	public static void main(String[] args) {
		
		Interface2 i2 = new Interface2();
		i2.a();
		
		Interface1 i3 = new Interface2();
		i3.a();
		
		
	}

}
