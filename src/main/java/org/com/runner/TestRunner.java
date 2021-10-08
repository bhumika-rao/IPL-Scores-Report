package org.com.runner;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.com.pageobject.SportsKeedaPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/*
 * File to run the TestNG tests
 */
public class TestRunner{
	public static WebDriver driver; 
	protected final static String URL="https://www.sportskeeda.com/cricket/ipl-head-to-head-records?ref=carousel";
	
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

	/*
	 * One can choose the teams from the below list:
	 * CSKvsRCB
	 * CSKvsMI 
	 * CSKvsDC 
	 * CSKvsSRH 
	 * CSKvsRR 
	 * CSKvsKKR 
	 * CSKvsPBKS 
	 * MIvsRCB 
	 * MIvsDC 
	 * MIvsSRH
	 * MIvsPBKS 
	 * MIvsRR 
	 * MIvsKKR 
	 * SRHvsRCB 
	 * SRHvsDC 
	 * SRHvsRR 
	 * SRHvsKKR 
	 * SRHvsPBKS 
	 * RCBvsRR
	 * RCBvsKKR 
	 * RCBvsDC 
	 * KKRvsRR 
	 * KKRvsPBKS 
	 * KKRvsDC 
	 * PBKSvsDC 
	 * PBKSvsRR 
	 * RRvsDC
	 */
	@Test
	public void init() throws Exception{

		SportsKeedaPage sportsKeedaPage=PageFactory.initElements(driver, SportsKeedaPage.class);
		sportsKeedaPage.chooseTeams("PBKSvsRR");
		
		}
}