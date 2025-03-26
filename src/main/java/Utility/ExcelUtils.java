package Utility;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelUtils {

    public static String filePath = "C:/Users/meet.patel/IdeaProjects/Selenium-/InputData.xlsx";
//    public static String filePath2 = "C:/Users/meet.patel/IdeaProjects/Selenium-/OutputData.xlsx";

    public static String getData(int row, int col) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);

        if(sheet.getRow(row) == null){
            workbook.close();
            return "Row not found.";
        }

        Cell cell = sheet.getRow(row).getCell(col);
        if(cell == null){
            workbook.close();
            return "Cell not found.";
        }

        String data = sheet.getRow(row).getCell(col).getStringCellValue();
        workbook.close();
        return data;
    }

    public static void writeResult(int row, int col, String result) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);
        fis.close();

        // Check if row exists, if not create it
        Row sheetRow = sheet.getRow(row);
        if (sheetRow == null) {
            sheetRow = sheet.createRow(row);
        }

        // Check if cell exists, if not create it
        Cell cell = sheetRow.getCell(col);
        if (cell == null) {
            cell = sheetRow.createCell(col);
        }

        cell.setCellValue(result); // Set new value

        FileOutputStream fos = new FileOutputStream(filePath);
//        sheet.getRow(row).createCell(col).setCellValue(result);
        workbook.write(fos);
        workbook.close();
        fos.close();
    }
}
