package selenium1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream a=new FileInputStream("C:\\Users\\Sonali Sable\\eclipse-workspace\\selenium\\testData\\testdata2.xlsx");
		
	    Sheet b = WorkbookFactory.create(a).getSheet("Sheet1");
	    
	    String c = b.getRow(0).getCell(7).getStringCellValue();
	     double d = b.getRow(0).getCell(0).getNumericCellValue();
	    System.out.println(c);
	    System.out.println(d);
	
	}

}
