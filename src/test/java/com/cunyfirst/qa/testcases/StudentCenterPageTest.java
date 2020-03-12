package com.cunyfirst.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cunyfirst.qa.base.TestBase;
import com.cunyfirst.qa.pages.HomePage;
import com.cunyfirst.qa.pages.LogInPage;
import com.cunyfirst.qa.pages.StudentCenter;
import com.cunyfirst.qa.util.TestUtil;

public class StudentCenterPageTest extends TestBase {

	LogInPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	StudentCenter studentCenter;
	public StudentCenterPageTest() {
		super();
	}
	

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		studentCenter = new StudentCenter();
		loginPage = new LogInPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	@Test(priority=1)
	public void verifyStudentCenterLinkTest() {
		studentCenter = homePage.clickOnStudentCenterLink(); 
	}

	@Test(priority=2)
	public void ClickOnMainMenuTest() {
		 studentCenter.ClickOnMainMen();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

	
	
