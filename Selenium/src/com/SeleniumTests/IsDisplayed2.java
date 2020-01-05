package com.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

//Open chrome browser
//Go to “https://the-internet.herokuapp.com/”
//Click on “Click on the “Dynamic Controls” link
//Click on enable button
//Enter “Hello” and verify text is entered successfully
//Close the browser
public class IsDisplayed2 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		setUp("firefox", "https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Dynamic Controls')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Enable')]")).click();
		WebDriverWait dis = new WebDriverWait(driver, 10);
		dis.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
		driver.findElement(By.xpath("//form[@id='input-example']//input")).sendKeys("Hello");
		
		driver.findElement(By.xpath("//button[contains(text(),'Disable')]")).click();
		dis.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='input-example']//input")));
		boolean boo = driver.findElement(By.xpath("//p[@id='message']")).isDisplayed();
		System.out.println(boo);
		
		Thread.sleep(3000);
		driver.close();
		
		
		

	}

}
