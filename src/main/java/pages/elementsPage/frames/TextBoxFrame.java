package pages.elementsPage.frames;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import elements.Button;
import elements.Input;
import elements.TextArea;
import elements.base.BaseElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class TextBoxFrame {
    public final Input fullName = new Input(By.id("userName"), "Текстовое поле FullName");
    public final Input email = new Input(By.id("userEmail"), "Текстовое поле Email");
    public final TextArea currentAddress =  new TextArea(By.id("currentAddress"), "полено");
    public final TextArea permanentAddress =  new TextArea(By.id("permanentAddress"), "Растягивающее полено");
    public final Button submitButton = new Button(By.id("submit"), "Кнопка Submit");
    public final SelenideElement outputName = $x("//p[@id='name']");
    public final SelenideElement outputEmail = $x("//p[@id='email']");;
    public final SelenideElement outputCurrentAddress = $x("//p[@id='currentAddress']");;
    public final SelenideElement outputPermanentAddress = $x("//p[@id='permanentAddress']");;
}
