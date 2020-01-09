package org.sample.chr;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTab {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\JavaSelenium\\DineshGanesan\\SeleJava\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-table/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		
		for(int i = 0; i<tRows.size(); i++)
		{
			WebElement cRows = tRows.get(i);
			//String text = cRows.getText();
			//System.out.println(text);
			List<WebElement> tData = driver.findElements(By.tagName("td"));
			for(int j = 0; j<tData.size(); j++)
			{
				WebElement cData = tData.get(j);
				String text1 = cData.getText();
				//System.out.println(text1);
				
				//To present particular data
				if(text1.equals("Dubai"))
					if (i==2) {
						System.out.println(tRows.get(i).getText());
					}
				/*{
					System.out.println(tData.get(j).getText());
					//System.out.println("Row number " + i);
					System.out.println("Column number " + j);
					
				}*/
					
			}
			/*List<WebElement> tHead = driver.findElements(By.tagName("th"));
			for(int j = 0; j<tHead.size(); j++)
			{
				WebElement cHead = tHead.get(j);
				String text1 = cHead.getText();
				System.out.println(text1);
			}*/
					
		}
	/*//To print the only one row
	WebElement dRows = tRows.get(3);
	String text2 = dRows.getText();
	System.out.println(text2);
	*/
			
	}

}
