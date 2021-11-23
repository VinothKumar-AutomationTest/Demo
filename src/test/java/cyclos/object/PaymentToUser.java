package cyclos.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentToUser {
	public static WebDriver driver;
	public PaymentToUser()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="")
	private WebElement BankingButton;
	
	@FindBy(xpath="")
	private WebElement PtoUserButton;
	
	@FindBy(xpath="")
	private WebElement UserTextBox;
	
	@FindBy(xpath="")
	private WebElement Amount;

	@FindBy(xpath="")
	private WebElement Desc;
	
	@FindBy (xpath="")
	private WebElement Next_button;
	
	@FindBy (xpath="")
	private WebElement ConfirmButton;
	
}
