package javaPackage;

import org.testng.annotations.*;

public class TestNG1 {

	@Test
	public void a1() {

		System.out.println("Hellos a1 method");
	}
	@BeforeSuite 
	public void d() {
		System.out.println("d method");
	}
	
	@BeforeTest

	public void t() {
		System.out.println("t method");
	}
	@Test
	public void a2() {

		System.out.println("Hellos a2 method");
	}
	@Test
	public void a3() {

		System.out.println("Hellos a3 method");
	}

	@BeforeClass

	public void c() {
		System.out.println("c method");
	}

	@BeforeMethod

	public void e() {
		System.out.println("e method");
	}

	@AfterMethod

	public void k() {
		System.out.println("k method");
	}

	@AfterSuite

	public void s() {
		System.out.println("s method");


	}
}


