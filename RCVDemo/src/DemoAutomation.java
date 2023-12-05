import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\browserdrivers\\chromedriver-win64\\chromedriver.exe");
		
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

	}

}
