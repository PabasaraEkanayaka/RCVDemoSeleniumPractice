import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTutorialP1 {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.gecko.driver", "F:\\browserdrivers\\geckodriver-v0.33.0-win64\\geckodriver.exe");
			FirefoxDriver driver = new FirefoxDriver();
			
			driver.get("http://leafground.com/pages/Link.com");
			
			//driver.findElement(By.linkText("Go to Dashboard")).click();
			driver.findElement(By.partialLinkText("Dashboard")).click();

	}

}
