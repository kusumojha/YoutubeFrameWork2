package org.testing.testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.base.BaseClass;
import org.testng.annotations.Test;
//not able to click on subscribe
public class TC4 extends BaseClass
{
	@Test
	public void videoplay_subscribe() throws InterruptedException
	{

		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("ClickOnSignIn"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("userNameAttribute"))).sendKeys(pr.getProperty("UserName"));//username
		
		driver.findElement(By.xpath(pr.getProperty("ClickNext"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("PasswordAttribute"))).sendKeys(pr.getProperty("Password"));//pwd
		driver.findElement(By.xpath(pr.getProperty("ClickNextPwd"))).click();
		
		Thread.sleep(3000);
	
		List<WebElement> ls=driver.findElements(By.id(pr.getProperty("video")));//video play
		System.out.println("total video"+ls.size());
		ls.get(1).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("SubscribeChannel"))).click();
	}
	

}
