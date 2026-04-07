package seleniumBasic.selenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class demoweb {
	public static void main() {
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[@id='login2']")).click();

		driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("arasu");

		driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("arasu");

		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

	}



}

