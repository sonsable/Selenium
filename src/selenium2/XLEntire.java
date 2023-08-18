package selenium2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XLEntire {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream f=
new FileInputStream("C:\\\\\\\\Users\\\\\\\\Sonali Sable\\\\\\\\eclipse-workspace\\\\\\\\selenium\\\\\\\\testData\\\\\\\\data1.xlsx");
		
		Sheet v = WorkbookFactory.create(f).getSheet("Sheet2");
		
		for(int r=0;r<=v.getLastRowNum();r++)
		{
			for(int c=0;c<v.getRow(r).getLastCellNum();c++)
			{
				
				String xl = v.getRow(r).getCell(c).getStringCellValue();	
				System.out.print(xl+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
