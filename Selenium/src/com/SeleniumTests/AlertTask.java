package com.SeleniumTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class AlertTask extends CommonMethods{
	public static final String SYNTAX_PRACTICE_URL = "http://jiravm.centralus.cloudapp.azure.com:8081/";
	public static void main(String[] args) throws InterruptedException {
		
	CommonMethods.setUp("firefox", SYNTAX_PRACTICE_URL);
	driver.get(SYNTAX_PRACTICE_URL);
	driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Alerts & Modals')]")).click();
	driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Javascript Alerts')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	Alert alert = driver.switchTo().alert();	
	Thread.sleep(2000);
	if (alert.getText().equals("I am an alert box!")) {
		alert.accept();
	}else {
		System.out.println("something wrong");
	}
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][contains(text(),'Click me!')]")).click();
	System.out.println(alert.getText());
	driver.switchTo().alert();
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]")).click();
	Thread.sleep(2000);
	driver.switchTo().alert();
	alert.sendKeys("text");
	alert.accept();
	Thread.sleep(3000);
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	}

}
