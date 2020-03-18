package org.testing.base;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass
{
	
	public ChromeDriver driver;
	public Properties pr;
	@BeforeMethod
	public void browseLaunch() throws IOException
	{ 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\java\\chromedriver.exe");
        driver=new ChromeDriver();
		File f=new File("../YTFrameWork2/ObjecrRepo.properties");
		FileInputStream fi=new FileInputStream(f);
		pr=new Properties();
		pr.load(fi);
		
       driver.get(pr.getProperty("url"));
		//driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("ClickOnSignOut"))).click();
		//driver.findElement(By.xpath("ClickOnSignOut]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("SignOut")).click();
		driver.findElement(By.xpath(pr.getProperty("SignOut"))).click();
	    driver.quit();
	}


}
