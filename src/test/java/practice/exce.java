package practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exce {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
       FileInputStream fis=new FileInputStream("C:\\for_automation\\akhila\\src\\test\\resources\\Akhilmam.xlsx");
 Workbook wb     = WorkbookFactory.create(fis);
 //fetch string type of data
 String data=wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
 System.out.print(data);
 //fetching integer type of data
double data2 =wb.getSheet("sheet1").getRow(2).getCell(0).getNumericCellValue();
//fetching boolean type of data
System.out.println(data2);
boolean data3 =wb.getSheet("sheet1").getRow(3).getCell(0).getBooleanCellValue();
System.out.println(data3);

 
 
	}

}
