package com.cunyfirst.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cunyfirst.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(id = "crefli_HC_SSS_STUDENT_CENTER")
	WebElement studentcenter;
	
	@FindBy(id = "crefli_CU_CS_SINGLELINK")
	WebElement campussolution;
	
	
	//initializing the page objects:
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
	
	public String verifyHomePageTitile() {
		return driver.getTitle();
	}
	
	public StudentCenter clickOnStudentCenterLink() {
		studentcenter.click();
		return new StudentCenter();
	}
	
	
		
	
}
