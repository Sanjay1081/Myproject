package org.emp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public void launchBrowser() {
		System.setProperty("webdriverhrome.driver","C:\\Users\\Helina\\eclipse-workspace\\EmployeeDetails\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}
	public void loadUrl() {

	}
}
