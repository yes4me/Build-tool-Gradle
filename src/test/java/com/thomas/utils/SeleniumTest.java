package com.thomas.utils;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SeleniumTest {
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();

		//System.setProperty("webdriver.chrome.driver", "vendor//chromedriver.exe");
		//work in Eclipse, crash on Gradle: System.setProperty("webdriver.chrome.driver", ".//vendor//chromedriver.exe");
		//work in Eclipse, crash on Gradle: System.setProperty("webdriver.chrome.driver", ".\\vendor\\chromedriver.exe");
		//work in Eclipse, crash on Gradle: System.setProperty("webdriver.chrome.driver", "C:\\save\\thomas\\job\\computer\\Java\\ucsc-quickstart\\vendor\\chromedriver.exe");
		//work in Eclipse, crash on Ant: System.setProperty("webdriver.chrome.driver", "vendor//chromedriver.exe"); 
		//driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@After
	public void tearDown() throws Exception {
		System.out.println("DONE");
		driver.quit();
	}

	@Test
	public void testExamples() {
		System.out.println("testExamples");
		driver.get("http://www.google.com");

		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("100");
		driver.findElement( By.name("btnK") ).submit();
		assertEquals(2, 2);
	}
}