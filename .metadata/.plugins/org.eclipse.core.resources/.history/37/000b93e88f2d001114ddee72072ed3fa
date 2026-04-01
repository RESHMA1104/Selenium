package seleniumBasic.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flipkart {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.flipkart.com";
		driver.get(url);
		String title = driver.getTitle();
		int title_length = driver.getTitle().length();
		System.out.println(title);
		System.out.println(title_length);
		String Currenturl = driver.getCurrentUrl();
		if(url.equals(Currenturl)) {
			System.out.println("Page found");
		}
		else {
			System.out.println("Page Not Found");
		}
		String pageSource = driver.getPageSource();
		int pagesource_length = driver.getPageSource().length();
		System.out.println(pageSource);
		System.out.println(pagesource_length);
	}
}