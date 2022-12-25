package javaPackage;

public class MethodOverride4 extends MethodOverride3{
	
	public  void run() {
		System.out.println("You are running");
	}
	
	public static void main(String[] args) {
	
		MethodOverride4 mo4 = new MethodOverride4();
		mo4.run();
		
		MethodOverride3 mo3 = new MethodOverride3();
		mo3.run();
	
		//If you static run method then parent method will run//I am running
		MethodOverride3 m	=new MethodOverride4();
		m.run();

		
	}

}
