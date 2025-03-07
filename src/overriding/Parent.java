package overriding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Parent extends Base{

	public Parent(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	 public void clickElement(WebElement element) {
	        System.out.println("Clicking on element with additional logging in LoginPage");
	        element.click(); // Custom implementation if needed
	    }
}
