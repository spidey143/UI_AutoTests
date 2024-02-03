package steps;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.testng.Assert;
import pages.BasePage;

public class DynamicPropertiesFrameSteps extends BasePage {
    public String oldColor, oldTextId;
    public Boolean oldButtonEnabled, oldButtonVisibility;

    @Step("Проверить что после 5 у элементов изменились свойства")
    public void checkElementsHasNewProperties(){
        Selenide.refresh();

        Assert.assertNotEquals(
                oldTextId,elementsPage.dynamicPropertiesFrame.textHasRandomId.getAttribute("id")
        );

        Selenide.sleep(5000);

        Assert.assertNotEquals(
                oldButtonEnabled,
                elementsPage.dynamicPropertiesFrame.enableAfterFiveSecondsButton.isEnabled()
        );

        Assert.assertNotEquals(oldButtonVisibility,
                elementsPage.dynamicPropertiesFrame.visibleAfterFiveSecondsButton.isVisibility()
        );

        Assert.assertNotEquals(oldColor,
                elementsPage.dynamicPropertiesFrame.changeColorButton.getCssValue("color")
        );
    }

    @Step("Получить старые свойства у элементов")
    public void giveOldPropertiesOfElements(){
        oldButtonEnabled = elementsPage.dynamicPropertiesFrame.enableAfterFiveSecondsButton.isEnabled();
        oldButtonVisibility = elementsPage.dynamicPropertiesFrame.visibleAfterFiveSecondsButton.isVisibility();
        oldColor = elementsPage.dynamicPropertiesFrame.changeColorButton.getCssValue("color");
        oldTextId = elementsPage.dynamicPropertiesFrame.textHasRandomId.getAttribute("id");
    }
}
