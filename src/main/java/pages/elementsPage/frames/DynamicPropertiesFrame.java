package pages.elementsPage.frames;

import com.codeborne.selenide.SelenideElement;
import elements.Button;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$x;

public class DynamicPropertiesFrame {
    public Button enableAfterFiveSecondsButton = new Button(
            By.id("enableAfter"),
            "Кнопка доступная после 5 секнуд");
    public Button visibleAfterFiveSecondsButton = new Button(
            By.id("visibleAfter"),
            "Кнопка становящаяся видимой после 5 секнуд");
    public Button changeColorButton = new Button(By.id("colorChange"), "Кнопка у которой меняется цвет");
    public SelenideElement textHasRandomId = $x("//p[contains(text(), 'random Id')]");
}
