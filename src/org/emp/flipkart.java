package org.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	
	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver","C:\\Users\\Helina\\eclipse-workspace\\EmployeeDetails\\driver\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.flipkart.com/?gclid=EAIaIQobChMI0NXM8fzs5AIVVB2PCh01VQvVEAAYASAAEgJbLPD_BwE&ef_id=EAIaIQobChMI0NXM8fzs5AIVVB2PCh01VQvVEAAYASAAEgJbLPD_BwE:G:s&s_kwcid=AL!739!3!326555007752!e!!g!!flipkart&semcmpid=sem_8024046704_brand_eta_goog");
      
      WebElement search = driver.findElement(By.xpath("//input[@class='LM6RPg']"));
      search.sendKeys("Dress");
      
      WebElement closepopup = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
      closepopup.click();
      
    Thread.sleep(3000);
    
    driver.manage().window().maximize();
    
    WebElement searchclick = driver.findElement(By.xpath("//button[@class ='vh79eN']"));
    searchclick.click();
    
		
	}
}
