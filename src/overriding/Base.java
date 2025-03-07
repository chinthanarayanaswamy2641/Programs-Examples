package overriding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base {

	WebDriver driver;

    public Base(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElement(WebElement element) {
        System.out.println("Clicking on element using Selenium");
        element.click();
    }
}
