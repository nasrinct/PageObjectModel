package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityPackage.UtilityClass;

public class TablePage {
	
	WebDriver driver;
	UtilityClass utilityclass;

	@FindBy(xpath = "//a[contains(text(),'Table')]")
	WebElement tableLink;
	
	public TablePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickonTable() {
		
		tableLink.click();
		
	}
	
	public void getNames() {
		utilityclass=new UtilityClass(driver);
		List<String>text=utilityclass.get_textofElement("//tr//td[1]");

		System.out.println(text);
	
	}
	
	public String getPosition(String name) {
		
		List<String> names=new ArrayList<String>();
		UtilityClass utilityclass=new UtilityClass(driver);
		names=utilityclass.get_textofElement("//tbody//tr//td[1]");
		//System.out.println(names);
		int pos=0;
		
		for(pos=0;pos<names.size();pos++) {
			if(name.equals(names.get(pos))) {
				pos++;
				break;
			}
			
		}
		
		WebElement positon=driver.findElement(By.xpath("//tbody//tr["+pos+"]//td[2]"));
		return positon.getText();
		
		
	}
	
	

}
