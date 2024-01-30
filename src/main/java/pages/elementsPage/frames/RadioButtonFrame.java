package pages.elementsPage.frames;

import com.codeborne.selenide.SelenideElement;
import elements.RadioButton;
import elements.RadioButton;

import static com.codeborne.selenide.Selenide.$x;

public class RadioButtonFrame {
    public RadioButton yesRadio = new RadioButton("yesRadio");
    public RadioButton impressiveRadio = new RadioButton("impressiveRadio");
    public RadioButton noRadio = new RadioButton("noRadio");
    public SelenideElement resultText = $x("//span[@class='text-success']");
}
