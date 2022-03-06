package org.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {
	public static void main(String[] args) {
		// browser configuration
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Windows\\eclipse-workspace\\Selenium Testing\\src\\driver\\chromedriver.exe");
		// Interface name object name = new Class name();
		WebDriver driver = new ChromeDriver();
		// Launch Browser
		driver.get("https://www.facebook.com/");
		// to maximize the window
		driver.manage().window().maximize();
		// Inspect User name
		WebElement TextUser = driver.findElement(By.id("email"));
		// Send User information
		TextUser.sendKeys("aishwarya111156@gmail.com");
		// Inspect Password
		WebElement TextPass = driver.findElement(By.id("pass"));
		// Send password information
		TextPass.sendKeys("Aishu@123");
		WebElement ButtonClick = driver.findElement(By.name("login"));
		ButtonClick.click();

	}

}
