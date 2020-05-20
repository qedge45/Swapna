package com.selinium.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.selenium.Primusbank.PrimusBankLibrary;

public class DataDrivenTesting 
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
		XSSFSheet ws=wb.getSheet("sheet1");		
		
		int rcnt=ws.getLastRowNum();
		
		for (int i = 1; i<=rcnt; i++)
		{
			String branchName=ws.getRow(i).getCell(0).getStringCellValue();
			String add1=ws.getRow(i).getCell(1).getStringCellValue();
			
			//calling branch creation (call by reference method)
			String results=app.Newbranchcreation(branchName, add1);
			ws.getRow(i).createCell(2).setCellValue(results);
			FileOutputStream fos=new FileOutputStream(srcFile);
			wb.write(fos);
				
		}
		
		wb.close();
		app.applogout();
		app.appclose();
		
	}

}
