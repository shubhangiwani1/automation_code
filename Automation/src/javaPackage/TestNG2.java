package javaPackage;

import org.testng.annotations.Test;

public class TestNG2 {

	@Test
	public void a() {
		System.out.println("a mehtod");
	}

	@Test 
	public void b() {

		System.out.println("b method");
	}
	@Test(priority = 0)

	public void c() {

		System.out.println("c method");
	}

	@Test (priority = 0)

	public void d() {

		System.out.println("d method");
	}
	
		
}
