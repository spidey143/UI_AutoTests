package pages.elementsPage.frames;

import com.codeborne.selenide.SelenideElement;
import elements.Button;
import elements.Input;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UploadAndDownloadFrame {
    public Button downloadFileButton = new Button(By.id("downloadButton"), "Кнопка скачивания файла");
    public Input uploadFileInput = new Input(By.id("uploadFile"), "Поле загрузки файла");

    public SelenideElement uploadedFilePath = $(By.id("uploadedFilePath"));
}
