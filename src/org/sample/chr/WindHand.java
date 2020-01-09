package org.sample.chr;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindHand {
	
	public static void main(String[] args) throws AWTException, InterruptedException
	{
		//Set property/Headless
		System.setProperty("webdriver.chrome.driver", "E:\\JavaSelenium\\DineshGanesan\\DineshJavaSeleniumDay2\\driver\\chromedriver.exe");
		//Browser launch
		WebDriver driver = new ChromeDriver();
		//Load url
		driver.get("http://www.greenstechnologys.com/");
		//Maximize
		driver.manage().window().maximize();
		//To get the title
		String title = driver.getTitle();
		System.out.println(title);
		
		Actions a = new Actions(driver);
		//Find the locator
		WebElement contactUs = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		//Right Click
		a.contextClick(contactUs).perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//To get parent window id
		String parentWindowId = driver.getWindowHandle();
		System.out.println("Parent window id is " +parentWindowId);
		
		//To get all window id
		Set<String> allWindowId = driver.getWindowHandles();
		System.out.println("All window id is " + allWindowId);
		for(String eachId : allWindowId)
		{
			if(!parentWindowId.equals(allWindowId))
			{
				//Switch into child window
				driver.switchTo().window(eachId);
			}
			//System.out.println("Switched into child window");
		}
		System.out.println("Switched into Child Window");
		Thread.sleep(3000);
		WebElement address = driver.findElement(By.xpath("(//h5[@style='color:yellow;'])[2]"));
		String text = address.getText();
		System.out.println(text);
		//Return parent window
		driver.switchTo().window(parentWindowId);
		System.out.println("Returned parent window");
		}	
}
		
