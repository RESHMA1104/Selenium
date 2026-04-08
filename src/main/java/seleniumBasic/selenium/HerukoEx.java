package seleniumBasic.selenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HerukoEx {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("2k22aids39@kiot.ac.in");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Reshma@11");
		WebElement submit = driver.findElement(By.id("submit"));
		submit.click();
		WebElement data = driver.findElement(By.xpath("//tr[@class=\"contactTableBodyRow\"]//td"));
		System.out.println(data.getText());	
	}
}