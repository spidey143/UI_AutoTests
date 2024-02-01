package pages.formsPage;

import elements.Input;
import org.openqa.selenium.By;

public class PracticeFormFrame {
    public Input firstName = new Input(By.id("firstName"), "Текстовое поле First Name");
    public Input lastName = new Input(By.id("lastName"), "Текстовое поле Last Name");
}
