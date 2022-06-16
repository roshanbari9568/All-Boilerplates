import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse_parent\\eclipse_resources\\ChromePath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Invoking Webdriver
		driver.get("http://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize(); // This will maximize the driver window
	}
}
