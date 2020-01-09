package org.sample.chr;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	public static void main(String[] args)
	{
	//Set property/Headless
	System.setProperty("webdriver.chrome.driver", "E:\\JavaSelenium\\DineshGanesan\\SeleDrive\\driver\\chromedriver.exe");

	//Browser Launch
	WebDriver driver = new ChromeDriver();

	//Load url
	driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");

	//To get the title
	String t = driver.getTitle();
	System.out.println(t);

	//Maximize window
	driver.manage().window().maximize();
	driver.switchTo().frame("login_page");
	driver.findElement(By.name("fldLoginUserId")).sendKeys("Hello");
	//find the locator
	WebElement sa = driver.findElement(By.xpath("//img[@alt='continue']"));
	//Click
	sa.click();

	//Switch the alert(Should be mentioned)
	Alert a = driver.switchTo().alert();

	//To print the alert text in console
	String text = a.getText();
	System.out.println(text);

	//Alert click ok using method of accept();
	a.accept();

	}

}