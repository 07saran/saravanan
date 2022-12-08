package excelDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriterByColumnNumber 
{


	public static void main(String[] args  ) throws Exception
	{    FileInputStream fis=new FileInputStream("C:\\Users\\janak\\Desktop\\Testdata1.xlsx");
	     FileOutputStream fos=null;
	     XSSFWorkbook wb= new XSSFWorkbook(fis);
	     XSSFSheet sheet = wb.getSheet("login");
	     XSSFRow row = sheet.getRow(1);
	     XSSFCell cell = row.getCell(2);
	     cell.setCellValue("fail");
	     fos=new FileOutputStream("C:\\Users\\janak\\Desktop\\Testdata1.xlsx");
	     wb.write(fos);
	     wb.close();
	     fis.close();
	
	
	
	
	
	}

}
