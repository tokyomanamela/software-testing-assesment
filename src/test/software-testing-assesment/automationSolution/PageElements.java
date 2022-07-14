package automationSolution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;


public class PageElements extends HelperMethods {
	
	public WebDriver driver ;
	public static SoftAssert softAssertion;
	
	public PageElements(WebDriver dr) {
		
		driver = dr;
		PageFactory.initElements(dr, this);
		 softAssertion = new SoftAssert();
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(id = "user-name")
	@CacheLookup
	WebElement userNameTxtBox;
	
	@FindBy(id = "password")
	@CacheLookup
	WebElement PassWordTxtBox;
	
	@FindBy(id = "login-button")
	@CacheLookup
	WebElement Login_Btn;
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	@CacheLookup
	WebElement Backpack;
	
	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	@CacheLookup
	WebElement BikeLight;
	
	@FindBy(xpath = "//*[@id='shopping_cart_container']")
	@CacheLookup
	WebElement ShoppingCart;
	
	@FindBy(id = "checkout")
	@CacheLookup
	WebElement checkOut;
	
	@FindBy(id = "first-name")
	@CacheLookup
	WebElement firstName;
	
	@FindBy(id = "last-name")
	@CacheLookup
	WebElement LastName;
	
	@FindBy(id = "postal-code")
	@CacheLookup
	WebElement postalCode;
	
	@FindBy(id = "continue")
	@CacheLookup
	WebElement continueBtn;

	@FindBy(id = "finish")
	@CacheLookup
	WebElement FinishBtn;   
	
	@FindBy(xpath = "//*[contains(text(),'THANK YOU FOR YOUR ORDER')]")
	@CacheLookup
	WebElement ConfirmationMessage; 
	
	
	@FindBy(xpath = "(//*[@class='inventory_item_price'])[1]")
	@CacheLookup
	WebElement Item1Price; 
	
	@FindBy(xpath = "(//*[@class='inventory_item_price'])[2]")
	@CacheLookup
	WebElement Item2Price; //*[@class='summary_subtotal_label']
	
	@FindBy(xpath = "//*[@class='summary_subtotal_label']")
	@CacheLookup
	WebElement TotalPrice; 
	
	
	public void EnterUserName(String UserName) {
	
		SentKeys(userNameTxtBox,UserName );
		
	}
	
	
	public void TestTotalPrice() {
	
		
		double item1Price  = Double.parseDouble(Item1Price.getText().substring(1)) ;
		double item2Price = Double.parseDouble(Item2Price.getText().substring(1));
		double totPrice = Double.parseDouble(TotalPrice.getText().trim().substring(13));
		double calcTotal =  item1Price + item2Price;
		
		PageElements.softAssertion.assertEquals(calcTotal, totPrice);
	}
	public void EnterPassWordTxtBox(String Password) {
		
		SentKeys(PassWordTxtBox,Password );
		
	}
	public void EnterfirstName(String fName) {
		
		SentKeys(firstName,fName );
		
	}
	public void EnterLastName(String LName) {
		
		SentKeys(LastName,LName );
		
	}
	public void EnterPostalCode(String Code) {
		
		SentKeys(postalCode,Code );
		
	}
	
public void ClickBackPack() {
		
		ClickObject(Backpack);
		
	}
	
	public void ClickLoginButton() {
		
		ClickObject(Login_Btn);
		
	}
	
public void ClickBikeLight() {
		
		ClickObject(BikeLight);
		
	}

public void ClickShoppingCart() {
	
	ClickObject(ShoppingCart);
	
}

public void checkOut() {
	
	ClickObject(checkOut);
	
}

public void ClickContinue() {
	
	ClickObject(continueBtn);
	
}

public void ClickFinishBtn() {
	
	ClickObject(FinishBtn);
	
}

public void confirmOrder() {
	
	if(ConfirmationMessage.isDisplayed()) {
		System.out.println("order successfull");
		softAssertion.assertTrue(true);
	
	}else {
		System.out.println("order Unsuccessfull"); 
		softAssertion.assertTrue(false);
	}
	
}
	
}
