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
import org.testng.annotations.AfterMethod;

public class TestCase_DeleteValueBasicInformaion_01011 {
	WebDriver driver;

	@Test()
	public void f() throws IOException, InterruptedException {
		//Login
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		CsvReader LoginData = new CsvReader();
		loginPage.login(LoginData.LoginFile());

		//Go to Create Simple Basic Information Alphabet
		String UDTyear = "سال 1400";

		BasicInformationPage basicInformationPage = PageFactory.initElements(driver, BasicInformationPage.class);
		basicInformationPage.CreateBasicInformation();

		//creat UDT ToStudio
		SimpleBasicInformationPage simpleBasicInformationPage = new SimpleBasicInformationPage(driver);
		simpleBasicInformationPage.CreateSimpleType_AlphabetOrderby(UDTyear);
		
		//Add Child
		SimpleBasicInformationPage addChildToStudio = new SimpleBasicInformationPage(driver);
		  addChildToStudio.AddChildToStudio(UDTyear);

		//create value
		CsvReader basicInformationData = new CsvReader();
		  simpleBasicInformationPage.CreateValueForSimpleType_year_AlphabetOrderby(basicInformationData.CreateBasicInformationAlphabet_year());
		  simpleBasicInformationPage.CreateValueForSimpleType_month_AlphabetOrderby(basicInformationData.CreateBasicInformationAlphabet_month());
		  simpleBasicInformationPage.CreateValueForSimpleType_day_AlphabetOrderby(basicInformationData.CreateBasicInformationAlphabet_day());
		  
		//Delete value
		  SimpleBasicInformationPage deleteValueBasicInformation = new SimpleBasicInformationPage(driver);
		  deleteValueBasicInformation.DeleteValueBasicInformation();
	}

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
