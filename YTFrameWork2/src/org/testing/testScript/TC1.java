package org.testing.testScript;
import org.testing.base.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC1 extends BaseClass
{
	@Test
	public void Trending() throws InterruptedException
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
		driver.findElement(By.xpath(pr.getProperty("Treanding"))).click();
	
	}

}
