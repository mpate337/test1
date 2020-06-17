package com.cra.qa.util;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.sun.media.sound.InvalidFormatException;

public class TestUtil {
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	
	static Workbook book;
	static Sheet sheet;
	
	public static String sheet_path = "C:\\Users\\marmi\\eclipse-workspace\\Test1\\src\\main\\java\\com\\crm\\qa\\testdata\\contactUs_testdata.xlsx";

	public static Object[][] getTestData(String sheetname) throws NullPointerException, EncryptedDocumentException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException{
		FileInputStream file = null;
		try {
			file = new FileInputStream(sheet_path);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}try {
			book = WorkbookFactory.create(file);
		}catch(InvalidFormatException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetname);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0; i<sheet.getLastRowNum();i++) {
			for(int j=0; j<sheet.getRow(0).getLastCellNum();j++) {
				data[i][j] 	= sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
	}
}
