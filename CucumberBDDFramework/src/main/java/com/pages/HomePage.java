package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.util.Testbase;

public class HomePage extends Testbase{
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()= 'Home']")
	public WebElement homePageTitle;
	
		
	@FindBy(xpath="//span[text()= 'Anita Kumari Shaw']")
	public WebElement verifyUserName;
	
	@FindBy(linkText="Contacts")
	public WebElement contactsLink;
	
	
	
	
	public void getHomepageTitle() {
		String getTitle = homePageTitle.getText();
	}
	
	public void verifyHomePageTitle() {
		String actualHomePageTitle=driver.getTitle();
		Assert.assertEquals("Cogmento CRM", actualHomePageTitle);
		
	}
	
	public boolean corretUserName() throws InterruptedException {
		Thread.sleep(2000);
		String name = verifyUserName.getText();
		System.out.println(name);
		return verifyUserName.isDisplayed();
	}
	
	public ContactsPage clickContactsLink() {
		contactsLink.click();
		return new ContactsPage();
	}
	

	/*public DealsPage clickContactsLink() {
		contactsLink.click();
		return new DealsPage();
	}*/
	

}
