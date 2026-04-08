package seleniumBasic.selenium;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingAlert {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		List<WebElement> table = driver.findElements(By.xpath("//table[@id=\"table1\"]/thead/tr/th"));
		System.out.println(table.size());
		for(WebElement headings : table) {
			System.out.println(headings.getText());
		}
	}
}