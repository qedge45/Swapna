package com.selinium.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingTest 
{

	public static void main(String[] args) throws IOException
	{
      File srcFile=new File("C:\\Users\\Sahasra\\Desktop\\Selinium practice.xlsx");
		
		FileInputStream fis=new FileInputStream(srcFile);
		
		//creating object for workbook
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//sheet
		XSSFSheet ws=wb.getSheet("sheet1");	
		
		ws.getRow(1).createCell(2).setCellValue("Selenium");
		FileOutputStream fos=new FileOutputStream(srcFile);
		wb.write(fos);
		wb.close();
		
		


	}

}
