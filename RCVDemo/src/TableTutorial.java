import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableTutorial {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\browserdrivers\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/table.xhtml");
		
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int columnsCount = columns.size();
		System.out.println("Columns: "+columnsCount);
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowsCount = rows.size();
		System.out.println("Rows: "+rowsCount);

	}

}
