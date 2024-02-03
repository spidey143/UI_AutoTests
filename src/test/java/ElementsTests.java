import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import service.BaseTest;
import utils.Generator;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.List;


@Epic("Тесты сайта demoqa.com")
@Feature("Тесты страницы Elements")
public class ElementsTests extends BaseTest {

    private String name, email, currAddress, permAddress;

    @BeforeClass
    public void generateData() {
        name = Generator.generateRandomString(5);
        email = Generator.generateRandomEmail(8);
        currAddress = Generator.generateRandomString(5);
        permAddress = Generator.generateRandomString(5);
    }

    @Test(testName = "Тестирование Text Boxes")
    @Owner(value = "Данечек")
    public void textBoxesTest() {
        mainPage.elementsCard.cardClick();
        menu.openFrame("Text Box");

        TEXT_BOX_FRAME_STEPS.fillForm(name, email, currAddress, permAddress);
        TEXT_BOX_FRAME_STEPS.submitClick();
        TEXT_BOX_FRAME_STEPS.checkOutputDataIsCorrect(name, email, currAddress, permAddress);
    }

    @Test(testName = "Тестирование Check Boxes")
    @Owner(value = "Данечек")
    public void checkBoxesTest() {
        mainPage.elementsCard.cardClick();
        menu.openFrame("Check Box");

        CHECK_BOX_FRAME_STEPS.openAllCheckBoxes();
        CHECK_BOX_FRAME_STEPS.selectCheckBoxes(
                List.of("Commands", "WorkSpace", "Private", "Excel File.doc")
        );
        CHECK_BOX_FRAME_STEPS.checkResult();
    }

    @Test(testName = "Тестирование Radio Buttons")
    @Owner(value = "Данечек")
    public void radioButtonsTest() {
        mainPage.elementsCard.cardClick();
        menu.openFrame("Radio Button");

        RADIO_BUTTON_FRAME_STEPS.clickRadioYesAndCheckResult();
        RADIO_BUTTON_FRAME_STEPS.clickRadioImpressiveAndCheckResult();
        RADIO_BUTTON_FRAME_STEPS.checkRadioNoNotActive();
    }

    @Test(testName = "Тестирование WebTable")
    @Owner(value = "Данечек")
    public void webTableTest() {
        mainPage.elementsCard.cardClick();
        menu.openFrame("Web Tables");

        WEB_TABLES_FRAME_STEPS.addUserToTable();
        WEB_TABLES_FRAME_STEPS.editUserToTable("abc");
        WEB_TABLES_FRAME_STEPS.deleteUserToTable("abc123");
    }

    @Test(testName = "Тестирование Buttons")
    @Owner(value = "Данечек")
    public void buttonsTest() {
        mainPage.elementsCard.cardClick();
        menu.openFrame("Buttons");

        BUTTON_FRAME_STEPS.clickDoubleClickButtonAndCheckResultMessage("double click");
        BUTTON_FRAME_STEPS.clickRightClickButtonAndCheckResultMessage("right click");
        BUTTON_FRAME_STEPS.clickDynamicClickButtonAndCheckResultMessage("dynamic click");
    }

    @Test(testName = "Тестирование Links")
    @Owner(value = "Данечек")
    public void linksTest() {
        mainPage.elementsCard.cardClick();
        menu.openFrame("Links");

        LINK_FRAME_STEPS.clickSimpleLink();
        LINK_FRAME_STEPS.clickDynamicLink();
        LINK_FRAME_STEPS.clickAllApiLink();
    }

    @Test(testName = "Тестирование Broken Links and Images")
    @Owner(value = "Данечек")
    public void brokenImagesAndLinksTest() {
        mainPage.elementsCard.cardClick();
        menu.openFrame("Broken Links - Images");

        BROKEN_LINKS_IMAGES_FRAME_STEPS.checkLinksIsValid();
        BROKEN_LINKS_IMAGES_FRAME_STEPS.checkImagesIsValid();
    }

    @Test(testName = "Тестирование Upload and Download")
    @Owner(value = "Данечек")
    public void uploadAndDownloadTest(){
        mainPage.elementsCard.cardClick();
        menu.openFrame("Upload and Download");

        File file = new File("src/main/java/data/simple.jpeg");
        UPLOAD_AND_DOWNLOAD_FRAME_STEPS.downloadFile();

        Assert.assertTrue(UPLOAD_AND_DOWNLOAD_FRAME_STEPS.checkFileIsAvailable());

        UPLOAD_AND_DOWNLOAD_FRAME_STEPS.uploadFile(file);
    }

    @Test(testName = "Тестирование Dynamic Properties")
    @Owner(value = "Данечек")
    public void dynamicPropertiesTest(){
        mainPage.elementsCard.cardClick();
        menu.openFrame("Dynamic Properties");

        DYNAMIC_PROPERTIES_FRAME_STEPS.giveOldPropertiesOfElements();
        DYNAMIC_PROPERTIES_FRAME_STEPS.checkElementsHasNewProperties();
    }

}
