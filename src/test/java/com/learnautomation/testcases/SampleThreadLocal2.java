package com.learnautomation.testcases;

import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;

public class SampleThreadLocal2 {

	public static void main(String[] args) {
		
		ThreadLocal<Integer> tl1=new ThreadLocal<Integer>();
		tl1.set(15);
		
		System.out.println(tl1.get());
		
		

	}

}
