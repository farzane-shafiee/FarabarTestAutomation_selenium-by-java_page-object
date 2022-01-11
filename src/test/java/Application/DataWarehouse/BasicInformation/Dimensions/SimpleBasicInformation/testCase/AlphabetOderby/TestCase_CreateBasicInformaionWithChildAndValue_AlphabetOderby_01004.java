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

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCase_CreateBasicInformaionWithChildAndValue_AlphabetOderby_01004 {
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
	  
	  //Add Child	
	  SimpleBasicInformationPage addChildToStudio = new SimpleBasicInformationPage(driver);
	  addChildToStudio.AddChildToStudio(title);
	  
	  //create value
	  CsvReader basicInformationData = new CsvReader();
	  simpleBasicInformationPage.CreateValueForSimpleType_year_AlphabetOrderby(basicInformationData.CreateBasicInformationAlphabet_year());
	  simpleBasicInformationPage.CreateValueForSimpleType_month_AlphabetOrderby(basicInformationData.CreateBasicInformationAlphabet_month());
	  simpleBasicInformationPage.CreateValueForSimpleType_day_AlphabetOrderby(basicInformationData.CreateBasicInformationAlphabet_day());
	  
	  //Assertion Child
	  Thread.sleep(2000);
	  int Count_AfterActionAddChild = simpleBasicInformationPage.AssertionCreateBasicInformation();
	  Assert.assertEquals(Count_AfterActionAddChild, 3);
	  
	  //Assertion Value
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[2]/div/div[1]/div")).click();
	  int Count_BeforActionAddValueYear = basicInformationData.CreateBasicInformationAlphabet_year().size();
	  int Count_AfterActionAddValueYear = simpleBasicInformationPage.AssertionCreateBasicInformaionByValue();
	  Assert.assertEquals(Count_AfterActionAddValueYear, Count_BeforActionAddValueYear);
	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[2]/div/div[2]/div")).click();
	  int Count_BeforActionAddValueMonth = basicInformationData.CreateBasicInformationAlphabet_month().size();
	  int Count_AfterActionAddValueMonth = simpleBasicInformationPage.AssertionCreateBasicInformaionByValue();
	  Assert.assertEquals(Count_AfterActionAddValueMonth, Count_BeforActionAddValueMonth);
	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[2]/div/div[3]/div")).click();
	  int Count_BeforActionAddValueDay = basicInformationData.CreateBasicInformationAlphabet_day().size();
	  int Count_AfterActionAddValueDay = simpleBasicInformationPage.AssertionCreateBasicInformaionByValue();
	  Assert.assertEquals(Count_AfterActionAddValueDay, Count_BeforActionAddValueDay);
	  
	  
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
