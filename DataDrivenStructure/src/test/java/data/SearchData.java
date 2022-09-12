package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class SearchData {

	@DataProvider(name="searchtext")
	public Object[][] gettext() throws Exception{
		Object[][] arraytext=getExcelData("ExcelData//Searchdata.xlsx","sheet1");
		return arraytext;
	}
	
	public String[][] getExcelData(String filepath,String sheetname) throws Exception{
		
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheet(sheetname);
		XSSFRow row=sheet.getRow(0);
		int rows=sheet.getPhysicalNumberOfRows();
		int cols=row.getLastCellNum();
		
		
		String[][] data3=new String[rows-1][cols];
		for(int i=0;i<rows-1;i++)
		{
			for(int j=0;j<cols;j++)
			{
				DataFormatter df=new DataFormatter();
				data3[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		for(String[] dataarr:data3)
		{
			System.out.println(Arrays.toString(dataarr));
		}
		return data3;
	}		
}
