package seleniumBasic.selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
public class Test_Script {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.hyrtutorials.com/p/add-padding-to-containers.html";
		driver.get(url); 
		WebElement first_name = driver.findElement(By.name("First Name"));
		first_name.sendKeys("Reshma", Keys.ENTER);
		WebElement last_name = driver.findElement(By.name("Last Name"));
		last_name.sendKeys("Kumar", Keys.ENTER);
		WebElement email = driver.findElement(null);
	}
}