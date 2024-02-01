package steps;

import org.testng.Assert;
import pages.BasePage;

import java.awt.*;

public class ButtonsFrameSteps extends BasePage {

    public void clickDoubleClickButtonAndCheckResultMessage(String message) {
        elementsPage.buttonsFrame.doubleClickButton.doubleClick();
        Assert.assertEquals(
                elementsPage.buttonsFrame.doubleClickMessage.getText(),
                "You have done a " + message
        );
    }

    public void clickRightClickButtonAndCheckResultMessage(String message) {
        elementsPage.buttonsFrame.rightClickButton.rightClick();
        Assert.assertEquals(
                elementsPage.buttonsFrame.rightClickMessage.getText(), "You have done a " + message
        );
    }

    public void clickDynamicClickButtonAndCheckResultMessage(String message) {
        elementsPage.buttonsFrame.dinamicClickButton.buttonClick();
        Assert.assertEquals(
                elementsPage.buttonsFrame.dynamicClickMessage.getText(), "You have done a " + message
        );
    }
}
