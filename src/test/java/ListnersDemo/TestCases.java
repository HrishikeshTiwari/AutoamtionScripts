package ListnersDemo;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Listeners;		
import org.testng.annotations.Test;		

public class TestCases {				
WebDriver driver= new FirefoxDriver();					

// Test to pass as to verify listeners .		
@Test		
public void Login()				
{		
	 driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/V4/");
    driver.findElement(By.name("uid")).sendKeys("mngr34926");							
    driver.findElement(By.name("password")).sendKeys("amUpenu");							
    driver.findElement(By.name("btnLogin")).click();
    driver.quit();
}		

// Forcefully failed this test as to verify listener.		
@Test		
public void TestToFail()				
{		
    System.out.println("This method to test fail");					
    Assert.assertTrue(false);			
}		
}