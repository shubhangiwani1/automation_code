package javaPackage;

public class EH1 {

	public static void main(String[] args) {
	

		try {

			int a = 5/0;
		}
		catch (ArithmeticException e) {
			e.printStackTrace(); //give complete info
			System.out.println(e); //only exception info
		}
		catch (NullPointerException n) {
			System.out.println(n);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(a);
		}
		catch (Exception eq) {
			System.out.println(eq);
		}
		
		System.out.println("exception handled");
		
		try {
			int b = 10/0;
		}
		 catch (ArithmeticException a) {
			 a.printStackTrace();
			 
		 }
		finally {
			System.out.println("finally will execute always");
		}
	}

}
