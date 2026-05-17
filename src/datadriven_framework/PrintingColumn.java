package datadriven_framework;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class PrintingColumn {

	public static void main(String[] args) throws Exception {
		
		FileInputStream f= new FileInputStream("C:\\Users\\snehashri\\Desktop\\OctoberBatch.xls");
		
		Workbook wb = Workbook.getWorkbook(f);
		
		Sheet s = wb.getSheet("Sheet2");
		
		int cc = s.getColumns();
		int rc = s.getRows();
		
		for(int i =0; i<rc;i++) {
			System.out.println(s.getCell(0, i).getContents());
		}
		

	}

}
