package steps;

import io.qameta.allure.Step;
import org.apache.commons.io.FileUtils;
import org.testng.Assert;
import pages.BasePage;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class UploadAndDownloadFrameSteps extends BasePage {

    @Step("Скачать файл")
    public void downloadFile() {
        try {
            elementsPage.uploadAndDownloadFrame.downloadFileButton.downloadFile();
        } catch (IOException e) {
            System.out.println("Файл не скачался");
        }
    }

    @Step("Загрузить файл")
    public void uploadFile(File file) {
        elementsPage.uploadAndDownloadFrame.uploadFileInput.uploadFile(file);
        Assert.assertEquals(
                elementsPage.uploadAndDownloadFrame.uploadedFilePath.getText(),
                "C:\\fakepath\\" + file.getName());
    }

    @Step("Проверить скачался ли файл")
    public Boolean checkFileIsAvailable(){
        boolean flag = false;
        File directory = new File("src/tmp/");
        File[] files = directory.listFiles();
        System.out.println(Arrays.toString(files));
        Assert.assertNotNull(files);
        try {
            for (File file : files) {
                System.out.print("dir:" + file.getName() + " ");
                if (file.isDirectory()) {
                    File[] filesInDir = file.listFiles();
                    System.out.println(Arrays.toString(filesInDir));
                    Assert.assertNotNull(filesInDir);
                    for (File f : filesInDir) {
                        if (f.getName().equalsIgnoreCase("samplefile.jpeg")) {
                            flag = true;
                            break;
                        }
                    }
                }
                else if (file.getName().equalsIgnoreCase("samplefile.jpeg")){
                    flag = true;
                    break;
                }
            }
            FileUtils.deleteDirectory(directory);
        } catch (IOException e) {
            System.out.println("XXZZZZ");
        }
        return flag;
    }
}
