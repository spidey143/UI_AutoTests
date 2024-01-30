import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import service.BaseTest;
import utils.Generator;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;


public class ElementsTests extends BaseTest {

    private String name,email,currAddress,permAddress;
    @BeforeClass
    public void generateData(){
        name = Generator.generateRandomString(5);
        email = Generator.generateRandomEmail(8);
        currAddress = Generator.generateRandomString(5);
        permAddress = Generator.generateRandomString(5);
    }

    @Test(testName = "Тестирование Text Box")
    public void textBoxesTest() {
        mainPage.elementsCard.cardClick();
        menu.openFrame("Text Box");
        TEXT_BOX_FRAME_STEPS.fillForm(name,email,currAddress,permAddress);
        TEXT_BOX_FRAME_STEPS.submitClick();
        TEXT_BOX_FRAME_STEPS.checkOutputDataIsCorrect(name,email,currAddress,permAddress);
    }

    @Test(testName = "Тестирование Check Box")
    public void checkBoxesTest() {
        mainPage.elementsCard.cardClick();
        menu.openFrame("Check Box");
        elementsPage.checkBoxFrame.toggleButtonHome.buttonClick();
        elementsPage.checkBoxFrame.toggleButtonDesktop.buttonClick();
        elementsPage.checkBoxFrame.toggleButtonDocuments.buttonClick();
        elementsPage.checkBoxFrame.toggleButtonWorkspace.buttonClick();
        elementsPage.checkBoxFrame.toggleButtonOffice.buttonClick();
        elementsPage.checkBoxFrame.toggleButtonDownloads.buttonClick();
    }

    @Test(testName = "Тестирование Radio Button")
    public void radioButtonsTest() {
        mainPage.elementsCard.cardClick();
        menu.openFrame("Radio Button");
        RADIO_BUTTON_FRAME_STEPS.clickRadioYesAndCheckResultTextIsCorrect();
        RADIO_BUTTON_FRAME_STEPS.clickRadioImpressiveAndCheckResultTextIsCorrect();
        RADIO_BUTTON_FRAME_STEPS.checkRadioNoNotActive();
    }
}
