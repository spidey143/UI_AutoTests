package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RadioButtonPage {
    private SelenideElement yesRadio = $x("//label[@for='yesRadio']");
    private SelenideElement impressiveRadio = $x("//label[@for='impressiveRadio']");
    private SelenideElement noRadio = $x("//label[@for='noRadio']");
    private SelenideElement text;

    public void yesRadioSelect(){
        yesRadio.click();
    }

    public void impressiveRadioSelect(){
        impressiveRadio.click();
    }

    public void noRadioSelect(){
        executeJavaScript(
                "var noRadio = document.querySelector('input#noRadio');" +
                "noRadio.removeAttribute(\"disabled\");"+
                        "noRadio.setAttribute(\"enabled\",\"\")");
        noRadio.click();
    }
}
