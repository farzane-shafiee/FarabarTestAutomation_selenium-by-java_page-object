package Application.DataWarehouse.BasicInformation.Dimensions.SimpleBasicInformation.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

public class BasicInformationPage {
	WebDriver driver;
	Actions action;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/a[3]") WebElement dataWarehouse;
	
	public BasicInformationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}
//////////////////////////////////////////////////////////// create basic information 
	////////////////////////// اانتخاب دکمه ی ایجاد اطلاعات پایه
	public void CreateBasicInformation() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dataWarehouse.click();
		WebElement newBasicInformation = driver.findElement(By.className("itPsGN"));
		newBasicInformation.click();
	}
//////////////////////////////  Search Basic Information in list
	///////////////////////// جستجو اطلاعات پایه در فهرست
	public void SearchListBasicInformation(String title) {
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[5]/div/div/div[3]/div[4]/div"));
		
		action.moveToElement(searchBox).click()
			.sendKeys(title).click().perform();
	}
	//////////////////////////////////////// delete basic information in list
//////////////////////////////////////////// حذف اطلاعات پایه از فهرست 
	public void DeleteBasicInformation() {
		WebElement scrollListUDT = driver.findElement(By.id("scrollList"));
		WebElement checkboxAll = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[5]/div/div/div[3]/div[5]/div[1]/div[1]/div[1]"));
		WebElement deleteButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[5]/div/div/div[3]/div[1]/div[5]"));
		WebElement continueDelete = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[5]/div/div/div[3]/div[2]/div/div/div[2]/button[1]"));
		WebElement stopDelete = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[5]/div/div/div[3]/div[2]/div/div/div[2]/button[2]"));
		WebElement confirm = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[5]/div/div/div[3]/div[2]/div/div/div[2]/button[3]"));
		
		action.moveToElement(checkboxAll).click()
			.moveToElement(deleteButton).click()
			.moveToElement(confirm).click().perform();
	}
//////////////////////////////////////////////////////////////	
//	@Override
//	protected void load() {
//		// TODO Auto-generated method stub
//		//driver.get("http://localhost:8080/home/DataWarehouse/udt");
//		dataWarehouse.click();
//	}
//
//	@Override
//	protected void isLoaded() throws Error {
//		// TODO Auto-generated method stub
//		//Assert.assertEquals(true, driver.getCurrentUrl().contains(""));
//		Assert.assertEquals(true, newBasicInformation.isEnabled());
//	}
	
}
