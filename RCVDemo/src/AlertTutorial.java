import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTutorial {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\browserdrivers\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node01ngo7hg0muov539fymub3678d655931.node0");
		
		WebElement alertButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/button/span[2]"));
		alertButton.click();
		
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		WebElement confirmButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/button/span[2]"));
		confirmButton.click();
		
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		
		WebElement promptButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/button/span[2]"));
		promptButton.click();
		
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("TestLeaf");
		alert3.accept();

	}

}
