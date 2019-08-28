package Readingexcel;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExceldata {

	public static void main(String[] args) throws Exception 
	{
		// file is taken from the source or destination
		File src=new File("C:\\Users\\akshoo\\Desktop\\ExcelData.xlsx");
        FileInputStream fis=new FileInputStream(src);//Taking into the JVM
        
        XSSFWorkbook wb=new XSSFWorkbook(fis);// Loading whole workbook
        XSSFSheet sheet=wb.getSheetAt(0);// Selecting the specific sheet
        // First access
        
        String data0=sheet.getRow(0).getCell(0).getStringCellValue();
        System.out.println("Data at zero: "+data0);
        //Here I am adding one comment whether this data comes there or not in Git
        
        
        
        
        
        
	}

}
