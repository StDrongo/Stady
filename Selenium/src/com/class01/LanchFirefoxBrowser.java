package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class LanchFirefoxBrowser {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		Thread.sleep(2000);
		driver.navigate().to("http://vk.com");
		Thread.sleep(5000);
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
		
		final String expectedTitle="Google";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Iam on the right page");
		}else {
			System.out.println("The actual and expected Title did not match");
		}
		
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://google.com/";
		
		if (expectedUrl.equals(actualUrl)) {
			System.out.println("Both URL matched");
		}else {
			System.err.println("Actual and expected Not matched");
		}
		
        
        
        
        
        
        
        
        
		driver.close();
	}

}
