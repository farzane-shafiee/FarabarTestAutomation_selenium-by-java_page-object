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

public class TestCase_DeleteBasicInformaion_01008 {
	WebDriver driver;

	@Test()
	public void f() throws IOException, InterruptedException {
		//Login
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		CsvReader LoginData = new CsvReader();
		loginPage.login(LoginData.LoginFile());

		//Go to Create Simple Basic Information Alphabet
		String UDTyear = "سال00";
		String UDTmonth = "ماه00";
		String UDTday = "روز00";

		BasicInformationPage basicInformationPage = PageFactory.initElements(driver, BasicInformationPage.class);
		basicInformationPage.CreateBasicInformation();

		//create UDT ToStudio
		SimpleBasicInformationPage simpleBasicInformationPage = new SimpleBasicInformationPage(driver);
		simpleBasicInformationPage.CreateSimpleType_AlphabetOrderby(UDTyear);

		//new Child	
		SimpleBasicInformationPage addChildToStudio = new SimpleBasicInformationPage(driver);
		addChildToStudio.NewChildToStudio(UDTmonth);
		addChildToStudio.NewChildToStudio(UDTday);

		//delete Basic Information
		SimpleBasicInformationPage deleteBasicInformation = new SimpleBasicInformationPage(driver);
		deleteBasicInformation.DeleteBasicInformation();
		
		//Assertion
		int count_AfterAction = simpleBasicInformationPage.AssertionCreateBasicInformation();
		Assert.assertEquals(count_AfterAction, 1);
		Thread.sleep(1000);
		Assert.assertEquals(simpleBasicInformationPage.AssertionNewChild(UDTyear), UDTyear);

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
