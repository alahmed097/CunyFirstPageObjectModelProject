package com.cunyfirst.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cunyfirst.qa.base.TestBase;
import com.cunyfirst.qa.pages.HomePage;
import com.cunyfirst.qa.pages.LogInPage;
import com.cunyfirst.qa.pages.StudentCenter;
import com.cunyfirst.qa.util.TestUtil;

public class HomePageTest extends TestBase  {

	LogInPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	StudentCenter studentCenter;
	public HomePageTest() {
		super();
	}
	
	//test cases should be separated -- independent with each other
	//before each test cases -- launch the browser and log in
	//@test -- execute test cases
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		studentCenter = new StudentCenter();
		loginPage = new LogInPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void verifyHomePageTitileTest() {
		String homePageTitle = homePage.verifyHomePageTitile();
		System.out.println(homePageTitle);
		Assert.assertEquals(homePageTitle, "Employee-facing registry content", "Home page title not matched");
	}
	
	@Test(priority=2)
	public void verifyStudentCenterLinkTest() {
		studentCenter = homePage.clickOnStudentCenterLink();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
