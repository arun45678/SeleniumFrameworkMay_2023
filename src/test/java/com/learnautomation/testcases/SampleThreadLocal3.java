package com.learnautomation.testcases;

import com.aventstack.extentreports.ExtentTest;

import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;

public class SampleThreadLocal3 {

	public static void main(String[] args) {
		
		ExtentTest test1=null;
		
		ThreadLocal<ExtentTest> tl1=new ThreadLocal<ExtentTest>();
		
		tl1.set(test1);

	}

}
