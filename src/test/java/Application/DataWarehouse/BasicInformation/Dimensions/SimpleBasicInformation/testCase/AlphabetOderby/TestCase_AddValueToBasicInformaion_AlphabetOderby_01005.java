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
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCase_AddValueToBasicInformaion_AlphabetOderby_01005 {
	WebDriver driver;

	@Test()
	public void f() throws IOException, InterruptedException {
		//Login
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		CsvReader LoginData = new CsvReader();
		loginPage.login(LoginData.LoginFile());

		//Go to Create Simple Basic Information Alphabet
		String title = "سال 1400";
		BasicInformationPage basicInformationPage = PageFactory.initElements(driver, BasicInformationPage.class);
		basicInformationPage.CreateBasicInformation();

		SimpleBasicInformationPage simpleBasicInformationPage = new SimpleBasicInformationPage(driver);
		simpleBasicInformationPage.CreateSimpleType_AlphabetOrderby(title);

		//AddChildToStudio
		SimpleBasicInformationPage addChildToStudio = new SimpleBasicInformationPage(driver);
		addChildToStudio.AddChildToStudio(title);

		//CreateValueForSimpleType_AlphabetOrderby_year_month_day
		CsvReader basicInformationData = new CsvReader();
		simpleBasicInformationPage.CreateValueForSimpleType_year_AlphabetOrderby(basicInformationData.CreateBasicInformationAlphabet_year());
		simpleBasicInformationPage.CreateValueForSimpleType_month_AlphabetOrderby(basicInformationData.CreateBasicInformationAlphabet_month());
		simpleBasicInformationPage.CreateValueForSimpleType_day_AlphabetOrderby(basicInformationData.CreateBasicInformationAlphabet_day());

		//AddValueToBasicInformation_AlphabetOrderby
		simpleBasicInformationPage.AddValueToBasicInformation_AlphabetOrderby();

		//Assertion Child
		Thread.sleep(2000);
		int Count_AfterActionAddChild = simpleBasicInformationPage.AssertionCreateBasicInformation();
		Assert.assertEquals(Count_AfterActionAddChild, 3);

		//Assertion Value year
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[2]/div/div[1]/div")).click(); // click on year
		int Count_BeforActionAddValueYear = basicInformationData.CreateBasicInformationAlphabet_year().size();
		int Count_AfterActionAddValueYear = simpleBasicInformationPage.AssertionCreateBasicInformaionByValue();
		Assert.assertEquals(Count_AfterActionAddValueYear, Count_BeforActionAddValueYear);

		//Assertion Add Value Year
		WebElement scrollListYear = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div[2]"));
		List<WebElement> listYear = scrollListYear.findElements(By.className("gFFKLG"));
		for(int i=0 ; i<listYear.size() ; i++) {
			listYear.get(i).click();
			Assert.assertEquals(simpleBasicInformationPage.AssertionAddValueToBasicInformation(), true);
		}

		//Assertion Value month
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[2]/div/div[2]/div")).click(); // click on Month
		int Count_BeforActionAddValueMonth = basicInformationData.CreateBasicInformationAlphabet_month().size();
		int Count_AfterActionAddValueMonth = simpleBasicInformationPage.AssertionCreateBasicInformaionByValue();
		Assert.assertEquals(Count_AfterActionAddValueMonth, Count_BeforActionAddValueMonth);

		//Assertion Add Value Month
		WebElement scrollListMonth = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div[2]"));
		List<WebElement> listMonth = scrollListMonth.findElements(By.className("gFFKLG"));
		for(int i=0 ; i<listMonth.size() ; i++) {
			listMonth.get(i).click();
			Assert.assertEquals(simpleBasicInformationPage.AssertionAddValueToBasicInformation(), true);
		}

		//Assertion Value day
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[2]/div/div[3]/div")).click(); // click on Day
		int Count_BeforActionAddValueDay = basicInformationData.CreateBasicInformationAlphabet_day().size();
		int Count_AfterActionAddValueDay = simpleBasicInformationPage.AssertionCreateBasicInformaionByValue();
		Assert.assertEquals(Count_AfterActionAddValueDay, Count_BeforActionAddValueDay);

		//Assertion Add Value Day
		WebElement scrollListDay = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div[2]"));
		List<WebElement> listDay = scrollListDay.findElements(By.className("gFFKLG"));
		for(int i=0 ; i<listDay.size() ; i++) {
			listDay.get(i).click();
			Assert.assertEquals(simpleBasicInformationPage.AssertionAddValueToBasicInformation(), true);
		}
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
