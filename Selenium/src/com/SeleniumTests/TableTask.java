package com.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.utils.CommonMethods;
//Login to the application
//Verify customer “Susan McLaren” is present in the table
//Click on customer details
//Update customers last name and credit card info
//Verify updated customers name and credit card number is displayed in table
//Close browser
public class TableTask extends CommonMethods{

	public static void main(String[] args) {
		
setUp("firefox", "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test", Keys.ENTER);
		
		
		
		
		
		

	}

}
