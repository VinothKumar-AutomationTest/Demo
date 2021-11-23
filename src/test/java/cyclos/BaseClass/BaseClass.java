package cyclos.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	public static   WebDriver lanuchbrowser() {
		System.setProperty("webdriver.chrome.driver", "");
		 return driver=new ChromeDriver();
	}
}
