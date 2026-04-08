package seleniumBasic.selenium;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingAlert2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		List<WebElement> row = driver.findElements(By.xpath("//table[@id=\"table1\"]//tr"));
		int rowsCount = row.size();
		List<WebElement> column = driver.findElements(By.xpath("//table[@id=\"table1\"]//th"));
		int columnCount = column.size();
		for(int r=1; r<=rowsCount; r++) {
			for(int c=1; c<=columnCount; c++) {
				WebElement data;
				if(r==1) {
					data = driver.findElement(By.xpath("//table[@id=\"table1\"]//tr["+r+"]//th["+c+"]"));
				}
				else {
					data=driver.findElement(By.xpath("//table[@id=\"table1\"]//tr["+r+"]//td["+c+"]"));
					String ta = data.getText();
					System.out.print(ta);
				}
			}
		}
	}

}
