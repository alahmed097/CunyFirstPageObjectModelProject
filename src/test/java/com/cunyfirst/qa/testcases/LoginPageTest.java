package com.cunyfirst.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cunyfirst.qa.base.TestBase;
import com.cunyfirst.qa.pages.HomePage;
import com.cunyfirst.qa.pages.LogInPage;

public class LoginPageTest extends TestBase {
	LogInPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}

	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LogInPage();
		
	}
	
	@Test(priority=1)
	public void loginPageTittleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "CUNY Login");
	}
	
	@Test(priority=2)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
		
}
