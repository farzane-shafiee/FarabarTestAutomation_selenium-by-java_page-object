package Application.DataWarehouse.BasicInformation.Dimensions.TreeBasicInformation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TreeBasicInformationPage {
	WebDriver driver;
	Actions action;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div/div[2]/div[2]/div/input") WebElement basicInformationName;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div/div[2]/div[3]/div[1]/div[2]/div[1]") WebElement simpleType;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div/div[2]/div[3]/div[1]/div[2]/div[2]") WebElement autoType;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div/div[2]/div[3]/div[1]/div[2]/div[3]") WebElement treeType;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div/div[2]/div[3]/div[2]/div[2]/div[1]") WebElement alphabetOrderby;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div/div[2]/div[3]/div[2]/div[2]/div[2]") WebElement valueOrderby;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div/div[2]/button[3]") WebElement confermBasicInformation;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div/div[2]/button[4]") WebElement continueBasicInformation;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[3]/div[2]/div/div/div") WebElement rootBasicInformation;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[3]/button") WebElement addChild;
	
	public TreeBasicInformationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}
//////////////////////////////////////////////////////////////////////////////Tree Basic Information	
	public void CreateTreeType(String title) {
	action.moveToElement(basicInformationName).click()
	.sendKeys(title)
	.moveToElement(treeType).click().perform();
	}
}
