package execute_tests;

import org.testng.annotations.Test;

import base_package.BaseClass;
import pages.InputFormPage;

public class InputFormTest extends BaseClass{
	
	InputFormPage inputformpage;
	
	@Test
	public void verifybinputFormPageTitle() {
		inputformpage=new InputFormPage(driver);
		inputformpage.clickon_inputForm();
		driver.getTitle();
		
	}
	
	@Test
	public void verifyShowMessageFunctionality() {
		inputformpage=new InputFormPage(driver);
		inputformpage.clickon_inputForm();
		inputformpage.enterValues_a_and_b("10", "20");
		
		System.out.println(inputformpage.getSum());
	}
}
