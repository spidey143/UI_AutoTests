package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.executeJavaScript;

@Data
public class RadioButtonPage {
    private SelenideElement yesRadio = $x("//label[@for='yesRadio']");
    private SelenideElement impressiveRadio = $x("//label[@for='impressiveRadio']");
    private SelenideElement noRadio = $x("//input[@id='noRadio']");
    private SelenideElement text = $x("//span[@class='text-success']");

    public void yesRadioSelect(){
        yesRadio.click();
    }

    public void impressiveRadioSelect(){
        impressiveRadio.click();
    }

    public void checkNoRadioIsDisabled(){
       /* executeJavaScript(
                "var noRadio = document.querySelector('input#noRadio');" +
                "noRadio.removeAttribute(\"disabled\");"+
                        "noRadio.setAttribute(\"enabled\",\"\")");*/
        noRadio.shouldBe(Condition.disabled);
    }
}
