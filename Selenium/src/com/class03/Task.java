package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task {
	public static void main(String[] args) {
//Open chrome browser
//Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//Enter sohilaryan and Syntax@12
//Click on login button
//Then verify Syntax Logo is displayed.
//TC 2: HRMS Application Negative Login: 
//Open chrome browser
//Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//Enter valid username
//Leave password field empty
//Verify error message with text “Password cannot be empty” is displayed.	
		
	System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
	WebDriver d = new FirefoxDriver();
	
	//d.findElement(By.xpath(xpathExpression))
		
		
		
		
		
	}

}
