package Application.DataWarehouse.BasicInformation.Dimensions.SimpleBasicInformation.pageObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Application.DataWarehouse.BasicInformation.Dimensions.SimpleBasicInformation.testCase.DataProvidersBasicInformation;

public class SimpleBasicInformationPage{
	WebDriver driver;
	Actions action;

	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div/div[2]/div[2]/div/input") WebElement basicInformationName;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div/div[2]/div[3]/div[1]/div[2]/div[1]") WebElement simpleType;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div/div[2]/div[3]/div[2]/div[2]/div[1]") WebElement alphabetOrderby;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div/div[2]/div[3]/div[2]/div[2]/div[2]") WebElement valueOrderby;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div/div[2]/button[3]") WebElement confirmBasicInformation;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div/div[2]/button[4]") WebElement continueBasicInformation;
	//@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[3]/button") WebElement addChild;
	@FindBy(className="KVPDl") WebElement newChild;

	public SimpleBasicInformationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}
	////////////////////////////////////////////////////////////////////////// Simple Basic Information Alphabet Orderby
	///////////////// ایجاد اطلاعات پایه الفبایی
	//Test Case 01001
	public void CreateSimpleType_AlphabetOrderby(String title) {
		action.moveToElement(basicInformationName).click()
		.sendKeys(title)
		.moveToElement(simpleType).click()
		.moveToElement(alphabetOrderby).click()
		.moveToElement(confirmBasicInformation).click().perform();
		//StudioSimpleType_AlphabetOrderby(value);
		//return title;
	}

	//////////////////////////////////////////////////////////////////////////////	Studio Simple Basic Information Alphabet Orderby
	///////////////////////////// ایجاد مقدار به صورت تکی یا آرایه ای برای اطلاعات پایه الفبایی توسط فایل csv
	//Test Case 01002
	//year
	public void CreateValueForSimpleType_year_AlphabetOrderby(List<String[]> basicInformationData) {
		WebElement yearBasicInformation = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[2]/div/div[1]/div"));
		WebElement newValue = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/button[1]"));

		yearBasicInformation.click();
		newValue.click();
		WebElement valueName = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[2]/input"));
		WebElement confirmValue = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/button[3]"));

		for(int k = 0 ; k <= basicInformationData.size() ; k++) {
			action.moveToElement(valueName).click()
			.sendKeys(basicInformationData.get(k)).perform();
			confirmValue.click();
			if (k == basicInformationData.size()-1) {
				break;
			}
			WebElement continueValue = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[4]/div[4]/button[1]"));
			continueValue.click();
		}
		WebElement notContinueValue = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[4]/div[4]/button[2]"));
		notContinueValue.click();
	}
	///month
	public void CreateValueForSimpleType_month_AlphabetOrderby(List<String[]> basicInformationData) {
		WebElement monthBasicInformation = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[2]/div/div[2]/div"));
		WebElement newValue = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/button[1]"));

		monthBasicInformation.click();
		newValue.click();
		WebElement valueName = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[2]/input"));
		WebElement confirmValue = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/button[3]"));

		for(int k = 0 ; k <= basicInformationData.size() ; k++) {
			action.moveToElement(valueName).click()
			.sendKeys(basicInformationData.get(k)).perform();
			confirmValue.click();
			if (k == basicInformationData.size()-1) {
				break;
			}
			WebElement continueValue = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[4]/div[4]/button[1]"));
			continueValue.click();
		}
		WebElement notContinueValue = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[4]/div[4]/button[2]"));
		notContinueValue.click();
	}
	//day
	public void CreateValueForSimpleType_day_AlphabetOrderby(List<String[]> basicInformationData) {
		WebElement dayBasicInformation = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[2]/div/div[3]/div"));
		WebElement newValue = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/button[1]"));

		dayBasicInformation.click();
		newValue.click();
		WebElement valueName = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[2]/input"));
		WebElement confirmValue = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/button[3]"));

		for(int k = 0 ; k <= basicInformationData.size() ; k++) {
			action.moveToElement(valueName).click()
			.sendKeys(basicInformationData.get(k)).perform();
			confirmValue.click();
			if (k == basicInformationData.size()-1) {
				break;
			}
			WebElement continueValue = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[4]/div[4]/button[1]"));
			continueValue.click();
		}
		WebElement notContinueValue = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[4]/div[4]/button[2]"));
		notContinueValue.click();
	}

	////////////////////////// اضافه کردن فرزند ساختاری جدید به اطلاعات پایه اصلی در استودیو - فرزند ساختاری پدر فرزندی
	//Test Case 01003
	public void AddChildToStudio(String title) throws InterruptedException {
		newChild.click();
		WebElement scrollList = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[3]/div[2]/div[3]/div"));
		List<WebElement> childList = scrollList.findElements(By.className("widthText1"));
		for(int i=0 ; i<=childList.size() ; i++) {
			if (childList.get(i).getText().equals("ماه1400")) {
				Thread.sleep(1000);
				childList.get(i).click();
				break;
			}
		}
		newChild.click();
		for(int j=0 ; j<=childList.size() ; j++) {
			if (childList.get(j).getText().equals("روز1400")) {
				Thread.sleep(1000);
				childList.get(j).click();
				break;
			}
		}
	}

	//////////////////////////////////////////////////////////////////////////////// new child to basic information in studio
	////////////////////// ایجاد کردن فرزند ساختاری به اطلاعات پایه اصلی در استودیو
	//Test Case 01006
	public void NewChildToStudio(String child) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		newChild.click();
		Thread.sleep(1000);
		WebElement NewSimpleType_alphabetOrderby = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[3]/div[2]/div[2]/button"));
		NewSimpleType_alphabetOrderby.click();
		CreateSimpleType_AlphabetOrderby(child);
		Thread.sleep(1000);
		WebElement scrollList = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[3]/div[2]/div[3]/div"));
		List<WebElement> ListUDT = scrollList.findElements(By.className("widthText1"));

		for(int i=0 ; i<=ListUDT.size() ; i++) {
			if (ListUDT.get(i).getText().equals(child)) {
				ListUDT.get(i).click();
				break;
			}
		}
		WebElement back = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[3]/div[1]/button"));
		back.click();
	}
	////////////////////////////////////////////////////////////////////////////// Edit Basic Information
	/// ویرایش اطلاعات پایه از داخل استودیو
	//Test Case 01007
	public void EditBasicInformation(String edit) throws InterruptedException {
		WebElement basicInformation = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[2]/div/div[1]/div/div[5]"));
		WebElement editBasicInformation = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[2]/div/div[1]/div/div[2]/img"));
		Thread.sleep(1000);
		action.moveToElement(basicInformation)
		.moveToElement(editBasicInformation).click().perform();

		action.moveToElement(basicInformationName).click()
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.sendKeys(Keys.DELETE)
		.perform();
		CreateSimpleType_ValueOrderby(edit);
	}
	////////////////////////////////////////////////////////////////////////////Delete Basic Information into studio
	/// حذف اتصال اطلاعات پایه از داخل استودیو
	//Test Case 01008
	public void DeleteBasicInformation() throws InterruptedException {
		Thread.sleep(1000);
		WebElement list = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[2]/div"));
		List<WebElement> basicInformationList = list.findElements(By.className("jBslrA"));;

		for(int i=1 ; i<=basicInformationList.size() ; i++) {
			action.moveToElement((WebElement) basicInformationList.get(i))
			.click().perform();

			action.moveToElement((WebElement) basicInformationList.get(i)
					.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[2]/div/div[2]/div/div[2]/img[1]")))
			.click().perform();

			WebElement confirmDelete = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div/div[2]/div[3]/button[1]"));
			confirmDelete.click();
			break;
		}
	}
	////////////////////////////////////////////////////////////////////////////Edit Value Basic Information into studio
	/// ویرایش مقادیر اطلاعات پایه
	//Test Case 01009
	public void EditValueBasicInformation(String title) throws InterruptedException {
		Thread.sleep(1000);
		WebElement list = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[2]/div"));
		List<WebElement> basicInformationList = list.findElements(By.className("jBslrA"));
		System.out.println(basicInformationList.size());

		for(int i=0 ; i<=basicInformationList.size() ; i++) {
			System.out.println("yes1");
			action.moveToElement(basicInformationList.get(i))
			.click().perform();
			WebElement valueList = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div[2]"));
			List<WebElement> valueBasicInformationList = valueList.findElements(By.className("gFFKLG"));

			for(int j=0 ; j<=valueBasicInformationList.size() ; j++) {
				Thread.sleep(1000);
				System.out.println(j);
				action.moveToElement(valueBasicInformationList.get(j))
				.click().perform();

				WebElement hoverList = driver.findElement(By.className("hover-img"));
				List<WebElement> bottunHoverList = hoverList.findElements(By.tagName("img"));
				System.out.println("ok");
				Thread.sleep(2000);
				//bottunHoverList.get(0).click();
				
				action.moveToElement(bottunHoverList.get(0)).click().perform();
				
				WebElement valueName = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[2]/input"));
				action.moveToElement(valueName).click()
				.keyDown(Keys.CONTROL)
				.sendKeys("a")
				.keyUp(Keys.CONTROL)
				.sendKeys(Keys.DELETE)
				.sendKeys(title)
				.perform();
				WebElement confirm = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/button[2]"));
				confirm.click();
			}
			break;
		}
	}
	//////////////////////////////////////////////////////////////////////////// Management Report Value Basic Information into studio
	/// مشاهده گزارش مدیریتی مقادیر اطلاعات پایه
	//Test Case 01010
	public void ManagementReportValueBasicInformation() throws InterruptedException {
		Thread.sleep(1000);
		WebElement list = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[2]/div"));
		List<WebElement> basicInformationList = list.findElements(By.className("jBslrA"));

		for(int i=0 ; i<=basicInformationList.size() ; i++) {
			action.moveToElement((WebElement) basicInformationList.get(i))
			.click().perform();
			WebElement valueList = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div[2]"));
			List<WebElement> valueBasicInformationList = valueList.findElements(By.className("gFFKLG"));

			for(int j=0 ; j<=valueBasicInformationList.size() ; j++) {
				Thread.sleep(1000);
				action.moveToElement((WebElement) valueBasicInformationList.get(j))
				.click().perform();

				WebElement hoverList = driver.findElement(By.className("hover-img"));
				List<WebElement> bottunHoverList = hoverList.findElements(By.tagName("img"));
				Thread.sleep(1000);
				bottunHoverList.get(1).click();

				WebElement statisticalReports = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]"));
				WebElement informationForms = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]"));
				WebElement informationEntitis = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[3]/div[1]/div[2]/div[4]/div[1]"));
				statisticalReports.click();
				informationForms.click();
				informationEntitis.click();
				WebElement back = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/button"));
				back.click();
			}
			break;
		}
	}
	/////////////////////////////////////////////////////////////Delete Value Basic Information into studio
	/// حذف مقادیر اطلاعات پایه
	//Test Case 01011
	public void DeleteValueBasicInformation() throws InterruptedException {
		Thread.sleep(1000);
		WebElement list = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[2]/div"));
		List<WebElement> basicInformationList = list.findElements(By.className("jBslrA"));

		for(int i=0 ; i<=basicInformationList.size() ; i++) {
			action.moveToElement((WebElement) basicInformationList.get(i))
			.click().perform();
			WebElement valueList = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div[2]"));
			List<WebElement> valueBasicInformationList = valueList.findElements(By.className("gFFKLG"));

			for(int j=0 ; j<=valueBasicInformationList.size() ; j++) {
				Thread.sleep(1000);
				action.moveToElement((WebElement) valueBasicInformationList.get(j))
				.click().perform();

				WebElement hoverList = driver.findElement(By.className("hover-img"));
				List<WebElement> bottunHoverList = hoverList.findElements(By.tagName("img"));
				Thread.sleep(1000);
				bottunHoverList.get(2).click();

				WebElement deleteValue = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div/div[2]/div[3]/button[1]"));
				deleteValue.click();
			}
			break;
		}
	}
	/////////////////////////////////////////////////////////////Search Value Basic Information into studio
	/// جستجو مقادیر اطلاعات پایه
	//Test Case 01012
	public void SearchValueBasicInformation(String title) throws InterruptedException {
		WebElement searchValue = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div/input"));
		searchValue.click();
		searchValue.sendKeys(title);
	}
	/////////////////////////////////////////////////////////////Search Child Values Basic Information into studio
	/// جستجو در فرزند مقادیر اطلاعات پایه
	//Test Case 01013
	public void SearchChildValuesBasicInformation(String title) throws InterruptedException {
		WebElement basicInformation = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[2]/div/div[1]/div"));
		basicInformation.click();
		WebElement valueBasicInformation = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div[2]/div[1]"));
		valueBasicInformation.click();
		WebElement searchValueChild = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[2]/div/input"));
		searchValueChild.click();
		searchValueChild.sendKeys(title);
	}
	////////////////////////////////////////////////////////////////// Search Basic Information
	/// جستجو اطلاعات پایه در استودیو
	//Test Case 01014
	public void SearchBasicInformation(String title) throws InterruptedException {
		newChild.click();
		Thread.sleep(1000);
		WebElement searchBasicInformation = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[3]/div[2]/div[2]/div"));
		action.moveToElement(searchBasicInformation).click()
		.sendKeys(title).perform();

	}
	////////////////////////////////////////////////////////////////////////////Add Value To Basic Information Alphabet Orderby
	//انتقال مقدار هر سه اطلاعات پایه سال - ماه - روز
	public void AddValueToBasicInformation_AlphabetOrderby() throws InterruptedException {
		WebElement yearBasicInformation = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[2]/div/div[1]/div"));
		yearBasicInformation.click();
		for(int j=1 ; j<=2 ; j++) {
			WebElement listValues = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div[2]"));
			List<WebElement> ListValues = listValues.findElements(By.className("gFFKLG"));

			for(int i=0 ; i<ListValues.size() ; i++) {
				ListValues.get(i).click();
				Thread.sleep(1000);
				WebElement checkboxChild = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]"));
				checkboxChild.click();
				Thread.sleep(1000);
				WebElement sendValue = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[2]/button[2]"));
				sendValue.click();
			}
			Thread.sleep(2000);
			WebElement monthBasicInformation = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[2]/div/div[2]/div"));
			monthBasicInformation.click();
		}
	}
	////////////////////////////////////////////////////////////////////////////Simple Basic Information Value Orderby
	/////////////// ایجاد اطلاعات پایه ارزشی
	public void CreateSimpleType_ValueOrderby(String title) {
		action.moveToElement(basicInformationName).click()
		.sendKeys(title)
		.moveToElement(simpleType).click()
		.moveToElement(valueOrderby).click()
		.moveToElement(confirmBasicInformation).click().perform();
	}
	///////////////////////////////////////////////////////////////////////////// Studio Simple Basic Information Value Orderby
	/////////////////////// ایجاد مقدار به صورت تکی یا آرایه ای برای اطلاعات پایه ارزشی توسط فایل CSV
	public void CreateValueForSimpleType_ValueOrderby(List<String[]> basicInformationData) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement rootBasicInformation = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[2]/div/div/div"));
		WebElement newValue = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/button[1]"));
		WebElement newCost = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[2]/button[1]"));

		rootBasicInformation.click();
		newValue.click();

		WebElement valueName = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[3]/div[2]/input"));
		WebElement confirmValue = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[3]/button[3]"));

		for(int i = 0 ; i <= basicInformationData.size() ; i++) {
			action.moveToElement(valueName).click()
			.sendKeys(basicInformationData.get(i)).perform();

			confirmValue.click();
			if (i == basicInformationData.size()-1) {
				break;
			}
			WebElement continueValue = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[4]/div[4]/button[1]"));
			continueValue.click();
		}
		WebElement notContinueValue = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[4]/div[4]/button[2]"));
		notContinueValue.click();

		//exit.click();

	}
