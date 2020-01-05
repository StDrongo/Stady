package com.SeleniumTests;

import java.util.concurrent.TimeUnit;

import javax.xml.soap.Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

//Open chrome browser
//Go to “https://the-internet.herokuapp.com/”
//Click on “Click on the “Dynamic Controls” link
//Select checkbox and click Remove
//Click on Add button and verify “It’s back!” text is displayed
//Close the browser 
public class IsDisplayed extends CommonMethods{
	
public static void main(String[] args) throws InterruptedException {
	
	setUp("firefox", "https://the-internet.herokuapp.com/");
	driver.findElement(By.linkText("Dynamic Controls")).click();
	driver.findElement(By.xpath("//div[@id='checkbox']//input")).click();
	driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebDriverWait isDisp = new WebDriverWait(driver, 30);
	isDisp.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@id='message']")));
	boolean disp = driver.findElement(By.xpath("//p[@id='message']")).isDisplayed();
	
	System.out.println(disp);
	Thread.sleep(3000);
	driver.close();
}
}
