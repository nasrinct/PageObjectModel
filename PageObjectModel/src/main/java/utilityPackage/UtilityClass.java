package utilityPackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class UtilityClass {
	
	WebDriver driver;
	
	public UtilityClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	public String get_textofElement(WebElement element) {
		return element.getText();
	}
	
	public List<String> get_textofElement(String xpath) {
		List<String> texts=new ArrayList<String>();
		
		List<WebElement> elements=driver.findElements(By.xpath(xpath));
		
		for(WebElement i:elements) {
			texts.add(i.getText());
		}
		return texts;
	}
	
	

}
