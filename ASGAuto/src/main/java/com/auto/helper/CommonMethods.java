package com.auto.helper;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.auto.base.TestBase;

public class CommonMethods extends TestBase {
	

	@FindBy(xpath = "//h1")
	static WebElement title;
	
	public CommonMethods() {
		PageFactory.initElements(webDriver, this);
	}
	


	
	public boolean elementPresenceCheck(WebElement element) {
		try {
			if (element.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		}catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}catch (Exception e) {
			return false;
		}
	}
	
	
	public boolean elementPresenceCheck(WebElement elements[]) {
		try
		{
			
			for(WebElement element:elements)
			{
				if (element.isDisplayed()) 
				{
				//	Defs.logger.info("Element is displayed in UI");
				}
				else 
				{
				//	Defs.logger.info("Element is not presenet in UI");
					return false;
				}
			}
			
		}catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
		return true;
	}

	/*
	 * Extracts the Xpath from webElement
	 */
	public String getXpath(WebElement element) {

		String[] a = element.toString().split("xpath:");
		String xpath = a[a.length - 1].substring(0, a[a.length - 1].length() - 1);
		return xpath;
	}



	
	public void waittime(double n) {
		try {
			Thread.sleep((long) (n * 1000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	public String selectvalueFromDropdown_Value(WebElement element,String value)
	{
		Select select = new Select(element);
		//wait(2);
		select.selectByValue(value);
		String sv = select.getFirstSelectedOption().getText();
	//	Defs.logger.info(sv);
		return sv;
	}
	
	public void selectvalueFromDropdown_Index(WebElement element,int value)
	{
		Select select = new Select(element);
		select.selectByIndex(value);
		String sv = select.getFirstSelectedOption().getText();
	}
	
	
	public void selectvalueFromDropdown_Text(WebElement element,String value)
	{
		Select select = new Select(element);
		select.selectByVisibleText(value);
		String sv = select.getFirstSelectedOption().getText();
	}

	public void wait(int n){
		try {
			Thread.sleep(n*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
 
	public static void writeinexcel(String sheetname, int rownum, int columnnum,String value) {
		
		 File src = new File("src/main/java/com/hps/testdata/OutputSheet.xlsx");
		 FileInputStream fin;
		try {
			fin = new FileInputStream(src);
		 XSSFWorkbook wb = new XSSFWorkbook(fin); 
		 XSSFSheet sheet = wb.getSheet(sheetname);

		 try {
	    sheet.getRow(rownum).getCell(columnnum).setCellValue(value);
		 }catch(Exception e) {
	    sheet.getRow(rownum).createCell(columnnum).setCellValue(value);
		//	 row.createCell(columnnum).setCellValue(rownum);
			// row.createCell(columnnum).setCellValue(value); 
		 }
		 
		 fin.close();
		 FileOutputStream output = new FileOutputStream(src);
		 wb.write(output);
		 output.close();
		 wb = new XSSFWorkbook(new FileInputStream("src/main/java/com/hps/testdata/OutputSheet.xlsx"));
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error while writting in the excel");
		}
}
	
	public static void writeinexcel_multi(String sheetname, int rownum, int columnnum,String[] value) {
		
		 File src = new File("src/main/java/com/hps/testdata/OutputSheet.xlsx");
		 FileInputStream fin;
		try {
			fin = new FileInputStream(src);
		 XSSFWorkbook wb = new XSSFWorkbook(fin); 
		 XSSFSheet sheet = wb.getSheet(sheetname);
		 
		 XSSFRow row = sheet.createRow(rownum);
		 
		 for(int i = 0 ; i < columnnum; i++) {
		 XSSFCell cell = row.createCell(i);
		 cell.setCellType(cell.CELL_TYPE_STRING);
		 cell.setCellValue(value[i]);
	   //  sheet.getRow(rownum).getCell(i).setCellValue(value[i]);
		 }
		 
		 fin.close();
		 FileOutputStream output = new FileOutputStream(src);
		 wb.write(output);
		 output.close();
		 wb = new XSSFWorkbook(new FileInputStream("src/main/java/com/hps/testdata/OutputSheet.xlsx"));
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error while writting in the excel");
		}
}
	
	public static HashMap<String, String> readfromexcel_registration(String sheetname) throws IOException{
		try {
			
			HashMap<String, String> map = new HashMap<String, String>();
			String key = null;
			String val = null;
			
			File src = new File("src/main/java/com/hps/testdata/InputSheet.xlsx");
			FileInputStream fin;
			fin = new FileInputStream(src);
		    XSSFWorkbook wb = new XSSFWorkbook(fin);
		    XSSFSheet sheet = wb.getSheet(sheetname);
		    for(int i = 1; i <= 14; i++) {
		    	key = sheet.getRow(i).getCell(1).toString();
		    	val = sheet.getRow(i).getCell(2).toString();
		    	map.put(key, val);
		    }
		 return map;
		 
		} catch (FileNotFoundException e) {
			System.out.println("Error while retriving the values from excel sheet");
			e.printStackTrace();
			return null;
		} 
	}
	
	
	public static HashMap<String, String> readfromexcel_Product(int productnumber) throws IOException{
		try {
			
			HashMap<String, String> map = new HashMap<String, String>();
			
			File src = new File("src/main/java/com/hps/testdata/InputSheet.xlsx");
			FileInputStream fin;
			fin = new FileInputStream(src);
		    XSSFWorkbook wb = new XSSFWorkbook(fin);
		    XSSFSheet sheet = wb.getSheet("Product");
		    int lastrow = sheet.getLastRowNum();
		    System.out.println(lastrow);
		    
		   map.put("Product Name", sheet.getRow(productnumber).getCell(1).toString());
		   map.put("Color", sheet.getRow(productnumber).getCell(2).toString()); 
		   map.put("Size", sheet.getRow(productnumber).getCell(3).toString()); 
		   map.put("Qty", sheet.getRow(productnumber).getCell(4).toString());
		   
		   return map;
		 
		} catch (FileNotFoundException e) {
			System.out.println("Error while retriving the values from excel sheet");
			e.printStackTrace();
			return null;
		} 
	}
	
	
	
	
}

