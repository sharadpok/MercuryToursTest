package Readingexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelDataUsingForLoop
{

	public static void main(String[] args) throws IOException
	{
		// file is taken from the source or destination
				File src=new File("C:\\Users\\akshoo\\Desktop\\ExcelData.xlsx");
		        FileInputStream fis=new FileInputStream(src);//Taking into the JVM
		        
		        XSSFWorkbook wb=new XSSFWorkbook(fis);// Loading whole workbook
		        XSSFSheet sheet=wb.getSheetAt(0);// Selecting the specific sheet
		        System.out.println("Numner of rows:"+sheet.getLastRowNum());
		        for(int row=0;row<=sheet.getLastRowNum();row++)
		        {
		            String data0=sheet.getRow(row).getCell(0).getStringCellValue();
		            System.out.println(data0);
		        }

	}

}
