package UtilsLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import BaseLayer.Baseclass;



public class ExcleReader extends Baseclass {

	
	public XSSFWorkbook workbook;

    public ExcleReader(String fpath) throws IOException 
	{  
		File f=new File(fpath);
		FileInputStream fs=new FileInputStream(f);
	    workbook=new XSSFWorkbook(fs);    
	}
    
	  
    public  String getDataFromExcel(int sheetindex,int rows,int cells)
	  {
		  try
		  {
			return workbook.getSheetAt(sheetindex).getRow(rows).getCell(cells).getStringCellValue();
		  }
		  catch (Exception e)
		  {
			  double a= workbook.getSheetAt(sheetindex).getRow(rows).getCell(cells).getNumericCellValue();
 		    return  Long.toString((long)a);
 		     
// 		   long d=(long)a;
//			 Long.toString(d);
		  }
		  
	  }
	  
	  public int countrows(int sheetindex)
	  {
		  return workbook.getSheetAt(sheetindex).getLastRowNum();
	  }

	  public int countcells(int sheetindex)
	  {
		  return workbook.getSheetAt(sheetindex).getRow(0).getLastCellNum();
	  } 
	  
	  
}
