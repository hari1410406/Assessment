package com.Flipkart.AddProduct;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.flipkart.Utility.BaseClass;
import com.flipkart.Utility.IpathConstants;
import com.flipkart.pomClass.AddToCart;
import com.flipkart.pomClass.ProductPage;

public class AddProductToCart extends BaseClass {
	
	@Test
	public void addProductToCartAndValidateTest()  {
		
		String Product = excelUtility.getExcelData(1,0, IpathConstants.productPage);
		cart.searchClick();
		cart.clickOnSearchProducts(Product);
		String actual = cart.winterHeaterProduct();
		System.out.println(actual);
		cart.clickOnProduct();
		page.switchWindow(webdriverUtility);
		String expected = page.productInCart();
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
		Reporter.log("validation successful", true);
	   

		
		
		
	}

}
