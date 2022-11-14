package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	
	
	/*
	public HomePage(WebDriver driver) {
		this.driver=driver;
		
	}
	*/
	public void giveDriver(WebDriver driver) {
		this.driver=driver;					//--->needs to call everytime..
	}

	
	public boolean is_obsquralogDispalyed() {
		
		WebElement logo=driver.findElement(By.xpath("//a[@href='index.php']/img[@src='images/logo.png']"));
		return logo.isDisplayed();
	}
	
	
}
