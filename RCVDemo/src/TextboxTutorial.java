import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextboxTutorial {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\browserdrivers\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.leafground.com/input.xhtml");
		
		WebElement nameBox = driver.findElement(By.id("j_idt88:name"));
		nameBox.sendKeys("Oshadhi Ekanayaka");
		
		WebElement appendBox = driver.findElement(By.id("j_idt88:j_idt91"));
		appendBox.sendKeys("Colombo"+Keys.TAB);
		
		WebElement clearBox = driver.findElement(By.id("j_idt88:j_idt95"));
		clearBox.clear();
		
		WebElement disableBox = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div[1]/div/form/div[3]/div"));
		boolean status = disableBox.isEnabled();
		System.out.println(status);
	
		
		

	}

}
