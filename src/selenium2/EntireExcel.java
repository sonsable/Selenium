package selenium2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EntireExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

	//######################## READING ENTIRE EXCEL SHEET WITH FOR LOOP###############################
		//**********************************HARD CODE*****************************************//
		
		FileInputStream file1=new FileInputStream("C:\\\\Users\\\\Sonali Sable\\\\eclipse-workspace\\\\selenium\\\\testData\\\\data1.xlsx");
		
		Sheet excel1 = WorkbookFactory.create(file1).getSheet("Sheet2");
		
		for(int row=0; row<=1;row++)
		{
		
			for(int col=0; col<=3; col++) {
				
			  String value=excel1.getRow(row).getCell(col).getStringCellValue();
			System.out.print(value+" ");
			}
			System.out.println();
	
		}
	}

}
