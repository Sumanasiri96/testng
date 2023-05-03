import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tutorial
{
//input
	
	static WebDriver driver = new ChromeDriver();
	static WebElement input= driver.findElement(By.xpath("//*[@id=\"home\"]"));
}
