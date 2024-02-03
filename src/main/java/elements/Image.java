package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import elements.base.BaseElement;
import org.openqa.selenium.By;

public class Image extends BaseElement {

    public Image(String src, String name) {
        super(By.xpath("//img[@src='"+src+"']"), name);
    }
    public boolean checkImgIsCorrect() {
        return element.isImage();
    }
}
