package org.com.pageobject;

import org.com.runner.BaseClass;
import org.com.runner.TestRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage extends BaseClass {  

@FindBy(xpath="//input[@title='Search']")
private WebElement InputSearchBox;

@FindBy(xpath="(//input[@value='Google Search'])[2]")
private WebElement BtnGoogleSearch;
	
@FindBy(xpath="(//div[@class='ellipsisize liveresults-sports-immersive__team-name-width kno-fb-ctx']/span)[1]")
private WebElement Team1Name;

@FindBy(xpath="(//div[@class='ellipsisize liveresults-sports-immersive__team-name-width kno-fb-ctx']/span)[2]")
private WebElement Team2Name;

@FindBy(xpath="(//div[@class='imspo_mh_cricket__score-major'])[1]")
private WebElement Team1Score;

@FindBy(xpath="(//div[@class='imspo_mh_cricket__score-major'])[2]")
private WebElement Team2Score;

@FindBy(xpath="(//div[@class='imso_mh__score-txt imso-ani imspo_mh_cricket__summary-sentence']/div)[1]")
private WebElement MatchSummary;

public GooglePage(WebDriver driver) 
{
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
}

public WebElement getTeam1Name() {
	return Team1Name;
}

public WebElement getTeam2Name() {
	return Team2Name;
}

public WebElement getTeam1Score() {
	return Team1Score;
}

public WebElement getTeam2Score() {
	return Team2Score;
}

public void startGoogleSearch()
{
	InputSearchBox.sendKeys("today's ipl match"); 
    BtnGoogleSearch.click();
}
public void printTeamNamesAndScores() { 
	System.out.println("Name of the team 1 playing is:"+getTeam1Name().getText()+" and its score is:"+getTeam1Score().getText());
	System.out.println("Name of the team 2 playing is:"+getTeam2Name().getText()+" and its score is:"+getTeam2Score().getText());
}
}