package seleniumBasic.selenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class DemoWebsite {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demoblaze.com/index.html");
		driver.findElement(By.cssSelector("class[data-target~=\"#logInModal\"]")).click();
		WebElement element=driver.findElement(By.cssSelector("input#loginusername"));
		element.sendKeys("Reshmaa");
		WebElement element2=driver.findElement(By.cssSelector("input#loginpassword"));
		element2.sendKeys("Resh@11");
		driver.findElement(By.cssSelector("button[class=\"btn btn-primary\"]")).click();
	}
}
