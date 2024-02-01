package pages.elementsPage.frames;

import elements.UserTable;
import org.openqa.selenium.By;

public class WebTableFrame {
    public UserTable userTable = new UserTable(By.xpath("//div[@class='rt-table']"));
}
