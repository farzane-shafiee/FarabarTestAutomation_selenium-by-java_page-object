package Application.DataWarehouse.BasicInformation.Dimensions.SimpleBasicInformation.testCase.AlphabetOderby;



import org.testng.annotations.Test;
import Application.DataWarehouse.BasicInformation.Dimensions.SimpleBasicInformation.testCase.DataProvidersBasicInformation;
import Application.DataWarehouse.BasicInformation.Dimensions.SimpleBasicInformation.pageObject.BasicInformationPage;
import Application.DataWarehouse.BasicInformation.Dimensions.SimpleBasicInformation.pageObject.SimpleBasicInformationPage;
import Application.Establishment.LoginSecurity.pageObject.LoginPage;
import Application.Establishment.LoginSecurity.testCase.CsvReader;
import Application.Establishment.LoginSecurity.testCase.DataProviders;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCase_CreateBasicInformaion_AlphabetOderby_01001 {
	WebDriver driver;
  
  @Test()
  public void f() throws IOException, InterruptedException {
	//Login
	  LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	  CsvReader LoginData = new CsvReader();
	  loginPage.login(LoginData.LoginFile());
	  
	//Go to Create Simple Basic Information Alphabet
	  String title = "سال";
	  BasicInformationPage basicInformationPage = PageFactory.initElements(driver, BasicInformationPage.class);
	  basicInformationPage.CreateBasicInformation();
	  
	  SimpleBasicInformationPage simpleBasicInformationPage = new SimpleBasicInformationPage(driver);
		simpleBasicInformationPage.CreateSimpleType_AlphabetOrderby(title);
		
	//Assertion
		int count_AfterAction = simpleBasicInformationPage.AssertionCreateBasicInformation();
		Assert.assertEquals(count_AfterAction, 1);
  }
  //@BeforeMethod(dataProvider="Login" , dataProviderClass = DataProviders.class)
  @BeforeMethod()
  public void beforeMethod() throws IOException {
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/Drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://localhost:8080/");
  }
  
  @AfterMethod
  public void afterMethod() {
  }

}
