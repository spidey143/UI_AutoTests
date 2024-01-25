import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import service.BaseTest;
import utils.Generator;

import java.io.IOException;

public class ElementsTests extends BaseTest {
    @Test
    public void textBoxFormFillingTest() throws InterruptedException, IOException {
        MainPage mainPage = new MainPage();
        ElementsPage elementsPage = mainPage.goToElements();
        Assert.assertEquals(
                WebDriverRunner.getWebDriver().getCurrentUrl(),
                "https://demoqa.com/elements");

        TextBoxPage textBoxPage = elementsPage.openTextBoxPage();
        Assert.assertEquals(
                WebDriverRunner.getWebDriver().getCurrentUrl(),
                "https://demoqa.com/text-box");
        TEXT_BOX_PAGE_STEPS.fillTextBoxForm(textBoxPage);
        TEXT_BOX_PAGE_STEPS.submitButtonClick(textBoxPage);
        TEXT_BOX_PAGE_STEPS.checkOutputDataIsCorrect();
    }

    @Test
    public void radioButtonsTest() throws InterruptedException {
        MainPage mainPage = new MainPage();
        ElementsPage elementsPage = mainPage.goToElements();
        RadioButtonPage radioButtonPage = elementsPage.openRadioButtonPage();
        radioButtonPage.yesRadioSelect();
        radioButtonPage.impressiveRadioSelect();
        radioButtonPage.noRadioSelect();
        Thread.sleep(5000);

    }
}
