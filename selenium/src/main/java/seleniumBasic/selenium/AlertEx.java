package seleniumBasic.selenium;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertEx {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.leafground.com/alert.xhtml");
		WebElement alert = driver.findElement(By.xpath("//span[@class=\"ui-button-text ui-c\"]"));
		alert.click();
		//Used to Handle the errors
		Alert al = driver.switchTo().alert();
		al.accept();
	}

}
