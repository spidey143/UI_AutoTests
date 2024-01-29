package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import java.util.Locale;
import java.util.Objects;
import java.util.Random;

import static com.codeborne.selenide.Selenide.*;

public class CheckBoxPage {
    private final SelenideElement homeCheckBox = $x("//label[@for='tree-node-home']/span[@class='rct-checkbox']");
    private final ElementsCollection result = $$x("//div[@id='result']/span[contains(@class,'text-success')]");
    private final ElementsCollection selectedCheckBoxes = $$("label > input[type='checkbox']:checked ~ span:last-child");
    private final ElementsCollection allCheckBoxes = $$("span.rct-text span.rct-title");
    private final SelenideElement expandAllCheckBoxesButton = $x("//button[@title='Expand all']");

    public String getTextSelectedCheckBoxes(){
        expandAllCheckBoxesButton.click();
        StringBuilder sb = new StringBuilder();
        for (SelenideElement element : selectedCheckBoxes) {
            if(element.getText().contains("File")){
                sb.append(element.getText().substring(0,1).toLowerCase())
                        .append(element.getText().substring(1)
                                .replace(".doc","")
                                .replace(" ", "")).append(" ");
            }else{
            sb.append(element.getText().toLowerCase()).append(" ");}
        }
        return sb.toString();
    }

    public String getResultTextSelectedCheckBoxes(){
        StringBuilder sb = new StringBuilder();
        for (SelenideElement element : result) {
            sb.append(element.getText()).append(" ");
        }
        return sb.toString();
    }

    public void selectAllCheckBoxes(){
        homeCheckBox.click();
    }

    public void selectRandomCheckBoxes(){
        expandAllCheckBoxesButton.click();
        for (SelenideElement element : allCheckBoxes) {
            if(new Random().nextInt(2) == 1) element.click();
        }
    }

}



