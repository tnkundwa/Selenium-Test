package fileUpload;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.FileUploadPage;
import testautomationu.BaseTests;

public class FileUploadTests extends BaseTests{

    @Test
    public void testFileUpload(){
        FileUploadPage fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("C:\\Users\\LONOVO\\Desktop\\Selenium\\javadriver_java\\resources\\chromedriver.exe");
        assertEquals("File not uploaded", "File Successfully Uploaded", fileUploadPage.successMessage());
    }
}
