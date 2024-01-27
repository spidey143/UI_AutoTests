package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class CheckBoxPage {
    private final SelenideElement homeCheck = $x("//label[@for='tree-node-home']/span[@class='rct-checkbox']");
    private final SelenideElement desktopCheck = $x("//label[@for='tree-node-home']/span[@class='rct-checkbox']");
    private final SelenideElement documentsCheck = $x("//label[@for='tree-node-home']/span[@class='rct-checkbox']");
    private final SelenideElement downloadsCheck = $x("//label[@for='tree-node-home']/span[@class='rct-checkbox']");
    private final ElementsCollection result = $$x("//div[@id='result']/span[contains(@class,'text-success')]");
    private final ElementsCollection selectedChecks = $$x("//*/ancestor::label/span[@class='rct-title']");

    private final SelenideElement toggleBtn = $x("//button[@title='Expand all']");

    public void getTextSelectedCheckBoxes(){
        toggleBtn.click();
        StringBuilder sb = new StringBuilder();
        for (SelenideElement element : selectedChecks) {
            sb.append(element.getText().toLowerCase()).append(" ");
        }
        System.out.println(sb);
    }

}



