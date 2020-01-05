package com.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
//Open chrome browser
//Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
//Login to the application
//Verify customer “Susan McLaren” is present in the table
//Click on customer details
public class FindTableElement extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
setUp("firefox", "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");		
driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test", Keys.ENTER);		
String expectedValue="Susan McLaren";
List<WebElement> rows = driver.findElements(By.xpath("//body//tr//tr"));
Thread.sleep(5000);

	for (WebElement rowsL:rows) {
		String name = rowsL.findElement(By.xpath("//td[contains(text(),'Susan McLaren')]")).getText();

	if (name.equals(expectedValue)) {
	driver.findElement(By.xpath("//tr[6]//td[13]//input[1]")).click();
	break;
		}
	}
		
		
		
		
		
		
Thread.sleep(3000);
driver.close();
	}

}
