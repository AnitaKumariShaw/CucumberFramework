package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.util.Testbase;

public class ContactsPage extends Testbase {
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="first_name")
	public WebElement firstName;
	
		
	@FindBy(name="last_name")
	public WebElement lastName;
	
	@FindBy(xpath="//a[@href= '/contacts/new']/button[text()='New']")
	public WebElement newLink;
	
	@FindBy(name="position")
	public WebElement positionField;
	
	@FindBy(xpath="//button[text()='Save']")
	public WebElement save;
	
	
	@FindBy(xpath="//div[text()='Contacts']")
	public WebElement contactsPageTitle;
	
	
	@FindBy(xpath="")
	public WebElement newCreatedContactTitle;
	
	@FindBy(xpath="//div[text()='Create New Contact']")
	public WebElement createNewContactPageTitle;
	
	
	public void verifyContactsPage() {
		String pageTitle =contactsPageTitle.getText();
		System.out.println(pageTitle);
		Assert.assertEquals("Contacts", pageTitle);
	}
	
	public void clickNewButton() {
		newLink.click();	
	}
	
	public void verifyCreateNewContactPage() {
		String pageTitle =createNewContactPageTitle.getText();
		System.out.println(pageTitle);
		Assert.assertEquals("Create New Contact", pageTitle);
	}
	
	public void enterNewContactDetails(String fName, String lName, String position) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		positionField.sendKeys(position);
	}
	
	public void clickSaveButton() {
		save.click();
	}
	
	/*public void verifyNewCreatedContact()
	{
		String xpath="//div[text()='nita sah']";
		newCreatedContactTitle.findElement(by)
	}*/
	
	
	
	

}
