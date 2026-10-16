package fileUpload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        String absolutePath = "D:\\Codes\\Java\\Automation Code Assignment\\resources\\";
        String filename = "aaaa.txt";
        var fileUploadPage=homePage.clickFileUpload();
        fileUploadPage.uploadFile(absolutePath+filename);
        assertEquals(fileUploadPage.getUploadedFileName(),filename,
                "The file name is incorrect");

    }

}