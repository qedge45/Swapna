package com.selinium.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingTest 
{

	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException
	{
		File srcFile=new File("C:\\Users\\Sahasra\\Desktop\\Selinium practice.xlsx");
		
		FileInputStream fis=new FileInputStream(srcFile);
		
		//creating object for workbook
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//sheet
		XSSFSheet ws=wb.getSheet("sheet1");		
		// to read  single set of value
		/*String data=ws.getRow(0).getCell(0).getStringCellValue();
		String data1=ws.getRow(0).getCell(1).getStringCellValue();
		
	    System.out.println(data+"----"+data1);*/
		
		//to read multiple set of values
		int rcnt=ws.getLastRowNum();
		for (int i = 0; i<=rcnt; i++)
		{
			String data=ws.getRow(i).getCell(0).getStringCellValue();
			String data1=ws.getRow(i).getCell(1).getStringCellValue();
			
		    System.out.println(data+"----"+data1);
		}
		
		
		
		
		
	}

			

}
