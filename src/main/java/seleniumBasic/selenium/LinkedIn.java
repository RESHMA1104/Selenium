package seleniumBasic.selenium;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LinkedIn {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login");
		WebElement element=driver.findElement(By.cssSelector("input#username"));
		element.sendKeys("jananisathishkumar380@gmail.com");
		WebElement element2=driver.findElement(By.cssSelector("input#password"));
		element2.sendKeys("Janani@12");
		driver.findElement(By.cssSelector("button[class^=\"btn__primary--large from__button--floating\"]")).click();
		
		if(driver.findElement(By.cssSelector("svg#icon-grid")).isDisplayed()){
			System.out.println("SignUp Successfully");
		}
		else {
			System.out.println("not SignUp Successfully");
		}
		
		}

}