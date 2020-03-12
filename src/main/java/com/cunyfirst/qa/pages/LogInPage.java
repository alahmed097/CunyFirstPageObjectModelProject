package com.cunyfirst.qa.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import com.cunyfirst.qa.base.TestBase;

public class LogInPage extends TestBase {

	//page Factory - OR:
	@FindBy(name="usernameH")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="submit")
	WebElement loginBtn;
	
	@FindBy(xpath="//input[contains(text(),'New User')]")
	WebElement NewUser;
	
	
	//initializing the page objects:
	public LogInPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}
	
	
}
