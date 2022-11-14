package excelReadInSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelReadInSelenium {
	WebDriver driver;
	String path="";
	String actual_path="";	


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ExcelReadInSelenium t=new ExcelReadInSelenium();
		t.test_file_read();
	}
	
	public void test_file_read() throws IOException
	{
		File f=new File("C:\\Users\\admin\\Desktop\\test case templet.xlsx");
		FileInputStream fin=new FileInputStream(f);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=workbook.getSheet("test1");
		
		
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		
		
		//for all details in sheet
		
		int n=sheet.getLastRowNum();
		int m=sheet.getDefaultColumnWidth();
		
		System.out.println(n);
		System.out.println(m);
	
		for(int i=0;i<=n;i++) { 
			
			for(int j=0;j<=m;j++)
			{
			String str_name=sheet.getRow(i).getCell(j).getStringCellValue(); 
			
			System.out.println(str_name); 
		}
		
		}
		
		
		int x=sheet.getPhysicalNumberOfRows();

		System.out.println(x);
	
	}


		
	

}
