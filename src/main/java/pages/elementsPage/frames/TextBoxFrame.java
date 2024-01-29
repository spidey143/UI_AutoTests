package pages.elementsPage.frames;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import elements.Button;
import elements.Input;
import elements.TextArea;
import elements.base.BaseElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class TextBoxFrame {
    public final Input fullName = new Input("userName");
    public final Input email = new Input("userEmail");
    public final TextArea currentAddress =  new TextArea("currentAddress");
    public final TextArea permanentAddress =  new TextArea("permanentAddress");
    public final Button submitButton = new Button("Submit");
}
