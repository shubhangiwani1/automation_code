package javaPackage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG4 {
	
	@BeforeClass
	
	public void m() {
		System.out.println("before class is executed");
	}

	@Test 
	
	public void a() {
		Assert.assertTrue(3==10);
	System.out.println("a method");
	
	}
	@Test
	public void c() {
		Assert.assertFalse(3>10);
	System.out.println("c method");
	
	}
	
	@Test(dependsOnMethods = {"a","c"})
	public void b() {
		
		System.out.println("b method");
		
		}
	
	@Test
	public void d() {
		
		System.out.println("d method");
	}
	
		
	
}
