package javaPackage;

public class Static2 {

	public static void main(String[] args) {
		
		static1 obj = new static1(1, "Ram");
		static1 obj2 = new static1(2, "Peter");
		
		obj.college = "SSVPS";
		obj.abc();
		obj2.abc();
		
		
	}

}
