package com.flipkart.Utility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.flipkart.pomClass.AddToCart;
import com.flipkart.pomClass.ProductPage;

public class BaseClass extends InstanceClass {
  //  @Parameters("browser")
	@BeforeClass
	public void suiteSetup()
	{
		fileUtility = new PropertyFileUtility();
		excelUtility = new ExcelUtilityFile();
		javaUtility = new JavaUtility();
		webdriverUtility = new SeleniumWebDriverUtility();
		jsExecutorUtility = new JavaScriptExecutorUtility();

		fileUtility.initializePropertyFile(IpathConstants.FlipKartPropertyFilePath);

		randomNumber = javaUtility.getRandomNumber();

		// Get the control for particular sheet in Excel File
			excelUtility.initializeExcelFile(IpathConstants.ExcelFilePath);

		// fetch the data from Property file
		url= fileUtility.getDataFromPropertyFile("url");
		browser = fileUtility.getDataFromPropertyFile("browser");
		timeouts = fileUtility.getDataFromPropertyFile("timeout");


		driver = webdriverUtility.setUpDriver(browser);

		//pre-setting the browser
		webdriverUtility.maximizeBrowser();
		//convert String to Long
		longTimeout = javaUtility.convertStringToLong(timeouts);

		webdriverUtility.implicitlyWait(longTimeout);
		
		

		//initialize the Actions class
		webdriverUtility.intializeActions();
		 cart=new AddToCart(driver);
		 page=new ProductPage(driver);
	}

	@BeforeMethod
	public void loginTest() {

		webdriverUtility.openApplication(url);


	}

	@AfterMethod
	public void LogoutTest() {


	}

	@AfterClass
	public void closeBrowser() {
		webdriverUtility.closeBrowser();
	}


}
