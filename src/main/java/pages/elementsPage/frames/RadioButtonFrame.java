package pages.elementsPage.frames;

import com.codeborne.selenide.SelenideElement;
import elements.RadioButton;
import elements.RadioButton;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$x;

public class RadioButtonFrame {
    public RadioButton yesRadio = new RadioButton(By.id("yesRadio"),"Радиокнопка ес");
    public RadioButton impressiveRadio = new RadioButton(By.id("impressiveRadio"),"Радиокнопка impressive");
    public RadioButton noRadio = new RadioButton(By.id("noRadio"), "Радиокнопка impressive");
    public SelenideElement resultText = $x("//span[@class='text-success']");
}
