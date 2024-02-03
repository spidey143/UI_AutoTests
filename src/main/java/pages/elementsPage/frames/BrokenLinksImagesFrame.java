package pages.elementsPage.frames;

import elements.Image;
import elements.Link;
import org.openqa.selenium.By;

public class BrokenLinksImagesFrame {
    public Link validLink = new Link(By.linkText("Click Here for Valid Link"), "Валидная ссылка");
    public Link invvalidLink = new Link(By.linkText("Click Here for Broken Link"), "Инвалидная ссылка");

    public Image validImage = new Image("/images/Toolsqa.jpg", "Валидная картинка");
    public Image invalidImage = new Image("/images/Toolsqa_1.jpg", "Инвалидная картинка");
}
