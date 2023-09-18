package com.learnautomation.sample;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener 
{
	public void onTestStart(ITestResult result) 
	{
		System.out.println("Test Started - OnTestStart Method");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped");
	}

	public void onStart(ITestContext context) {
		System.out.println("Test Started - onStart Method");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test Finised - onFinish Method");
	}
}
