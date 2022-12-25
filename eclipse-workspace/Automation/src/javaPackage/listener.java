package javaPackage;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("*****started"+result.getName());
		
		
	}



}
