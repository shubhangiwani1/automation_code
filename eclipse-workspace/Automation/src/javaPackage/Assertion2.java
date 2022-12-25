package javaPackage;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 {
	
	@Test
	public void testcase() {
		int i = 30;
		int j = 30;
		try {
		
			Assert.assertTrue(i>j);
		}
		
		catch (Error a){
			a.printStackTrace();
			
		}
		System.out.println("Assertion check");
	}

}
