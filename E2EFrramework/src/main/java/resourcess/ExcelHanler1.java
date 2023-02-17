package resourcess;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelHanler1 extends Base{
	
	private String username;
	private String password;
	
	private ArrayList<String>usernames=new ArrayList<>();
	private ArrayList <String>passwords=new ArrayList<>();
	
public void handleExcel() throws EncryptedDocumentException, IOException {
	String path=basepath+"C:\\Users\\Mtronics Computers\\Documents\\ExcelAutomation\\Testdata1.xlsx";

	FileInputStream file=new FileInputStream(path);
	Workbook book=WorkbookFactory.create(file);
	Sheet sheet=book.getSheet("Sheet1");
	Row row=sheet.getRow(1);
	
	String username= row.getCell(1).toString();
	String password=  row.getCell(2).toString();
	int rowcount=sheet.getLastRowNum();
	
	int colcount=row.getLastCellNum();
	System.out.println("rowcount= "+rowcount  +" "+"colcount= "+colcount);
	for(int i=0;i<=rowcount;i++) {
		row=sheet.getRow(i);
		for(int j=0;j<=colcount-1;j++) {
			Cell cell=row.getCell(j);
			String data=cell.toString();
			System.out.print(data+" ");
			
		}
		System.out.println();
	}
		}
	 

public ArrayList<String> getUsernames() {
	return usernames;
}


public ArrayList<String> getPasswords() {
	return passwords;
}


public String getUsername() {
	return username;
}
public String getPassword() {
	return password;
}
}
