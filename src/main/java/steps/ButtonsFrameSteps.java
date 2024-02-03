package steps;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.testng.Assert;
import pages.BasePage;

import java.awt.*;

public class ButtonsFrameSteps extends BasePage {

    @Step("Сделать двойной клик на кнопку и проверить результат")
    public void clickDoubleClickButtonAndCheckResultMessage(String message) {
        elementsPage.buttonsFrame.doubleClickButton.doubleClick();
        Assert.assertEquals(
                elementsPage.buttonsFrame.doubleClickMessage.getText(),
                "You have done a " + message
        );
    }

    @Step("Сделать клик правой кнопкой мыши и проверить результат")
    public void clickRightClickButtonAndCheckResultMessage(String message) {
        elementsPage.buttonsFrame.rightClickButton.rightClick();
        Assert.assertEquals(
                elementsPage.buttonsFrame.rightClickMessage.getText(), "You have done a " + message
        );
    }

    @Step("Сделать клик на динамическую кнопку и проверить результат")
    public void clickDynamicClickButtonAndCheckResultMessage(String message) {
        String oldButtonId = elementsPage.buttonsFrame.dinamicClickButton.getAttribute("id");
        elementsPage.buttonsFrame.dinamicClickButton.buttonClick();
        Assert.assertEquals(
                elementsPage.buttonsFrame.dynamicClickMessage.getText(), "You have done a " + message
        );
        Selenide.refresh();
        String newButtonId = elementsPage.buttonsFrame.dinamicClickButton.getAttribute("id");
        Assert.assertNotEquals(oldButtonId, newButtonId);
    }
}
