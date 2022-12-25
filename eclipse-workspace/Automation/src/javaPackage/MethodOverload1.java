package javaPackage;

public class MethodOverload1 {
	int a =1, b=2, c=3;

		public void sum(int a, int b) {
			System.out.println(a+b);
			}
		public void sum(int a, int b, int c) {
			System.out.println(a+b-c);
		}
		
		public static void main(String[] args) {
			MethodOverload1 mo = new MethodOverload1();
			mo.sum(5, mo.b);
			mo.sum(2, 3, 6);
			
		}

}
