package org.com.pageobject;

import org.com.runner.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * URL="https://www.sportskeeda.com/cricket/ipl-head-to-head-records?ref=carousel"
 */

public class SportsKeedaPage extends BaseClass{
	
	public SportsKeedaPage(WebDriver driver) 
	{
		  this.driver=driver;
		  PageFactory.initElements(driver, this);
	}
	
	/*
	 * WebElements of SportsKeeda Page carousel
	 */
	@FindBy(xpath="//td/a[contains(text(),'CSK vs RCB head to head')]")
	private WebElement CSKvsRCB;
	
	@FindBy(xpath="//td/a[contains(text(),'MI vs CSK head to head')]")
	private WebElement CSKvsMI;
	
	@FindBy(xpath="//td/a[contains(text(),'CSK vs DC head to head')]")
	private WebElement CSKvsDC;
	
	@FindBy(xpath="//td/a[contains(text(),'CSK vs SRH head to head')]")
	private WebElement CSKvsSRH;
	
	@FindBy(xpath="//td/a[contains(text(),'CSK vs RR head to head')]")
	private WebElement CSKvsRR;
	
	@FindBy(xpath="//td/a[contains(text(),'CSK vs KKR head to head')]")
	private WebElement CSKvsKKR;
	
	@FindBy(xpath="//td/a[contains(text(),'PBKS vs CSK head to head')]")
	private WebElement CSKvsPBKS;
	
	@FindBy(xpath="//td/a[contains(text(),'MI vs RCB head to head')]")
	private WebElement MIvsRCB;
	
	@FindBy(xpath="//td/a[contains(text(),'MI vs DC head to head')]")
	private WebElement MIvsDC;
	
	@FindBy(xpath="//td/a[contains(text(),'MI vs SRH head to head')]")
	private WebElement MIvsSRH;
	
	@FindBy(xpath="//td/a[contains(text(),'MI vs PBKS head to head')]")
	private WebElement MIvsPBKS;
	
	@FindBy(xpath="//td/a[contains(text(),'MI vs RR head to head')]")
	private WebElement MIvsRR;
	
	@FindBy(xpath="//td/a[contains(text(),'MI vs KKR head to head')]")
	private WebElement MIvsKKR;
	
	@FindBy(xpath="//td/a[contains(text(),'RCB vs SRH head to head')]")
	private WebElement SRHvsRCB;
	
	@FindBy(xpath="//td/a[contains(text(),'SRH vs DC head to head')]")
	private WebElement SRHvsDC;
	
	@FindBy(xpath="//td/a[contains(text(),'SRH vs RR head to head')]")
	private WebElement SRHvsRR;
	
	@FindBy(xpath="//td/a[contains(text(),'SRH vs KKR head to head')]")
	private WebElement SRHvsKKR;
	
	@FindBy(xpath="//td/a[contains(text(),'SRH vs PBKS head to head')]")
	private WebElement SRHvsPBKS;
	
	@FindBy(xpath="//td/a[contains(text(),'RCB vs RR head to head')]")
	private WebElement RCBvsRR;
	
	@FindBy(xpath="//td/a[contains(text(),'RCB vs KKR head to head')]")
	private WebElement RCBvsKKR;
	
	@FindBy(xpath="//td/a[contains(text(),'RCB vs DC head to head')]")
	private WebElement RCBvsDC;
	
	@FindBy(xpath="//td/a[contains(text(),'KKR vs RR head to head')]")
	private WebElement KKRvsRR;
	
	@FindBy(xpath="//td/a[contains(text(),'KKR vs PBKS head to head')]")
	private WebElement KKRvsPBKS;
	
	@FindBy(xpath="//td/a[contains(text(),'KKR vs DC head to head')]")
	private WebElement KKRvsDC;
	
	@FindBy(xpath="//td/a[contains(text(),'PBKS vs DC head to head')]")
	private WebElement PBKSvsDC;
	
	@FindBy(xpath="//td/a[contains(text(),'PBKS vs RR head to head')]")
	private WebElement PBKSvsRR;
	
