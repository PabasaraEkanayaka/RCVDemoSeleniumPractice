import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitPart2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\browserdrivers\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://www.leafground.com/waits.xhtml");
		
		WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[2]/div/div/span[1]/button/span"));
		wait.until(ExpectedConditions.textToBePresentInElement(button, "Click"));
		button.click();
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();

	}

}
