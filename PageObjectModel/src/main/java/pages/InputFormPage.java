package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilityPackage.UtilityClass;

public class InputFormPage {
	
	WebDriver driver;
	
	UtilityClass utilityclass;
	
	By input_form=By.xpath("//a[contains(text(),'Input')]");
	By enter_A=By.xpath("//input[@id='value-a']");
	By enter_B=By.xpath("//input[@id='value-b']");
	By get_Total=By.xpath("//button[@id='button-two']");
	By get_totalMessage=By.xpath("//div[@id='message-two']");
	
	public InputFormPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void clickon_inputForm() {
	
		WebElement inputForm=driver.findElement(input_form);
		inputForm.click();
	}
	
	public void enterValues_a_and_b(String a, String b) {
		WebElement enterA=driver.findElement(enter_A);
		enterA.sendKeys(a);
		
		WebElement enterB=driver.findElement(enter_B);
		enterB.sendKeys(b);
		
		WebElement getTotal=driver.findElement(get_Total);
		getTotal.click();
		
	}
	
	public String getSum() {
		utilityclass=new UtilityClass(driver);
		WebElement message=driver.findElement(get_totalMessage);
		return utilityclass.get_textofElement(message);
	}

}
