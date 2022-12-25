package javaPackage;

public class MethodOverride2 extends MethodOverride1  {

		public void eat() {
			System.out.println("You are eating");
		}
		
			public void test() {
				System.out.println("mad");
			}
			
		

		public static void main(String[] args) {
			MethodOverride1 mo1 = new MethodOverride1();
			mo1.eat();
			// mo1.test(); not allowed
			
			MethodOverride2 mo2 = new MethodOverride2();
			mo2.eat();
			mo2.test();
			
			MethodOverride1 mo3 = new MethodOverride2(); //if use static then parent class method 
			//will be executed (it's called method hiding)
			mo3.eat();
			// mo3.test();not allowed
		}
	}


