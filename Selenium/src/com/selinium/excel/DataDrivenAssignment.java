package com.selinium.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.selenium.Primusbank.PrimusBankLibrary;

  public class DataDrivenAssignment 
{
	public static void main(String[] args) throws Exception 
	{
       PrimusBankLibrary app=new PrimusBankLibrary();
		
		app.applaunch("Http://primusbank.qedgetech.com");
		app.applogin("Admin", "Admin");
        
		//program for reading data from Excel
	       File srcFile=new File("C:\\Users\\Sahasra\\Desktop\\Selinium practice.xlsx");
			
			FileInputStream fis=new FileInputStream(srcFile);
			
			//creating object for workbook
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			
			//sheet
			XSSFSheet ws=wb.getSheet("sheet2");	
			
			int rcnt=ws.getLastRowNum();
			
			for (int i = 1; i<=rcnt; i++)
			{
			    String NewEmployee=ws.getRow(i).getCell(0).getStringCellValue();
				String Password=ws.getRow(i).getCell(1).getStringCellValue();
				
				//calling Employee creation (calling by reference method)
				String results=app.NewEmployeecreation(NewEmployee, Password);
				ws.getRow(i).createCell(2).setCellValue(results);
				FileOutputStream fos=new FileOutputStream(srcFile);
				wb.write(fos);	
				
			}
			
			wb.close();
			app.applogout();
			app.appclose();

	}

}
