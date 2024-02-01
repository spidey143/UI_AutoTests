import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import service.BaseTest;
import utils.Generator;

import java.awt.*;
import java.util.List;


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
    public void textBoxesTest() {
        mainPage.elementsCard.cardClick();
        menu.openFrame("Text Box");

        TEXT_BOX_FRAME_STEPS.fillForm(name, email, currAddress, permAddress);
        TEXT_BOX_FRAME_STEPS.submitClick();
        TEXT_BOX_FRAME_STEPS.checkOutputDataIsCorrect(name, email, currAddress, permAddress);
    }

    @Test(testName = "Тестирование Check Boxes")
    public void checkBoxesTest() {
        mainPage.elementsCard.cardClick();
        menu.openFrame("Check Box");

        CHECK_BOX_FRAME_STEPS.openAllCheckBoxes();

        CHECK_BOX_FRAME_STEPS.selectCheckBoxes(List.of("Commands", "WorkSpace", "Private", "Excel File.doc"));
        CHECK_BOX_FRAME_STEPS.checkResult();
    }

    @Test(testName = "Тестирование Radio Buttons")
    public void radioButtonsTest() {
        mainPage.elementsCard.cardClick();
        menu.openFrame("Radio Button");

        RADIO_BUTTON_FRAME_STEPS.clickRadioYesAndCheckResult();
        RADIO_BUTTON_FRAME_STEPS.clickRadioImpressiveAndCheckResult();
        RADIO_BUTTON_FRAME_STEPS.checkRadioNoNotActive();
    }

    @Test(testName = "Тестирование WebTable")
    public void webTableTest() {
        mainPage.elementsCard.cardClick();
        menu.openFrame("Web Tables");
    }

    @Test(testName = "Тестирование Buttons")
    public void buttonsTest() {
        mainPage.elementsCard.cardClick();
        menu.openFrame("Buttons");

        BUTTON_FRAME_STEPS.clickDoubleClickButtonAndCheckResultMessage("double click");
        BUTTON_FRAME_STEPS.clickRightClickButtonAndCheckResultMessage("right click");
        BUTTON_FRAME_STEPS.clickDynamicClickButtonAndCheckResultMessage("dynamic click");
    }

    @Test(testName = "Тестирование Links")
    public void linksTest() {
        mainPage.elementsCard.cardClick();
        menu.openFrame("Links");

        LINK_FRAME_STEPS.clickSimpleLink();
        LINK_FRAME_STEPS.clickDynamicLink();
        LINK_FRAME_STEPS.clickAllApiLink();
    }

}
