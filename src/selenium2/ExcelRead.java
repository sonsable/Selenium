package selenium2;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//********************************************************************************************************
//************READING EXCEL FILE**************//
//********************************************************************************************************

public class ExcelRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException   {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Sonali Sable\\eclipse-workspace\\selenium\\testData\\data1.xlsx");
	
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		
	String v1 = excel.getRow(0).getCell(0).getStringCellValue();
	double v2 = excel.getRow(1).getCell(2).getNumericCellValue();
	double v3 = excel.getRow(2).getCell(1).getNumericCellValue();
	String v4 = excel.getRow(0).getCell(1).getStringCellValue();
	
	//BELOW IS THE NUMERIC VALUE BUT I HV CHANGED IT TO STRING LIKE THIS =>  '8888 AND ENTER
	//IT BECOME EASIER TO USE EXCEL LIKE THIS BCZ WE CANT CONSTANTLY CHECK IN WHICH CELL THERE IS NUMERIC OR STRING VALUE
	
	String v5 = excel.getRow(2).getCell(2).getStringCellValue(); 
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
	
	
	}

}
