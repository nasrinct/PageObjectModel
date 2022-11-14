package execute_tests;

import org.testng.annotations.Test;

import base_package.BaseClass;
import pages.DatePickersPage;

public class DatePickersTest extends BaseClass {
	DatePickersPage datepickerspage;
	
	@Test
	public void clickonLink() {
		datepickerspage=new DatePickersPage(driver);
		datepickerspage.clickonDatePickers();
		datepickerspage.clickOnEnterDateField();
		String date="23/11/2013";
		datepickerspage.selectDate(date);
			
	}
}
