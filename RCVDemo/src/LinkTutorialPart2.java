import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTutorialPart2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\browserdrivers\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/link.xhtml");
		
		WebElement whereLink = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/div/div/a"));
		
		String link = whereLink.getAttribute("href");
		
		System.out.println(link);
		
		WebElement brokenLink = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/div/div/a"));
		
		brokenLink.click();
		String title = driver.getTitle();
		
		
		if(title.contains("404"))
		{
			System.out.println("This page is broken");
		}
		else
		{
			System.out.println("This page is not broken");
		}
		
		driver.navigate().back();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int linkCount = links.size();
		System.out.println(linkCount);
		
		List<WebElement> dashboardLinks = driver.findElements(By.linkText("Go to Dashboard"));
		dashboardLinks.get(1).click();
	}

}
