package seleniumBasic.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
import java.time.Duration;
public class LeafGround {
	public static void  main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.leafground.com/window.xhtml");
	String parentwindow = driver.getWindowHandle();
	System.out.println("Parent Window:"+ parentwindow);
	Set<String> allWindowHandles = driver.getWindowHandles();
	System.out.println("Count of Window:"+ allWindowHandles.size());
	driver.findElement(By.cssSelector("span.ui-button-text ui-c")).click();
	Set<String> newAllWindowsHandles = driver.getWindowHandles();
	System.out.println("New Count of Window:"+ newAllWindowsHandles.size());
	}
}