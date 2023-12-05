import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonTutorial {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\browserdrivers\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.leafground.com/button.xhtml");
		
		WebElement positionButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/button/span[2]"));
		int xValue = positionButton.getLocation().getX();
		int yValue = positionButton.getLocation().getY();
		
		System.out.println("X value is : "+xValue);
		System.out.println("Y value is : "+yValue);
		
		WebElement colorButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[4]/button/span[2]"));
		String color = colorButton.getCssValue("background-color");
		System.out.println("Color is : "+color);
		
		WebElement sizeButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/button/span[2]"));
		int width = sizeButton.getSize().getWidth();
		int height = sizeButton.getSize().getHeight();
		
		System.out.println("Width is :"+width);
		System.out.println("Height is :"+height);
		
		
		

	}

}
