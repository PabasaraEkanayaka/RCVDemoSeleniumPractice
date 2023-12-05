import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTutorial {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\browserdrivers\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/window.xhtml");

		String oldWindow = driver.getWindowHandle();
		
		WebElement homeButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/button/span"));
		homeButton.click();
		
		WebElement multipleButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/button/span"));
		multipleButton.click();
		
		Set<String> newWindows = driver.getWindowHandles();
		int windowCount = newWindows.size();
		System.out.println("Window count is : "+windowCount);
		
		for (String window : newWindows) {
			if(!window.equals(oldWindow))
			{
				driver.switchTo().window(window).close();
			}
		}
		
		driver.switchTo().window(oldWindow);
		
		WebElement delayButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[2]/button/span"));
		delayButton.click();
		
		driver.quit();
	}

}
