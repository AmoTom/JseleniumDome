package pres.szw.ljdtest.miantest;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcels {
	public String stg = null;
	public int numberrow;
	public File src = null;
	public FileInputStream fis = null;
	public XSSFSheet sh1 = null;
	public void readexcel(String path){
		try{
			// 指定excel的路径
			src = new File(path);

			// 加载文件
			fis = new FileInputStream(src);

			// 加载workbook
			@SuppressWarnings("resource")
			XSSFWorkbook wb=new XSSFWorkbook(fis);

			//加载sheet，这里我们只有一个sheet,默认是sheet1
			sh1= wb.getSheetAt(0);
			//获得excel中的行数，不包括空行
			numberrow  = sh1.getPhysicalNumberOfRows();
		} catch (Exception e){
			System.out.println(e.getMessage());
	}
}
	public String getexcelvalue(int cell){
		for(int i=0;i<numberrow;i++){
			for(int j=0;j<cell;j++){
				stg = sh1.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return stg;
	}
}


