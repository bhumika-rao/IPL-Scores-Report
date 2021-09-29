package org.com.runner;

import org.com.pageobject.GooglePage;
import org.com.pageobject.SportsKeedaPage;
import org.com.pageobject.SportsKeedaScoresPage;
/**
 * 
•Current IPL points table
•Today's IPL match team names
•Live IPL scores
•History of these two teams(Number of wins and losses by each team in IPL)
•Upcoming match dates
•Past IPL season winners
 *
 */
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;  
  
public class BaseClass extends TestRunner { 
	
	
	//protected final static String URL="https://www.sportskeeda.com/cricket/csk-vs-rcb-head-to-head-ipl";
    /*public static void main(String[] args) {    
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumPractice\\setup\\ChromeDriver\\chromedriver.exe");  
        
        WebDriver chromeDriver=new ChromeDriver(); 
        //protected static ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();
        String score=new String();
        
          
        chromeDriver.navigate().to(URL);  
    
    // Click on the search text box and send value  
    chromeDriver.findElement(By.xpath("//input[@title='Search']")).sendKeys("rcb vs mi live score"); 
    chromeDriver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		
		  GooglePage googlePage=new GooglePage(getDriver());
		  googlePage.printTeamScores();
		 
    
		
		  // Click on the search button
		  driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		  
		  //Get the score score=driver.findElement(By.xpath(
		  "(//div[@class='imspo_mh_cricket__score-major'])[1]")).getText();
		  System.out.println("Score is:"+score);
		 
    
    chromeDriver.quit();
      
    }  */
  
}  
