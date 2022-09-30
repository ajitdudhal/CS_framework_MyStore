package com.mystore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
	//1. create object of webdriver
	WebDriver ldriver;

	//constructor
	public IndexPage(WebDriver rdriver)
	{
		ldriver = rdriver;


		PageFactory.initElements(rdriver, this);
	}


	//identify webelements
	@FindBy(linkText = "Sign in") 
	WebElement signIn;

	@FindBy(xpath="(//a[text()='T-shirts'])[2]")
	WebElement tshirtMenu;


	//identify action on webelement
	public void clickOnSignIn() {
		signIn.click();
	}

	public String getPageTitle()
	{
		return(ldriver.getTitle());
	}

	public void clickOnTShirtMenu()
	{
		tshirtMenu.click();
	}

}