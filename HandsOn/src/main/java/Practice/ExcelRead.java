package Practice;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File file = new File("C:\\users\\PERSONAL-LAPTOP\\Desktop\\study material\\Study material.xlsx");
		
		Workbook wbook = WorkbookFactory.create(file);
		Sheet sht = wbook.getSheet("POM");
		
		DataFormatter d = new DataFormatter();
		
		Iterator<Row> rows = sht.iterator();
		while (rows.hasNext()) {
			Row row = (Row) rows.next();
			
			Iterator<Cell> column = row.iterator();
			while (column.hasNext()) {
				Cell cell2 = (Cell) column.next();
				System.out.println(d.formatCellValue(cell2));
				System.out.print("|");
				
			}
			System.out.println(" ");
		}
		

	}

}
