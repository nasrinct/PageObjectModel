package execute_tests;

import org.testng.annotations.Test;

import base_package.BaseClass;
import pages.TablePage;
import utilityPackage.ExcelUtility;

public class TableTest extends BaseClass {
	
	TablePage tablepage;
	
	@Test
	public void printAllNames() {
		tablepage=new TablePage(driver);
		tablepage.clickonTable();
			
	}
	
	@Test
	public void verifyNames() {
		tablepage=new TablePage(driver);
		tablepage.clickonTable();
		tablepage.getNames();
	}
	
	@Test
	public void verifyDesignation() {
		tablepage=new TablePage(driver);
		tablepage.clickonTable();
		System.out.println(tablepage.getPosition("Colleen Hurst"));
		
	}
	@Test
	public void excelRead() {
	
		ExcelUtility excelUtility=new ExcelUtility();
		excelUtility.printData(2, 2);
	}

}
