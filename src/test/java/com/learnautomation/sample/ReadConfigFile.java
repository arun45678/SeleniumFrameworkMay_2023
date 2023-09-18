package com.learnautomation.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {

	public static void main(String[] args) throws IOException {
		

		Properties pro=new Properties();
		
		pro.load(new FileInputStream(new File("./Config/Config.properties")));
		
		System.out.println(pro.getProperty("appURL"));
		
		System.out.println(pro.getProperty("headless"));
		
		System.out.println(pro.getProperty("pageLoadTimeOut"));
	
	}

}
