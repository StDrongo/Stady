package com.class08;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class TaskTable extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUp("firefox", "http://166.62.36.207/syntaxpractice/");
driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Table')]")).click();
driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Table Data Search')]")).click();
List<WebElement> tableR = driver.findElements(By.xpath("//div[@class='panel panel-primary filterable']//tbody//tr"));
if (tableR.size()==5) {
	System.out.println("number of rows is correct");
}
List<WebElement> tableCol = driver.findElements(By.xpath("//table[@class='table']//thead[@class='thead-inverse']//tr//th"));
if (tableCol.size()==4) {
	System.out.println("number of collums is correct");
}else {
	System.out.println("some error");
}
		
		
		
		
Thread.sleep(3000);	
driver.close();
	}

}
