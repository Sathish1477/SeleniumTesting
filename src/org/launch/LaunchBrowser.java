package org.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		//browser configuration
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\eclipse-workspace\\Selenium Testing\\src\\driver\\chromedriver.exe");
				//Interface name object name = new Class name();
				WebDriver driver = new ChromeDriver();
				//Launch Browser
				driver.get("https://www.facebook.com/");
				//to maximize the window
				driver.manage().window().maximize();
				//to print the URL
				String currentUrl = driver.getCurrentUrl();
				System.out.println(currentUrl);
				//to print the title of page
				String title = driver.getTitle();
				System.out.println(title);
				
			}

		}
