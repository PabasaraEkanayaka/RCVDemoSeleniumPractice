import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitPart1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\browserdrivers\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://www.leafground.com/waits.xhtml");
		
		
		WebElement textElement = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/div/div/span[2]/button/span"));
		String text = textElement.getText();
		System.out.println(text);

	}

}
