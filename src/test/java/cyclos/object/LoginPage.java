package cyclos.object;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LoginPage {
	
	public LoginPage() {
		
	}
@FindBy(xpath="//a[@id='login-link']")
	
	private WebElement login_btn;
	
	
@FindBy(xpath="//input[@type='text']")
	
	private WebElement username;

@FindBy(xpath="//input[@type='password']")

private WebElement password;

@FindBy(xpath="//button[@type='button']")

private WebElement btn;

}
