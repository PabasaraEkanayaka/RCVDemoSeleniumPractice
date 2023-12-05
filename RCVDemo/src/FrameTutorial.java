import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTutorial {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\browserdrivers\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml");
		
		
		driver.switchTo().frame(0);
		
		WebElement firstButton = driver.findElement(By.id("Click"));
		firstButton.click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		WebElement secondButton = driver.findElement(By.id("Click"));
		secondButton.click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> noOfFrames = driver.findElements(By.tagName("iframe"));
		
		int frameCount = noOfFrames.size();
		
		System.out.println("Frame Count is : "+frameCount);
	}

}
