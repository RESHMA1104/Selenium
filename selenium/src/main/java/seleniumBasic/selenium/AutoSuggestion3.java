package seleniumBasic.selenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class AutoSuggestion3 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.leafground.com/select.xhtml");
		WebElement searchBox = driver.findElement(By.id("j_idt87:auto-complete_input"));
		Actions act = new Actions(driver);
		searchBox.sendKeys("Selenium WebDriver");
		WebElement option2 = driver.findElement(By.xpath("//li[@data-item-label=\"Selenium WebDriver\"]"));
		act.moveToElement(option2).click().perform();
	}
}