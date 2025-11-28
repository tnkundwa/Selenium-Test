package fileUpload;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.FileUploadPage;
import testautomationu.BaseTests;

public class FileUploadTests extends BaseTests{

    @Test
    public void testFileUpload(){
        FileUploadPage fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("C:\\Users\\LONOVO\\Desktop\\Selenium\\javadriver_java\\resources\\WhatsApp Image 2024-03-17 at 15.32.37.jpeg");
        assertEquals("File not uploaded", "File Successfully Uploaded", fileUploadPage.successMessage());
    }
}
