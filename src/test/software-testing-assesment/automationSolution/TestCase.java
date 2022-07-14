package automationSolution;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase {

	PageElements PageEl;
	WebDriver driver;
	
	
	//String timeStamp = new SimpleDateFormat("yyyy.MM.dd").format(new java.util.Date());
	String reportname = "QA Challenge.html";
	String pageTile = "QA Challenge";
	String TesterName = System.getProperty("user.name");
	
	
	public TestCase() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		driver = new  ChromeDriver();
		driver.manage().window().maximize();
		PageEl = new PageElements(driver);
	
		
	}
	
	@Test
	public void testing() {
		
		driver.get("https://www.saucedemo.com/");
		PageEl.EnterUserName("standard_user");
		PageEl.EnterPassWordTxtBox("secret_sauce");
		PageEl.ClickLoginButton();
		PageEl.ClickBackPack();
		PageEl.ClickBikeLight();
		PageEl.ClickShoppingCart();
		PageEl.checkOut();
		PageEl.EnterfirstName("Tokyo");
		PageEl.EnterLastName("Manamela");
		PageEl.EnterPostalCode("0987");
		PageEl.ClickContinue();
		PageEl.TestTotalPrice();
		PageEl.ClickFinishBtn();
		PageEl.confirmOrder();

	}
	
	@AfterTest
	public void TearDown() {

		driver.quit();
		PageElements.softAssertion.assertAll();
	}

}
