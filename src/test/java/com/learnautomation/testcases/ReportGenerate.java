package com.learnautomation.testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportGenerate 
{
	
	@Test
	public void test1()
	{
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter("./Reports/AutomationReport.html");
		
		sparkReporter.config().setDocumentTitle("Automation Report");
		
		sparkReporter.config().setReportName("Sprint 1 Report");
		
		sparkReporter.config().setTheme(Theme.DARK);
		
		ExtentReports report=new ExtentReports();
		
		report.attachReporter(sparkReporter);
		
		ExtentTest test1=report.createTest("Login Test");
		
		test1.info("Browser Started");
		test1.info("Application loaded");
		test1.pass("Login Successful");
		
		ExtentTest test2=report.createTest("Create Account");
		
		test2.info("Account Section Enabled");
		test2.info("New User Can Be Created");
		test2.fail("Account Creation Failed", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\l\\Desktop\\Screenshot_1692801512.png").build());
		
		ExtentTest test3=report.createTest("Make Payment");
		
		test3.skip("Payment Skipped");
		
		report.flush();
	}

}