	@FindBy(xpath="//td/a[contains(text(),'RR vs DC head to head')]")
	private WebElement RRvsDC;
	
	/*
	 * Getter methods for webElements of SportsKeeda Page carousel
	 */

	public WebElement getCSKvsRCB() {
		return CSKvsRCB;
	}

	public WebElement getCSKvsMI() {
		return CSKvsMI;
	}

	public WebElement getCSKvsDC() {
		return CSKvsDC;
	}

	public WebElement getCSKvsSRH() {
		return CSKvsSRH;
	}

	public WebElement getCSKvsRR() {
		return CSKvsRR;
	}

	public WebElement getCSKvsKKR() {
		return CSKvsKKR;
	}

	public WebElement getCSKvsPBKS() {
		return CSKvsPBKS;
	}

	public WebElement getMIvsRCB() {
		return MIvsRCB;
	}

	public WebElement getMIvsDC() {
		return MIvsDC;
	}

	public WebElement getMIvsSRH() {
		return MIvsSRH;
	}

	public WebElement getMIvsPBKS() {
		return MIvsPBKS;
	}

	public WebElement getMIvsRR() {
		return MIvsRR;
	}

	public WebElement getMIvsKKR() {
		return MIvsKKR;
	}

	public WebElement getSRHvsRCB() {
		return SRHvsRCB;
	}

	public WebElement getSRHvsDC() {
		return SRHvsDC;
	}

	public WebElement getSRHvsRR() {
		return SRHvsRR;
	}

	public WebElement getSRHvsKKR() {
		return SRHvsKKR;
	}

	public WebElement getSRHvsPBKS() {
		return SRHvsPBKS;
	}

	public WebElement getRCBvsRR() {
		return RCBvsRR;
	}

	public WebElement getRCBvsKKR() {
		return RCBvsKKR;
	}

	public WebElement getRCBvsDC() {
		return RCBvsDC;
	}

	public WebElement getKKRvsRR() {
		return KKRvsRR;
	}

	public WebElement getKKRvsPBKS() {
		return KKRvsPBKS;
	}

	public WebElement getKKRvsDC() {
		return KKRvsDC;
	}

	public WebElement getPBKSvsDC() {
		return PBKSvsDC;
	}

	public WebElement getPBKSvsRR() {
		return PBKSvsRR;
	}

	public WebElement getRRvsDC() {
		return RRvsDC;
	}
	
