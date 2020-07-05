package WORKS7;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readexcel {

	public static void main(String[] args) throws IOException {
	
		String path="C:\\ABC\\JAVA\\jay.xlsx";
		  File f=new File(path);
		  FileInputStream fis=new  FileInputStream(f);	
		  Workbook wb=WorkbookFactory.create(fis);
		  org.apache.poi.ss.usermodel.Sheet sheet= wb.getSheetAt(0);
		  System.out.println (sheet.getPhysicalNumberOfRows());
		  System.out.println(sheet.getRow(0).getPhysicalNumberOfCells());

		  	for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
		  	System.out.println(sheet.getRow(i).getCell(0));
		  	System.out.println(sheet.getRow(i).getCell(1));
		  	}
		  	fis.close();

}

	}
