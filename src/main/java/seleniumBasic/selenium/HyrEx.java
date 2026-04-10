package seleniumBasic.selenium;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HyrEx {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementsByName('name')[0].value ='Reshma'");
		js.executeScript("document.getElementsByName('name')[1].value = 'K'");
		js.executeScript("document.getElementsByTagName('input')[2].value = '2k22aids39@kiot.ac.in'");
		js.executeScript("document.getElementsByTagName('input')[3].value = 'kiot@1234'");
		js.executeScript("document.getElementsByTagName('input')[4].value = 'kiot@1234'");
		js.executeScript("document.getElementsByClassName('btn')[0].click()");
	}

}
