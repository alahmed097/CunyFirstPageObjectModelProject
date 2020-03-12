package com.cunyfirst.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cunyfirst.qa.base.TestBase;

public class StudentCenter extends TestBase{

	@FindBy(id = "pthnavbca_PORTAL_ROOT_OBJECT")
	WebElement MainMenu;
	
	public void ClickOnMainMen () {
		MainMenu.click();
		
	}
	
	
}
