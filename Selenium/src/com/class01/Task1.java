package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.navigate().to("https://vk.com");
	driver.navigate().to("https://google.com");
	driver.navigate().back();
	driver.navigate().refresh();
    String str = driver.getCurrentUrl();
    System.out.println(str);
    if(str.contains("vk")) {
    	System.out.println("pass");
    }else {
    	System.out.println("fail");
    }
	Thread.sleep(2000);
	driver.close();
}
}
