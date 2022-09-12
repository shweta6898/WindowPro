package data;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Logindata {
 
	@DataProvider(name="data")
	public Object[][] method1() throws Exception {
		Object[][]  arraydata =getExcelData("C:\\Users\\Shweta Chauhan\\Desktop\\TestData.xlsx","sheet1");
		return arraydata;
		}
	
	public String[][] getExcelData(String filepath,String sheetname) throws Exception{
		
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheet(sheetname);
		XSSFRow row=sheet.getRow(0);
		int rows=sheet.getPhysicalNumberOfRows();
		int cols=row.getLastCellNum();
		
		
		String[][] data1=new String[rows-1][cols];
		for(int i=0;i<rows-1;i++)
		{
			for(int j=0;j<cols;j++)
			{
				DataFormatter df=new DataFormatter();
				data1[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		for(String[] dataarr:data1)
		{
			System.out.println(Arrays.toString(dataarr));
		}
		return data1;
		
	}

}
