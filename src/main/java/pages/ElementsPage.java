package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.$x;

public class ElementsPage {
    private final SelenideElement textBoxPage = $x("//*[@id=\"item-0\"]");
    private final SelenideElement checkBoxPage = $x("//*[@id=\"item-1\"]");
    private final SelenideElement radioButtonPage = $x("//*[@id=\"item-2\"]");
    public TextBoxPage openTextBoxPage() {
        textBoxPage.click();
        return new TextBoxPage();
    }

    public CheckBoxPage openCheckBoxPage() {
        checkBoxPage.click();
        return new CheckBoxPage();
    }

    public RadioButtonPage openRadioButtonPage() {
        radioButtonPage.click();
        return new RadioButtonPage();
    }

}
