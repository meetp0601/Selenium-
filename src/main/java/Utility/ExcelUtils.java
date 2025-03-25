package Utility;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelUtils {

    public static String filePath = "C:/Users/meet.patel/IdeaProjects/Selenium-/InputData.xlsx";
    public static String getData(int row, int col) throws IOException {
        FileInputStream fis =  new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);

        String data = sheet.getRow(row).getCell(col).getStringCellValue();
        workbook.close();
        return data;
    }
    public static  void writeResult(int row, int col, String result) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);
        fis.close();

        FileOutputStream fos = new FileOutputStream(filePath);
        sheet.getRow(row).createCell(col).setCellValue(result);
        workbook.write(fos);
        workbook.close();
        fos.close();
    }
}
