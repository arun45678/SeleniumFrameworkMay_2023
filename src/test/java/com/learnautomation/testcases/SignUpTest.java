package com.learnautomation.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.learnautomation.base.BaseClass;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.learnautomation.pages.SignPage;

public class SignUpTest extends BaseClass
{
	@Test(dataProvider = "signup",dataProviderClass = CustomDataProvider.class)
	//public void SingUpApps()
	public void SingUpApps(String fname,String email1,String password1,String interest1,String gender, String sta, String hobby)
	{
		SignPage sig=new SignPage(driver);
		
		sig.signUpApplication(fname, email1, password1, interest1, gender, sta, hobby);;
		
		
	}

}
