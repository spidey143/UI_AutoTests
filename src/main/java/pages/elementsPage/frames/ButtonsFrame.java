package pages.elementsPage.frames;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import elements.Button;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$x;

public class ButtonsFrame {
    public Button doubleClickButton = new Button(By.id("doubleClickBtn"), "doubleClickButton");
    public Button rightClickButton = new Button(By.id("rightClickBtn"), "rightClickButton");
    public Button dinamicClickButton = new Button(By.xpath("//button[text()='Click Me']"), "dinamicClickButton");

    public SelenideElement doubleClickMessage = $x("//p[@id='doubleClickMessage']");
    public SelenideElement rightClickMessage = $x("//p[@id='rightClickMessage']");
    public SelenideElement dynamicClickMessage = $x("//p[@id='dynamicClickMessage']");


}
