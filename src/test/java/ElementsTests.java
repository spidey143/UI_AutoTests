import com.codeborne.selenide.WebDriverRunner;
import models.OutputClickSubmitModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import service.BaseTest;
import utils.Generator;

import java.io.IOException;

public class ElementsTests extends BaseTest {
    @Test(testName ="Тестирование Text Box")
    public void textBoxFormFillingTest(){
        MainPage mainPage = new MainPage();
        ElementsPage elementsPage = mainPage.openElementsPage();
        Assert.assertEquals(
                WebDriverRunner.getWebDriver().getCurrentUrl(),
                "https://demoqa.com/elements");

        TextBoxPage textBoxPage = elementsPage.openTextBoxPage();
        Assert.assertEquals(
                WebDriverRunner.getWebDriver().getCurrentUrl(),
                "https://demoqa.com/text-box");
        TEXT_BOX_PAGE_STEPS.fillTextBoxForm(textBoxPage);
        TEXT_BOX_PAGE_STEPS.submitButtonClick(textBoxPage);

        OutputClickSubmitModel expectedModel = new OutputClickSubmitModel(
                textBoxPage.getCurrentAddress().getValue(),
                textBoxPage.getEmail().getValue(),
                textBoxPage.getPermanentAddress().getValue(),
                textBoxPage.getFullName().getValue()
        );
        OutputClickSubmitModel actualModel = TEXT_BOX_PAGE_STEPS.checkOutputDataIsCorrect();
        Assert.assertEquals(actualModel, expectedModel);
    }

    @Test(testName = "Тестирование Check Box")
    public void checkBoxTest(){

        MainPage mainPage = new MainPage();
        ElementsPage elementsPage = mainPage.openElementsPage();
        CheckBoxPage checkBoxPage = elementsPage.openCheckBoxPage();

        checkBoxPage.getTextSelectedCheckBoxes();

    }

    @Test(testName = "Тестирование Radio Button")
    public void radioButtonsTest() throws InterruptedException {
        MainPage mainPage = new MainPage();
        ElementsPage elementsPage = mainPage.openElementsPage();
        RadioButtonPage radioButtonPage = elementsPage.openRadioButtonPage();

        radioButtonPage.yesRadioSelect();
        Assert.assertEquals(radioButtonPage.getText().text(),"Yes");

        radioButtonPage.impressiveRadioSelect();
        Assert.assertEquals(radioButtonPage.getText().text(),"Impressive");

        radioButtonPage.checkNoRadioIsDisabled();
        Thread.sleep(5000);
    }
}
