package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.Testbase;

public class LoginPage extends Testbase {
	
		
	//initialise the page objects
	public LoginPage() {
		//PageFactory.initElements(driver, LoginPage.class); another way
		//super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="email")
	public WebElement userName;
	
	@FindBy(name="password")
	public WebElement passWord;
	
	@FindBy(xpath="//div[text()='Login']")
	public WebElement loginButton;
	
	
	//methods
	public void clickLoginButton() {
		//util.waitForElementVisible(loginButton);
		loginButton.click();
	}
	
	public void enterUserName(String uName) {
		//util.waitForElementVisible(userName);
		userName.sendKeys(uName);
	}
	
	
	public void enterPassword(String pwd) {
		//util.waitForElementVisible(passWord);
		passWord.sendKeys(pwd);
	}
	
	
	public void enterCredentials(String uName, String pwd) {
		enterUserName(uName);
		enterPassword(pwd);
					
	}
	
	

}
