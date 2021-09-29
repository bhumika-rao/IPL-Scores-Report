package org.com.pageobject;

import org.com.runner.BaseClass;
import org.com.runner.TestRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SportsKeedaScoresPage extends BaseClass{
	
	@FindBy(xpath="(//div[@id='taxonomy-content-holder']/table/tbody/tr)[2]/td[1]")
	private WebElement NoOfPlayedMatchesV1;
	
	@FindBy(xpath="(//div[@id='taxonomy-content-holder']/table/tbody/tr)[2]/td[2]")
	private WebElement NoOfTeam1WonMatchesV1;
	
	@FindBy(xpath="(//div[@id='taxonomy-content-holder']/table/tbody/tr)[2]/td[3]")
	private WebElement NoOfTeam2WonMatchesV1;
	
	@FindBy(xpath="(//div[@id='taxonomy-content-holder']/table/tbody/tr)[2]/td[4]")
	private WebElement NoOfTiedMatchesV1;
	
	@FindBy(xpath="(//div[@id='taxonomy-content-holder']/table/tbody/tr)[2]/td[5]")
	private WebElement NoOfNoResultMatchesV1;
	
	@FindBy(xpath="(//div[@class='taxonomy-content taxonomy-content-holder']/table/tbody/tr/td)[2]")
	private WebElement NoOfPlayedMatchesV2;
	
	@FindBy(xpath="(//div[@class='taxonomy-content taxonomy-content-holder']/table/tbody/tr/td)[4]")
	private WebElement NoOfTeam1WonMatchesV2;
	
	@FindBy(xpath="(//div[@class='taxonomy-content taxonomy-content-holder']/table/tbody/tr/td)[6]")
	private WebElement NoOfTeam2WonMatchesV2;
	
	@FindBy(xpath="(//div[@class='taxonomy-content taxonomy-content-holder']/table/tbody/tr/td)[8]")
	private WebElement NoOfTiedMatchesV2;
	
	@FindBy(xpath="(//div[@class='taxonomy-content taxonomy-content-holder']/table/tbody/tr/td)[10]")
	private WebElement NoOfNoResultMatchesV2;
	
	
	
	public SportsKeedaScoresPage(WebDriver driver) 
	{
		  this.driver=driver;
		  PageFactory.initElements(driver, this);
	}

	

	public WebElement getNoOfPlayedMatchesV1() {
		return NoOfPlayedMatchesV1;
	}



	public WebElement getNoOfTeam1WonMatchesV1() {
		return NoOfTeam1WonMatchesV1;
	}



	public WebElement getNoOfTeam2WonMatchesV1() {
		return NoOfTeam2WonMatchesV1;
	}



	public WebElement getNoOfTiedMatchesV1() {
		return NoOfTiedMatchesV1;
	}



	public WebElement getNoOfNoResultMatchesV1() {
		return NoOfNoResultMatchesV1;
	}



	public WebElement getNoOfPlayedMatchesV2() {
		return NoOfPlayedMatchesV2;
	}



	public WebElement getNoOfTeam1WonMatchesV2() {
		return NoOfTeam1WonMatchesV2;
	}



	public WebElement getNoOfTeam2WonMatchesV2() {
		return NoOfTeam2WonMatchesV2;
	}



	public WebElement getNoOfTiedMatchesV2() {
		return NoOfTiedMatchesV2;
	}



	public WebElement getNoOfNoResultMatchesV2() {
		return NoOfNoResultMatchesV2;
	}



	public void printMatchResults()
	{
		
		if(getNoOfNoResultMatchesV1().isDisplayed())
		{
			String noOfPlayedMatches=getNoOfPlayedMatchesV1().getText();
			String noOfTeam1WonMatches=getNoOfTeam1WonMatchesV1().getText();
			String noOfTeam2WonMatches=getNoOfTeam2WonMatchesV1().getText();
			String noOfTiedMatches=getNoOfTiedMatchesV1().getText();
			String noOfNoResultMatches=getNoOfNoResultMatchesV1().getText();
			System.out.println("No of Matches played in total="+noOfPlayedMatches);
			System.out.println("No of Matches won by team 1 in total="+noOfTeam1WonMatches);
			System.out.println("No of Matches won by team 2 in total="+noOfTeam2WonMatches);
			System.out.println("No of Matches tied in total="+noOfTiedMatches);
			System.out.println("No of Matches no result in total="+noOfNoResultMatches);
		}
		else if(getNoOfNoResultMatchesV2().isDisplayed())
		{

			String noOfPlayedMatches=getNoOfPlayedMatchesV2().getText();
			String noOfTeam1WonMatches=getNoOfTeam1WonMatchesV2().getText();
			String noOfTeam2WonMatches=getNoOfTeam2WonMatchesV2().getText();
			String noOfTiedMatches=getNoOfTiedMatchesV2().getText();
			String noOfNoResultMatches=getNoOfNoResultMatchesV2().getText();
			System.out.println("No of Matches played in total="+noOfPlayedMatches);
			System.out.println("No of Matches won by team 1 in total="+noOfTeam1WonMatches);
			System.out.println("No of Matches won by team 2 in total="+noOfTeam2WonMatches);
			System.out.println("No of Matches tied in total="+noOfTiedMatches);
			System.out.println("No of Matches no result in total="+noOfNoResultMatches);
		}
	}
}
