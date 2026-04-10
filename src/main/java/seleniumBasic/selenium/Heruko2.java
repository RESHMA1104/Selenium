package seleniumBasic.selenium;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Heruko2 {
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
		String Excepted = "Balu S";
		List<WebElement> data = driver.findElements(By.xpath("//table[@id='myTable']//tr//td[2]"));
		int contactCount = data.size();
		System.out.println("Total Contact Count : "+contactCount);
		for(WebElement webdata : data) {
		System.out.println(webdata.getText());	
		}
		int i=1;
		for(WebElement names : data) {
			if(names.getText().equals(Excepted)) {
				List<WebElement> actualrowdata = driver.findElements(By.xpath("//table[@id='myTable']/tr["+ i +"]"));
				for(WebElement row : actualrowdata) {
					System.out.println(row.getText());		
				}
			}
			i++;
		}
		driver.quit();
	}
}