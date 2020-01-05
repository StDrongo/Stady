package com.SeleniumTests;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import com.utils.CommonMethods;
	public class WaitCommands extends CommonMethods{
//		Open chrome browser
//		Go to “https://the-internet.herokuapp.com/”
//		Click on “Click on the “Dynamic Loading” link
//		Click on “Example 1...” and click on “Start”
//		Verify element with text “Hello World!” is displayed
//		Close the browser
		public static void main(String[] args) throws InterruptedException {
			setUp("firefox", "https://the-internet.herokuapp.com/");
			driver.findElement(By.linkText("Dynamic Loading")).click();
			driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
			driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
			WebDriverWait wait=new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("finish")));
			boolean displayed=driver.findElement(By.id("finish")).isDisplayed();
			System.out.println(displayed);
			//Thread.sleep(3000);
			//driver.quit();
		}

}
