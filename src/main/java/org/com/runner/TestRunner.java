package org.com.runner;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.com.pageobject.GooglePage;
import org.com.pageobject.SportsKeedaPage;
import org.com.pageobject.SportsKeedaScoresPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestRunner{
	public static WebDriver driver; 
	protected final static String URL="https://www.google.com/";
	
	@BeforeSuite
	public void initialize() throws IOException{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\setup\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(URL);	
	}
	
	@AfterSuite
	public void TeardownTest()
    {
        TestRunner.driver.quit();
    }

	@Test
	public void init() throws Exception{
		GooglePage googlePage = PageFactory.initElements(driver, GooglePage.class);	
			googlePage.startGoogleSearch();
			googlePage.printTeamNamesAndScores();
		
		}
}