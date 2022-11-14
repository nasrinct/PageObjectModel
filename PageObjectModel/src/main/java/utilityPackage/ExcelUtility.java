package utilityPackage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	XSSFSheet sheet;		//-->old:hssf
	XSSFWorkbook workbook;
	
	XSSFRow row;
	XSSFCell cell;
	
	public void printData(int r,int c) {
		try {
			String path="C:\\Users\\Lenovo\\Desktop\\Book1.xlsx";
			File src=new File(path);
			FileInputStream fi=new FileInputStream(src);
			workbook=new XSSFWorkbook(fi);
			sheet=workbook.getSheet("FirstSheet");
			row=sheet.getRow(r);
			cell=row.getCell(c);
			
			String x="";
			switch (cell.getCellType()) {
			case STRING: {
				x = cell.getStringCellValue();
				break;
			}
			case NUMERIC: {
				long d = (long) cell.getNumericCellValue();
				x=String.valueOf(d);
				break;
			}

			default:

			}

			System.out.println(x);
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

