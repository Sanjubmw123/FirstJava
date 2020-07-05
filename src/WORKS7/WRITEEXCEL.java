package WORKS7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WRITEEXCEL {

	public static void main(String[] args) throws IOException {
		String path="C:\\ABC\\JAVA\\jay.xlsx";
		  File f=new File(path);
		  FileOutputStream fo=new  FileOutputStream(f);
		
		
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet ws1=wb.createSheet("random no");
		
	ws1.createRow(0).createCell(0).setCellValue("NO") ;
		ws1.getRow(0).createCell(1).setCellValue("DIGIT") ;
			
		for (int i=1;i<=500;i++) {
			ws1.createRow(i).createCell(0).setCellValue(i) ;
			ws1.getRow(i).createCell(1).setCellValue(getrandonnum(100,999));
		}
		wb.write(fo);
		wb.close();	
	}
	public static int getrandonnum(int min,int max) {
		if(min>=max) {
			throw new IllegalArgumentException("max must be greater than min");
			
		}
		Random r=new Random();
		return r.nextInt((max-min)+1) + min;
}


	}


