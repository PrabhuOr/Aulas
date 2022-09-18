package BaseTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class HomePage {
 AndroidDriver driver;

public HomePage(AndroidDriver driver) {
	PageFactory.initElements(driver, this);
}




}
