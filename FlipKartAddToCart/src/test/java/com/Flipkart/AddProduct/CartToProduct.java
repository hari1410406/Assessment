package com.Flipkart.AddProduct;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CartToProduct {
	@Test
	public void cartToProductTest() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Random ran=new Random();
		int randomNumber=ran.nextInt(100);
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//input[@name='q']")).click();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("winter heater");
		
	}

}