////////////////////////////////// Assertion 
	///////////////////////////// Assert One Create Basic Information Alphabet Oder by and ValueOrderby 01001 and 01022 and 10003
	public int AssertionCreateBasicInformation() throws InterruptedException {
		WebElement scrollList = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[2]/div"));
		List<WebElement> list = scrollList.findElements(By.className("jshAGb"));
		Thread.sleep(1000);
		return list.size();
	}
	//////////////////////////// Assert Create Value For SimpleType_year_Alphabet Order by 01002
	public int AssertionCreateBasicInformaionByValue() {
		WebElement scrollList = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div[2]"));
		List<WebElement> list = scrollList.findElements(By.className("gFFKLG"));
		return list.size();
	}
	/////////////////////////// Assertion Add Value Basic Information 01005
	public boolean AssertionAddValueToBasicInformation() throws InterruptedException {
		WebElement checkbox = driver.findElement(By.xpath("//img[@src='/img/check-box.370d7386.svg']"));
		if (checkbox.isEnabled()) {
			return true;	
		}
		return false;
	}
	/////////////////////////// Assert New Child and Edit Alphabet Order by 01006 - 01007 - 01008
	public String AssertionNewChild(String title) throws InterruptedException {
		WebElement scrollList = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[2]/div"));
		List<WebElement> list = scrollList.findElements(By.className("widthText1"));
		for(int i=0 ; i<list.size() ; i++) {
			if(list.get(i).getText().equals(title)) {
				return list.get(i).getText();
			}
		}
		return null;
	}
}
