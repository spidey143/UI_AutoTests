package pages.elementsPage.frames;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import elements.ToggleButton;

import java.util.Random;

import static com.codeborne.selenide.Selenide.*;

public class CheckBoxFrame {
    public final ToggleButton toggleButtonHome = new ToggleButton("home");
    public final ToggleButton toggleButtonDesktop = new ToggleButton("desktop");
    public final ToggleButton toggleButtonDocuments = new ToggleButton("documents");
    public final ToggleButton toggleButtonWorkspace = new ToggleButton("workspace");
    public final ToggleButton toggleButtonOffice = new ToggleButton("office");
    public final ToggleButton toggleButtonDownloads = new ToggleButton("downloads");
    public final ElementsCollection selectedCheckBoxes = $$("label > input[type='checkbox']:checked ~ span:last-child");
    public final ElementsCollection allCheckBoxes = $$("span.rct-text span.rct-title");
    public final ElementsCollection result = $$x("//div[@id='result']/span[contains(@class,'text-success')]");
}
