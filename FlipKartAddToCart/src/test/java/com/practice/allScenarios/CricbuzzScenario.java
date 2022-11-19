package com.practice.allScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricbuzzScenario {
	@Test

	public void cricBuzz() {
		//public static void main(String[]args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/"); 
		driver.findElement(By.xpath("//div[@class=' cb-ovr-flo cb-text-complete' and contains(.,'New Zealand won by 9 wkts')]")).click();
		driver.findElement(By.xpath("//nav[@class='cb-nav-bar']")).click();
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'and contains(.,'Pakistan Innings')]/descendant::div[@class='cb-col cb-col-100 cb-scrd-itms']/child::div[@class='cb-col cb-col-27 ']"));
		for(WebElement name:names) {
			System.out.println(name);
		}
	}

}
