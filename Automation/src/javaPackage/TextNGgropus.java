package javaPackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TextNGgropus {

	@Test (groups = {"demo"})
	public void a1() {

		System.out.println("Hellos a1 method");
	}
	
	@Test (groups = {"demo"})
	public void a2() {

		System.out.println("Hellos a2 method");
	}
	
	@Test(groups = {"demo2"})
	public void a3() {

		System.out.println("Hellos a3 method");
	}
	
	@Test (groups = {"demo2"})
	public void a4() {

		System.out.println("Hellos a4 method");
}}
