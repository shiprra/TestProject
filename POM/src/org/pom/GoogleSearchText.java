package org.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchText {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/shipr/workspace/POM/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.navigate().to("http://www.google.com");
		GoogleHomePageObjects page= new GoogleHomePageObjects(driver);
		
        
		page.txtsearch.sendKeys("Ducks"+ Keys.ENTER);
		page.btnsearch.click();
	}

}
