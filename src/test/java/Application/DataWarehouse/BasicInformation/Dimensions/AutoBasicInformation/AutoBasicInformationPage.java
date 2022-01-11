package Application.DataWarehouse.BasicInformation.Dimensions.AutoBasicInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoBasicInformationPage {
	WebDriver driver;
	Actions action;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div/div[2]/div[2]/div/input") WebElement basicInformationName;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div/div[2]/div[3]/div[1]/div[2]/div[1]") WebElement simpleType;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div/div[2]/div[3]/div[1]/div[2]/div[2]") WebElement autoType;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div/div[2]/div[3]/div[1]/div[2]/div[3]") WebElement treeType;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div/div[2]/div[3]/div[2]/div[2]/div[1]") WebElement alphabetOrderby;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div/div[2]/div[3]/div[2]/div[2]/div[2]") WebElement valueOrderby;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div/div[2]/button[3]") WebElement confirmBasicInformation;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div/div[2]/button[4]") WebElement continueBasicInformation;
	
	
	public AutoBasicInformationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}
///////////////////////////////////////////////////////////////////////////// Auto Basic Information Alphabet Orderby
	public void CreateAutoType_AlphabetOrderby(String title) {
		action.moveToElement(basicInformationName).click()
			.sendKeys(title)
			.moveToElement(autoType).click()
			.moveToElement(alphabetOrderby).click()
			.moveToElement(continueBasicInformation).click().perform();
		
		WebElement treeSelectEntity = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[3]/div[2]/div[2]/div/div"));
		WebElement treeSelectFild = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[3]/div[2]/div[3]/div/div"));
		WebElement showFildChild = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[3]/div[2]/div[5]/div"));
		WebElement confirmAutoType = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[3]/div[2]/button"));
		
		if (showFildChild.isSelected()) {
			showFildChild.click();
			}
		}
/////////////////////////////////////////////////////////////////////////////// Auto Basic Information Value Orderby
	public void CreateAutoType_ValueOrderby(String title) { 
		action.moveToElement(basicInformationName).click()
		.sendKeys(title)
		.moveToElement(autoType).click()
		.moveToElement(valueOrderby).click()
		.moveToElement(continueBasicInformation).click().perform();
	
	WebElement treeSelectEntity = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[3]/div[2]/div[2]/div/div"));
	WebElement treeSelectFild = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[3]/div[2]/div[3]/div/div"));
	WebElement showFildChild = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[3]/div[2]/div[5]/div"));
	WebElement confirmAutoType = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[3]/div[2]/button"));
	
	if (showFildChild.isSelected()) {
		showFildChild.click();
			}
		}
}
