package Activities;
import org.apache.ss.usermodel.Cell;
import org.apache.ss.usermodel.Row;
import org.apache.xssf.usermodel.XSSFSheet;
import org.apache.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class Activity15 {

    private static final String excelname;

    static {
        excelname = "Studentinfo.xlsx";
    }

    public static void main(String[] args) {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Student information details");
        Object[][] datatypes = {
                {"S.No", "Name", "TotalMarks"},
                {1, "Bala", 200},
                {2, "Sudha", 400},
                {3, "Roopa", 800},
                {4, "Chaitanya", 108},
                {5, "Indrani", 350}
        };

        int rowNum = 0;
        System.out.println("Creating student information excel sheet");

        for (Object[] datatype : datatypes) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : datatype) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
            workbook.write(outputStream);
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }
}
