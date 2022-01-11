package Application.Establishment.LoginSecurity.pageObject;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

public class LoginPage {
	WebDriver driver;
	Actions action;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[1]/input[1]") WebElement username;
	@FindBy(xpath="/html/body/div[1]/div/div/div[1]/input[2]") WebElement password;
	@FindBy(className="eSWFEJ") WebElement insert;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);	
		action = new Actions(driver);
	}
	
//	public void login(Iterator<String[]> login) {
//		
//		//Iterator<String[]> loginDataIt = login.iterator();
//		
//			username.sendKeys(login.next());
//			pw.sendKeys(login.next());
//		
////		username.sendKeys(loginData.get(0));
////		pw.sendKeys(loginData.get(0));
//		insert.click();
//	}
	
public void login(List<String[]> list) {
		
		//Iterator<String[]> loginDataIt = login.iterator();
		
		username.sendKeys(list.get(0));
		password.sendKeys(list.get(1));
		insert.click();
	}

//@Override
//protected void load() {
//	// TODO Auto-generated method stub
//	driver.get("http://localhost:8080/");
//}
//
//@Override
//protected void isLoaded() throws Error {
//	// TODO Auto-generated method stub
//	Assert.assertEquals(true,username.isEnabled());
//}

}
