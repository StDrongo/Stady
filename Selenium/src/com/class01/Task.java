package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task {
	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		
		driver.get("https://amazon.com");
		String str = driver.getTitle();
		System.out.println(str);
		driver.close();
		
		
		
		
	}

}
