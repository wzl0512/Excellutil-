package test_excel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PoiTest_export {
    public static void main(String[] args) throws IOException {

        //创建工作蒲 类似于创建Excel文件
        XSSFWorkbook workbook = new XSSFWorkbook();
        //创建 sheetname页命
        XSSFSheet sheet = workbook.createSheet("通知公告");
        sheet.setColumnWidth(3,20*256);
        sheet.setColumnWidth(4,20*256);
        //创建一行，下标从0开始
        XSSFRow row =sheet.createRow(0);
        //创建这行中的列，下标从0开始 （表头）
        XSSFCell cell = row.createCell(0);
        //给cell 0下标赋值
        cell.setCellValue("公告ID");
        //创建这行中的列，并给这些列赋值
        row.createCell(1).setCellValue("公告标题");
        row.createCell(2).setCellValue("公告类型");
        row.createCell(3).setCellValue("公告内容");
        row.createCell(4).setCellValue("公告状态");
        row.createCell(5).setCellValue("文件路径");
        //设置表里内容
        row = sheet.createRow(1);
        row.createCell(0).setCellValue("1");
        row.createCell(1).setCellValue("第一个公告");
        row.createCell(2).setCellValue(" dafdsa");
        row.createCell(3).setCellValue("第一个公告");
        row.createCell(4).setCellValue("正常");
        row.createCell(5).setCellValue("dfsfds ");

        row = sheet.createRow(2);
        row.createCell(0).setCellValue("2");
        row.createCell(1).setCellValue("第二个公告");
        row.createCell(2).setCellValue("dsafdaf ");
        row.createCell(3).setCellValue("第二个公告");
        row.createCell(4).setCellValue("正常");
        row.createCell(5).setCellValue("fsdsafd");

        //设定 路径
        File file = new File("E:\\Excelutil\\通知公告.xlsx");
        FileOutputStream stream = new FileOutputStream(file);
        //需要抛异常
        workbook.write(stream);
        //关流
        stream.close();



    }
}
