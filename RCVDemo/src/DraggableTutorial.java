import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableTutorial {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\browserdrivers\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement draggable = driver.findElement(By.id("form:conpnl_content"));
		
		Actions actions = new Actions(driver);
		
		actions.clickAndHold(draggable).moveByOffset(100, 200).release().build().perform();

	}

}
