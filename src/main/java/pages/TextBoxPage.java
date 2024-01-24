package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.*;

@Data
public class TextBoxPage {
    private final SelenideElement fullName = $x("//input[@id='userName']");
    private final SelenideElement email = $x("//input[@id='userEmail']");
    private final SelenideElement currentAddress = $x("//textarea[@id='currentAddress']");
    private final SelenideElement permanentAddress = $x("//textarea[@id='permanentAddress']");
    private final SelenideElement submitButton = $x("//button[@id='submit']");
    private final ElementsCollection outputData = $$x("//div[@id='output']//p");

    public TextBoxPage() {
        Selenide.open("text-box");
    }
    public SelenideElement sendValueToInputFullName(String value) {
        return fullName.setValue(value);
    }
    public SelenideElement sendValueToInputEmail(String value) {
        return email.setValue(value);
    }
    public SelenideElement sendValueToInputCurrAddress(String value){
        return currentAddress.setValue(value);
    }
    public SelenideElement sendValueToInputPermAddress(String value){
        return permanentAddress.setValue(value);
    }
    public void submitButtonClick(){
        submitButton.click();
    }
}
