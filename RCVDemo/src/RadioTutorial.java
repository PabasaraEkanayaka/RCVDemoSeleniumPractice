import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioTutorial {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\browserdrivers\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.leafground.com/radio.xhtml");
		
		WebElement chromeButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/div/table/tbody/tr/td[1]/div/div[2]/span"));
		WebElement firefoxButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/div/table/tbody/tr/td[2]/div/div[2]/span"));
		WebElement safariButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/div/table/tbody/tr/td[3]/div/div[2]/span"));
		WebElement edgeButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/div/table/tbody/tr/td[4]/div/div[2]/span"));
		
		if(chromeButton.isSelected() == true)
		{
			System.out.println("chrome Button is selected");
		}
		if(firefoxButton.isSelected() == true)
		{
			System.out.println("firefox Button is selected");
		}
		if(safariButton.isSelected() == true)
		{
			System.out.println("safari Button is selected");
		}
		if(edgeButton.isSelected() == true)
		{
			System.out.println("edge Button is selected");
		}
		
		WebElement above40 = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[2]/div/div/div/div/div[3]/div/div[2]/span"));
		
		if(above40.isSelected() == false)
		{
			above40.click();
		}

	}

}
