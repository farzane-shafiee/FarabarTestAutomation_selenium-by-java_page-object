package Application.Establishment.LoginSecurity.testCase;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import Application.DataWarehouse.BasicInformation.Dimensions.SimpleBasicInformation.pageObject.BasicInformationPage;
import Application.DataWarehouse.BasicInformation.Dimensions.SimpleBasicInformation.pageObject.SimpleBasicInformationPage;
import Application.Establishment.LoginSecurity.pageObject.LoginPage;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCase_Login {
	WebDriver driver;
  @Test
  public void f() throws IOException {
	//Login
	  LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	  CsvReader LoginData = new CsvReader();
	  loginPage.login(LoginData.LoginFile());
	//Assertion
	  Assert.assertEquals("http://localhost:8080/",driver.getCurrentUrl());
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/Drivers/chromedriver_95.exe");
	  driver = new ChromeDriver();
	  driver.get("http://localhost:8080/");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
