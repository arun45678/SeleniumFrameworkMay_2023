package com.learnautomation.testcases;

public class SampleThreadLocal {

	public static void main(String[] args) {
		
		ThreadLocal<String> tl1=new ThreadLocal<String>();
		tl1.set("Trina");
		
		ThreadLocal<String> tl2=new ThreadLocal<String>();
		tl2.set("Riddhi");
		
		ThreadLocal<String> tl3=new ThreadLocal<String>();
		tl3.set("Mahendra");
		
		System.out.println(tl3.get());
		
		

	}

}
