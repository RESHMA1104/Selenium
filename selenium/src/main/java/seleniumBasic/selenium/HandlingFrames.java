package seleniumBasic.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Set;
import java.time.Duration;
public class HandlingFrames {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		WebElement iframeElement = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(iframeElement);
		String Frame_1 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(Frame_1);
		driver.switchTo().defaultContent();
		String mainpage = driver.findElement(By.id("")).getText();
		System.out.println();
		String Frame_2 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(Frame_2);
		
		
	}

}
