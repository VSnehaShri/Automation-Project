package datadriven_framework;

import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class WriteData {

	public static void main(String[] args)throws Exception {


		FileOutputStream f = new FileOutputStream("C:\\Users\\snehashri\\Desktop\\29April.xls");
		
		WritableWorkbook wb = Workbook.createWorkbook(f);
		
		WritableSheet s = wb.createSheet("Result", 1);
		
		int a = 10; int b = 3;
		
		int c = a*b;
		
		Label l = new Label(0, 15, "c value is :" +c);
		s.addCell(l);
		
		wb.write();
		wb.close();
		

	}

}
