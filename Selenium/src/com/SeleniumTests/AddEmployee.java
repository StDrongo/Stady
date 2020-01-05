package com.SeleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.utils.CommonMethods;
//Open chrome browser
//Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//Login into the application
//Add Employee
//Log out 
//Quit the browser
public class AddEmployee extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
setUp("firefox", "http://166.62.36.207/humanresources/symfony/web/index.php/auth”");
driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("UserOne");
driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Syntax123!");
driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Vasya");
driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Mokeev");
driver.findElement(By.xpath("//input[@id='btnSave']")).click();
driver.findElement(By.xpath("//a[@id='welcome']")).click();
driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();



Thread.sleep(3000);
driver.close();
	}

}
