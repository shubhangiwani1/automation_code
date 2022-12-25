package javaPackage;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG3 {
   //test will be skip
	@Test(invocationCount = 2, priority = -2, enabled = false)
	
	public void a() {
		System.out.println("a method");
	}
	// enabled = false& invocationCount 0 will skip the method
	@Test (enabled = false)
	
	public void b() {
		
		System.out.println("b method");
			}
	
  @Test (invocationCount = 0) 
	
	public void c() {
		
		System.out.println("c method");
			}
  @BeforeMethod
  
  public void d() {
		
		System.out.println("Before method");
  
  
}
 @AfterMethod
  
  public void e() {
		
		System.out.println("After method");
  
}
 @Test
 public void f() {
	 System.out.println("e test method");
	 throw new SkipException ("skipping f test");
	 
	 
 }
 @Test
 public void h() {
	 System.out.println("h test method");
 
}}
 
