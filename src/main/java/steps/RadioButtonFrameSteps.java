package steps;

import io.qameta.allure.Step;
import org.testng.Assert;
import pages.BasePage;

public class RadioButtonFrameSteps extends BasePage {
    @Step("Нажать на радио кнопку Yes и проверить что результириющий текст корректен")
    public void clickRadioYesAndCheckResult() {
        elementsPage.radioButtonFrame.yesRadio.buttonClick();
        Assert.assertEquals(elementsPage.radioButtonFrame.resultText.getText(), "Yes");
    }

    @Step("Нажать на радио кнопку Impressive и проверить что результириющий текст корректен")
    public void clickRadioImpressiveAndCheckResult() {
        elementsPage.radioButtonFrame.impressiveRadio.buttonClick();
        Assert.assertEquals(elementsPage.radioButtonFrame.resultText.getText(), "Impressive");
    }

    @Step("Проверить что радио кнопка No не активна")
    public void checkRadioNoNotActive() {
        Assert.assertFalse(elementsPage.radioButtonFrame.noRadio.isEnabled());
    }
}
