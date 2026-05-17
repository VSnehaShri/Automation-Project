package datadriven_framework;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class ReadingData {

	public static void main(String[] args) throws Exception {
		
		// Importing fileinputstream to find out the locator of excel
		
		FileInputStream f = new FileInputStream("C:\\Users\\snehashri\\Desktop\\OctoberBatch.xls");
		
		//opening the identified excel
		
		Workbook wb = Workbook.getWorkbook(f);
		
		//opening the sheet
		
		Sheet s = wb.getSheet("Sheet1");
		
		//Identifing the cell (column row)
		
		System.out.println(s.getCell(6, 0).getContents());
		
		//System.out.println(s.getCell(0, 1).getContents());
		
		//System.out.println(s.getCell(1, 0).getContents());
		

	} 
}
