package seleniumBasic.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionDemo4 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Actions act = new Actions(driver);
		WebElement option2 = driver.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']"));
		act.moveToElement(option2).doubleClick().perform();
	}
}