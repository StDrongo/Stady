package com.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utils.CommonMethods;

public class InputForm extends CommonMethods{
	public static final String Url = "http://jiravm.centralus.cloudapp.azure.com:8081/";
	public static void main(String[] args) throws InterruptedException {
	
	CommonMethods.setUp("firefox", Url);
	driver.get(Url);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Input Forms')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Simple Form Demo')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Hello World");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();
	Thread.sleep(2000);
	WebElement mess = driver.findElement(By.xpath("//span[@id='display']"));
	System.out.println(mess.getText());
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("2");
	driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("4");
	mess = driver.findElement(By.xpath("//span[@id='displayvalue']"));
	driver.findElement(By.xpath("//button[contains(text(),'Get Total')]")).click();
	Thread.sleep(2000);
	System.out.println(mess.getText());
	
	
	
	
	
	
	
	
	driver.close();
		
		
		
		
		
		
		
		
	}

}
