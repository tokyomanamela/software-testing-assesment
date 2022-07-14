package automationSolution;

import org.openqa.selenium.WebElement;


public class HelperMethods {

	public HelperMethods() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void ClickObject(WebElement ele) {
		
		ele.click();
		
	}
	
public void SentKeys(WebElement ele,  String Text) {
		
		ele.clear();
		ele.sendKeys(Text);
		
	}

}
