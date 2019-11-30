package com.class26;

public class WebDriverTest {

	public static void main(String[] args) {

		ChromeDriver chrome = new ChromeDriver();
		chrome.refresh();
		chrome.open();
		
		FirefoxDriver firefox = new FirefoxDriver();
		firefox.refresh();
		firefox.open();
System.out.println("----------------------");
//creating an object of child class 
//and given reference to the parent		
		WebDriver driver = new ChromeDriver();
		driver.open();
		driver.refresh();
//no access to child sapecific class through Parent type
		
		
		
		
		
		
		
		
	}

}
