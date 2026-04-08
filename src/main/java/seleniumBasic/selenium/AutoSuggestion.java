package seleniumBasic.selenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutoSuggestion {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/select.xhtml");
		WebElement searchBox = driver.findElement(By.id("j_idt87:auto-complete_input"));
		searchBox.sendKeys("Selenium WebDriver", Keys.ENTER);
		searchBox.sendKeys("AWS", Keys.ENTER);
	}
}