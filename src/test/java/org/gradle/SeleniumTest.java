package org.gradle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumTest {
	private WebDriver driver;

	@BeforeMethod (alwaysRun = true)
	public void setUp() throws Exception {
		System.out.println("==> BEGIN");
		driver = new FirefoxDriver();

		//System.setProperty("webdriver.chrome.driver", "vendor//chromedriver.exe");
		//work in Eclipse, crash on Gradle: System.setProperty("webdriver.chrome.driver", ".//vendor//chromedriver.exe");
		//work in Eclipse, crash on Gradle: System.setProperty("webdriver.chrome.driver", ".\\vendor\\chromedriver.exe");
		//work in Eclipse, crash on Gradle: System.setProperty("webdriver.chrome.driver", "C:\\save\\thomas\\job\\computer\\Java\\ucsc-quickstart\\vendor\\chromedriver.exe");
		//work in Eclipse, crash on Ant: System.setProperty("webdriver.chrome.driver", "vendor//chromedriver.exe");
		//driver = new ChromeDriver();
	}
	@AfterMethod(alwaysRun = true)
	public void tearDown() throws Exception {
		System.out.println("DONE");
		//driver.quit();
	}

	@Test(groups= "seleniumTest")
	public void testExamples() {
		System.out.println("testExamples");
		if (driver==null)
			System.out.println("==> seleniumTest");
		driver.get("http://www.google.com");

		//WebElement element = driver.findElement(By.name("q"));
		//element.sendKeys("100");
		//driver.findElement( By.name("btnK") ).submit();
		//assertEquals(2, 2);
	}
}