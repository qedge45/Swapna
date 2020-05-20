package com.selinium.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.selenium.Primusbank.OrangeHRMAssignment;

public class DataDrivenOHRMAssignment 
{

	public static void main(String[] args) throws IOException 
	{
		OrangeHRMAssignment app=new OrangeHRMAssignment();  
        
        app.applaunch("http://orangehrm.qedgetech.com");
        app.applogin("Admin", "Qedge123!@#");
        
      //program for reading data from Excel
	       File srcFile=new File("C:\\Users\\Sahasra\\Desktop\\Selinium practice.xlsx");
			
			FileInputStream fis=new FileInputStream(srcFile);
			
			//creating object for workbook
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			
			//sheet
			XSSFSheet ws=wb.getSheet("sheet3");	
			
			int rcnt=ws.getLastRowNum();
			
			for (int i = 1; i<=rcnt; i++)
			{
            
				String FirstName=ws.getRow(i).getCell(0).getStringCellValue();
				String LastName=ws.getRow(i).getCell(1).getStringCellValue();
				
				//calling Employee creation (calling by reference method)
				String results=app.Employeecreation(FirstName, LastName);
				ws.getRow(i).createCell(2).setCellValue(results);
				FileOutputStream fos=new FileOutputStream(srcFile);
				wb.write(fos);		
	}

			wb.close();
			app.applogout();
			app.appclose();
			
			
  }
      }
	
	
