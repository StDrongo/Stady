package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		
		d.get("http://newtours.demoaut.com/");
		d.findElement(By.linkText("REGISTER")).click();
		d.navigate().back();
		d.findElement(By.name("userName")).sendKeys("user");
		d.findElement(By.name("password")).sendKeys("password");
		d.findElement(By.name("login")).click();
		
		
		
		Thread.sleep(3000);
		d.close();

	}

}
