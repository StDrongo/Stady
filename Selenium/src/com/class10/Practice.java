package com.class10;

import org.openqa.selenium.By;

import com.utils.CommonMethods;
import com.utils.Constants;
//Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//Login to the application by writing xpath based on “parent and child relation”
//TC 2: HRMS Login
//Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//Login to the application by writing xpath based on “following and preceding siblings”
//username: Syntax password: Syntax123!
public class Practice extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

setUp("firefox", Constants.HRMS_URL);
driver.findElement(By.xpath("//span[@class='form-hint']/preceding-sibling::input")).sendKeys("Admin");
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@id='divPassword']/input")).sendKeys("Hum@nhrm123");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		

	}

}
