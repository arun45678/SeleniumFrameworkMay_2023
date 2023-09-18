package com.learnautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.learnautomation.helper.Utility;

public class SignPage {

	WebDriver driver;
	
	public SignPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By newuser=By.xpath("//a[normalize-space()='New user? Signup']");
	private By name=By.xpath("//input[@id='name']");
	private By email=By.xpath("//input[@id='email']");
	private By pass=By.xpath("//input[@id='password']");
	private By inte=By.xpath("//label[normalize-space()='Web Development']");
	//private By inte1=By.xpath("//label[normalize-space()='Automation Testing']");
	//private By gen=By.id("gender1");
	private By  state=By.xpath("//select[@id='state']") ;
	private By  hob=By.xpath("//select[@name='hobbies']") ;
	private By signupbtn=By.xpath("//button[normalize-space()='Sign up']");	
	public void signUpApplication(String fname,String email1,
			String password1,String interest1,String gender, String sta, String hobby)
	
	{
		Utility.waitForElement(driver, newuser).click();
		Utility.waitForWebElement(driver, name).sendKeys(fname);
		Utility.waitForElement(driver, email).sendKeys(email1);
		Utility.waitForElement(driver, pass).sendKeys(password1);
		//Utility.waitForElement(driver, inte).sendKeys(interest1);
		Utility.interstSelection(driver, interest1);
		//Utility.waitForElement(driver, null).click();
		//Utility.simpleClick(driver, inte, interest1);
		//Utility.waitForElement(driver, gen).sendKeys(gender);
		Utility.genderSelection(driver,gender);
		Utility.selectvalueFromDropdown(driver, state, sta);;
		Utility.scrollPage(driver);
		//Utility.multipleSelection3(driver);
		Utility.multipleSelection(driver, hob, hobby);
		Utility.waitForElement(driver, signupbtn).click();
		
		
		
	}
	
	
}
