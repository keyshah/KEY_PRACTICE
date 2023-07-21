package Bunch.ReadExcel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.*;

public class ReadWriteExcel {

    @Test
    public void dataReadTest() throws IOException {

        File src = new File("./testdata/Book.xlsx");
        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook xsf = new XSSFWorkbook(fis);
        XSSFSheet sheet = xsf.getSheetAt(0);
        String s = sheet.getRow(1).getCell(1).getStringCellValue();
        System.out.println(s);
        sheet.getRow(1).getCell(1).setCellValue("dddd");
        String s1 = sheet.getRow(1).getCell(1).getStringCellValue();
        System.out.println(s1);
        FileOutputStream fos = new FileOutputStream(src);
        xsf.write(fos);
        xsf.close();




//        xsf.close();
//        fis.read().g
    }
}
