package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.$x;

public class ElementsPage {
    public TextBoxPage openTextBoxPage(){
        $x("//*[@id=\"item-0\"]").click();
        return new TextBoxPage();
    }
    public RadioButtonPage openRadioButtonPage(){
        $x("//*[@id=\"item-2\"]").click();
        return new RadioButtonPage();
    }
}
