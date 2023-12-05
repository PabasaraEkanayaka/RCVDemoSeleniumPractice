import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DroppableTutorial {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\browserdrivers\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement draggable = driver.findElement(By.id("form:drag_content"));
		WebElement droppable = driver.findElement(By.id("form:drop_content"));
		
		Actions actions = new Actions(driver);
		
		actions.clickAndHold(draggable).moveToElement(droppable).release().build().perform();

	}

}
