package com.util;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities extends Testbase{

	public WebDriver driver;
	public WebDriverWait wait;

	public void implicitWaitTime(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}

	public boolean waitForElementVisible(WebElement element) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
//		} catch (TimeoutException e) {
//			e.getMessage();
//			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.getMessage();
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		return true;
	}

	

}
