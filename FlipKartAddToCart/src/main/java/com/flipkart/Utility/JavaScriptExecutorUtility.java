package com.flipkart.Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorUtility {
	
     private JavascriptExecutor js;
	
	public void TypecastToJavascriptExecutor(WebDriver driver) {
		
		js=(JavascriptExecutor) driver;
		
	}

	public  void scrollIntoView( WebElement element) {

		
		js.executeScript("arguments[0].scrollIntoView(true);",element );
	}
	
	public void scrollTillDown() {
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	public void ClickonDisabledElement(WebElement element) {
		js.executeScript("document.getElementsByName(element)");
	}


}
