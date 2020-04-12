package com.excell.manager;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	 static String projectPath;
	 static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public static void main(String[] args) {
		getRowCount();
		getCellData();
	}
	public static void getRowCount() {
		
		try {
			projectPath = System.getProperty("user.dir");
		
		 workbook=new XSSFWorkbook(projectPath + "/CNN_Test_ Data/Test Data Financial.xlsx");
	   sheet=workbook.getSheet("Market");
		sheet.getPhysicalNumberOfRows();
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of rows in the excel sheet:" + rowCount);
	}catch(Exception exp) {
		System.out.println(exp.getMessage());
		System.out.println(exp.getCause());;
		exp.printStackTrace();
	}
	}
public static void getCellData() {
	try {
	projectPath=System.getProperty("user.dir");
	workbook=new XSSFWorkbook(projectPath+ "/CNN_Test_ Data/Test Data Financial.xlsx");
	sheet= workbook.getSheet("Market");
	String cellData=sheet.getRow(0).getCell(0).getStringCellValue();
	System.out.println(cellData);
	double cellData1=sheet.getRow(1).getCell(1).getNumericCellValue();
	}catch(Exception exp) {
		System.out.println(exp.getMessage());
		System.out.println(exp.getCause());;
		exp.printStackTrace();
}
}
	
	
	
	
	}


