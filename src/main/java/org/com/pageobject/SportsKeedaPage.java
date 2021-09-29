package org.com.pageobject;

import java.util.concurrent.TimeUnit;

import org.com.runner.BaseClass;
import org.com.runner.TestRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SportsKeedaPage extends BaseClass{
	
	public SportsKeedaPage(WebDriver driver) 
	{
		  this.driver=driver;
		  PageFactory.initElements(driver, this);
	}
	
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
		}
	}
}
/*CSKvsRCB;
CSKvsMI;
CSKvsDC;
CSKvsSRH;
CSKvsRR;
CSKvsKKR;
CSKvsPBKS;
MIvsRCB;
MIvsDC;
MIvsSRH;
MIvsPBKS;
MIvsRR;
MIvsKKR;
SRHvsRCB;
SRHvsDC;
SRHvsRR;
SRHvsKKR;
SRHvsPBKS;
RCBvsRR;
RCBvsKKR;
RCBvsDC;
KKRvsRR;	
KKRvsPBKS;
KKRvsDC;
PBKSvsDC;
PBKSvsRR;
RRvsDC;
*/