	/*
	 * Method to choose the head to head teams and print their results
	 */
	public void chooseTeams(String Team1vsTeam2)
	{
		switch(Team1vsTeam2) {
		case "CSKvsKKR":
		{
			
			String winHandleBefore = driver.getWindowHandle();
			getCSKvsKKR().click();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}			
			SportsKeedaScoresPage sportsKeedaScoresPage=PageFactory.initElements(driver, SportsKeedaScoresPage.class);
			sportsKeedaScoresPage.printMatchResults();
			break;
		}
		case "CSKvsRCB":
		{			
			String winHandleBefore = driver.getWindowHandle();
			getCSKvsRCB().click();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			SportsKeedaScoresPage sportsKeedaScoresPage=PageFactory.initElements(driver, SportsKeedaScoresPage.class);
			sportsKeedaScoresPage.printMatchResults();
			break;
		}
		case "CSKvsMI":
		{			
			String winHandleBefore = driver.getWindowHandle();
			getCSKvsMI().click();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			SportsKeedaScoresPage sportsKeedaScoresPage=PageFactory.initElements(driver, SportsKeedaScoresPage.class);
			sportsKeedaScoresPage.printMatchResults();
			break;
		}
		case "CSKvsDC":
		{			
			String winHandleBefore = driver.getWindowHandle();
			getCSKvsDC().click();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			SportsKeedaScoresPage sportsKeedaScoresPage=PageFactory.initElements(driver, SportsKeedaScoresPage.class);
			sportsKeedaScoresPage.printMatchResults();
			break;
		}
		case "CSKvsSRH":
		{			
			String winHandleBefore = driver.getWindowHandle();
			getCSKvsSRH().click();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			SportsKeedaScoresPage sportsKeedaScoresPage=PageFactory.initElements(driver, SportsKeedaScoresPage.class);
			sportsKeedaScoresPage.printMatchResults();
			break;
		}
		case "CSKvsRR":
		{			
			String winHandleBefore = driver.getWindowHandle();
			getCSKvsRR().click();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			SportsKeedaScoresPage sportsKeedaScoresPage=PageFactory.initElements(driver, SportsKeedaScoresPage.class);
			sportsKeedaScoresPage.printMatchResults();
			break;
		}
		case "CSKvsPBKS":
		{			
			String winHandleBefore = driver.getWindowHandle();
			getCSKvsPBKS().click();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			SportsKeedaScoresPage sportsKeedaScoresPage=PageFactory.initElements(driver, SportsKeedaScoresPage.class);
			sportsKeedaScoresPage.printMatchResults();
			break;
		}
		case "MIvsRCB":
		{			
			String winHandleBefore = driver.getWindowHandle();
			getMIvsRCB().click();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			SportsKeedaScoresPage sportsKeedaScoresPage=PageFactory.initElements(driver, SportsKeedaScoresPage.class);
			sportsKeedaScoresPage.printMatchResults();
			break;
		}
		case "MIvsDC":
		{			
			String winHandleBefore = driver.getWindowHandle();
			getMIvsDC().click();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			SportsKeedaScoresPage sportsKeedaScoresPage=PageFactory.initElements(driver, SportsKeedaScoresPage.class);
			sportsKeedaScoresPage.printMatchResults();
			break;
		}
		case "MIvsSRH":
		{			
			String winHandleBefore = driver.getWindowHandle();
			getMIvsSRH().click();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			SportsKeedaScoresPage sportsKeedaScoresPage=PageFactory.initElements(driver, SportsKeedaScoresPage.class);
			sportsKeedaScoresPage.printMatchResults();
			break;
		}
		case "MIvsPBKS":
		{			
			String winHandleBefore = driver.getWindowHandle();
			getMIvsPBKS().click();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			SportsKeedaScoresPage sportsKeedaScoresPage=PageFactory.initElements(driver, SportsKeedaScoresPage.class);
			sportsKeedaScoresPage.printMatchResults();
			break;
		}
		case "MIvsRR":
		{			
			String winHandleBefore = driver.getWindowHandle();
			getMIvsRR().click();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			SportsKeedaScoresPage sportsKeedaScoresPage=PageFactory.initElements(driver, SportsKeedaScoresPage.class);
			sportsKeedaScoresPage.printMatchResults();
			break;
		}
		case "MIvsKKR":
		{			
			String winHandleBefore = driver.getWindowHandle();
			getMIvsKKR().click();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			SportsKeedaScoresPage sportsKeedaScoresPage=PageFactory.initElements(driver, SportsKeedaScoresPage.class);
			sportsKeedaScoresPage.printMatchResults();
			break;
		}
		case "SRHvsRCB":
		{			
			String winHandleBefore = driver.getWindowHandle();
			getSRHvsRCB().click();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			SportsKeedaScoresPage sportsKeedaScoresPage=PageFactory.initElements(driver, SportsKeedaScoresPage.class);
			sportsKeedaScoresPage.printMatchResults();
			break;
		}
		case "SRHvsDC":
		{			
			String winHandleBefore = driver.getWindowHandle();
			getSRHvsDC().click();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			SportsKeedaScoresPage sportsKeedaScoresPage=PageFactory.initElements(driver, SportsKeedaScoresPage.class);
			sportsKeedaScoresPage.printMatchResults();
			break;
		}
		case "SRHvsRR":
		{			
			String winHandleBefore = driver.getWindowHandle();
			getSRHvsRR().click();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			SportsKeedaScoresPage sportsKeedaScoresPage=PageFactory.initElements(driver, SportsKeedaScoresPage.class);
			sportsKeedaScoresPage.printMatchResults();
			break;
		}
		case "SRHvsKKR":
		{			
			String winHandleBefore = driver.getWindowHandle();
			getSRHvsKKR().click();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			SportsKeedaScoresPage sportsKeedaScoresPage=PageFactory.initElements(driver, SportsKeedaScoresPage.class);
			sportsKeedaScoresPage.printMatchResults();
			break;
		}
		case "SRHvsPBKS":
		{			
			String winHandleBefore = driver.getWindowHandle();
			getSRHvsPBKS().click();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			SportsKeedaScoresPage sportsKeedaScoresPage=PageFactory.initElements(driver, SportsKeedaScoresPage.class);
			sportsKeedaScoresPage.printMatchResults();
			break;
		}
		case "RCBvsRR":
		{			
			String winHandleBefore = driver.getWindowHandle();
			getRCBvsRR().click();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			SportsKeedaScoresPage sportsKeedaScoresPage=PageFactory.initElements(driver, SportsKeedaScoresPage.class);
			sportsKeedaScoresPage.printMatchResults();
			break;
		}
		case "RCBvsKKR":
		{			
			String winHandleBefore = driver.getWindowHandle();
			getRCBvsKKR().click();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			SportsKeedaScoresPage sportsKeedaScoresPage=PageFactory.initElements(driver, SportsKeedaScoresPage.class);
			sportsKeedaScoresPage.printMatchResults();
			break;
		}
		case "RCBvsDC":
		{			
			String winHandleBefore = driver.getWindowHandle();
			getRCBvsDC().click();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			SportsKeedaScoresPage sportsKeedaScoresPage=PageFactory.initElements(driver, SportsKeedaScoresPage.class);
			sportsKeedaScoresPage.printMatchResults();
			break;
		}
		case "KKRvsRR":
		{			
			String winHandleBefore = driver.getWindowHandle();
			getKKRvsRR().click();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			SportsKeedaScoresPage sportsKeedaScoresPage=PageFactory.initElements(driver, SportsKeedaScoresPage.class);
			sportsKeedaScoresPage.printMatchResults();
			break;
		}
		case "KKRvsPBKS":
		{			
			String winHandleBefore = driver.getWindowHandle();
			getKKRvsPBKS().click();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			SportsKeedaScoresPage sportsKeedaScoresPage=PageFactory.initElements(driver, SportsKeedaScoresPage.class);
			sportsKeedaScoresPage.printMatchResults();
			break;
		}
		case "KKRvsDC":
		{			
			String winHandleBefore = driver.getWindowHandle();
			getKKRvsDC().click();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			SportsKeedaScoresPage sportsKeedaScoresPage=PageFactory.initElements(driver, SportsKeedaScoresPage.class);
			sportsKeedaScoresPage.printMatchResults();
			break;
		}
		case "PBKSvsDC":
		{			
			String winHandleBefore = driver.getWindowHandle();
			getCSKvsPBKS().click();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			SportsKeedaScoresPage sportsKeedaScoresPage=PageFactory.initElements(driver, SportsKeedaScoresPage.class);
			sportsKeedaScoresPage.printMatchResults();
			break;
		}
		case "PBKSvsRR":
		{			
			String winHandleBefore = driver.getWindowHandle();
			getPBKSvsRR().click();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			SportsKeedaScoresPage sportsKeedaScoresPage=PageFactory.initElements(driver, SportsKeedaScoresPage.class);
			sportsKeedaScoresPage.printMatchResults();
			break;
		}
		case "RRvsDC":
		{			
			String winHandleBefore = driver.getWindowHandle();
			getRRvsDC().click();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			SportsKeedaScoresPage sportsKeedaScoresPage=PageFactory.initElements(driver, SportsKeedaScoresPage.class);
			sportsKeedaScoresPage.printMatchResults();
			break;
		}
		default: System.out.println("You have entered incorrect team combination");
		}
	}
}
