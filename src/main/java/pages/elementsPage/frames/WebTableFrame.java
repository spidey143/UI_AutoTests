package pages.elementsPage.frames;

import elements.Button;
import elements.Input;
import elements.UserTable;
import org.openqa.selenium.By;

public class WebTableFrame {

    public Button addNewRecordButton = new Button(By.id("addNewRecordButton"), "Кнопка добавления новой записи");
    public final Input firstName = new Input(By.id("firstName"), "Текстовое поле firstName");
    public final Input lastName = new Input(By.id("lastName"), "Текстовое поле lastName");
    public final Input email = new Input(By.id("userEmail"), "Текстовое поле Email");
    public final Input age = new Input(By.id("age"), "Текстовое поле age");
    public final Input salary = new Input(By.id("salary"), "Текстовое поле salary");
    public final Input department = new Input(By.id("department"), "Текстовое поле department");
    public final Button submitButton = new Button(By.id("submit"), "Кнопка Submit");
    public UserTable userTable = new UserTable(By.xpath("//div[@class='rt-table']"));
}
