package com.flipkart.reusableComp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReusableComp {
	
	WebDriver driver = null;
	WebElement element = null;
	
	public void initiateBrowser()
	{
		driver =new FirefoxDriver();
		driver.get("https://www.flipkart.com");
	}
	
	public void click(By element)
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(element).click();
	}
	
	public void clearAndSendText(By element, String Text)
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(element).clear();
		driver.findElement(element).sendKeys(Text);
	}
}
