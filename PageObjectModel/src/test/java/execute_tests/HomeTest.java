package execute_tests;

import java.sql.Driver;

import org.testng.Assert;
import org.testng.annotations.Test;

import base_package.BaseClass;
import pages.HomePage;

public class HomeTest extends BaseClass {
	
	HomePage homepage;
	
	@Test
	public void verifyObsquraLogoPresent() {
		homepage=new HomePage();
		homepage.giveDriver(driver);
		Assert.assertTrue(homepage.is_obsquralogDispalyed());
	}
	
	@Test
	public void verifyObsquraHomePageTitle() {
		driver.getTitle();
	}

}
