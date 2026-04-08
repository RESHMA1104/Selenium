package seleniumBasic.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Set;
import java.time.Duration;
import java.util.Iterator;
public class Demoqa {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/browser-windows");
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("Count of Window:"+ allWindowHandles.size());
		driver.findElement(By.id("windowButton")).click();
		Set<String> newAllWindowsHandles = driver.getWindowHandles();
		System.out.println("New Count of Window:"+ newAllWindowsHandles.size());
		String ParentHandle = driver.getWindowHandle();
		System.out.println("Parent Window:" +ParentHandle);
		Iterator<String> iterator = newAllWindowsHandles.iterator();
		String mainWindow = iterator.next();
		String childWindow = iterator.next();
		System.out.println("Parent Window :"+mainWindow);
		System.out.println("Child Window :"+childWindow);
		driver.switchTo().window(childWindow);
		WebElement text = driver.findElement(By.id("Sample Heading"));
		System.out.println("Child_Title :"+text.getText());
		driver.close();
		driver.switchTo().window(ParentHandle);
		System.out.println("Parent Title : "+driver.getTitle());
		driver.quit();
	}
}