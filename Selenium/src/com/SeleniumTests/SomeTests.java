package com.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SomeTests {

	public static final String test_url = "http://166.62.36.207/syntaxpractice/index.html";
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		
		d.get(test_url);
		d.manage().window().maximize();
		d.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		d.findElement(By.linkText("Radio Buttons Demo")).click();
		
		

		
		
		
		Thread.sleep(2000);
		d.close();
	}

}
