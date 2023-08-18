package selenium2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EntireXL2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file=new FileInputStream("C:\\\\Users\\\\Sonali Sable\\\\eclipse-workspace\\\\selenium\\\\testData\\\\data1.xlsx");
		
	Sheet xl = WorkbookFactory.create(file).getSheet("Sheet2");
	
	for(int r=0; r<=1; r++)
	{
		for(int c=0;c<=3;c++)
		{
			String v = xl.getRow(r).getCell(c).getStringCellValue();
			System.out.print(v+" ");
		}
		
		System.out.println();
	}
	}

}
