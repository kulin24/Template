import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LocalChromeTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.out.println("Run started");

		String browserName = "Chrome";
		DesiredCapabilities capabilities = new DesiredCapabilities(browserName, "", Platform.ANY);
		ChromeOptions options=new ChromeOptions();
		
		System.setProperty("webdriver.chrome.driver", "/Users/kulinsitwala/Downloads/chromedriver 3");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		try {
			driver.manage().window().maximize();
			
			
		} catch (Exception e) {
			
			
			e.printStackTrace();
		} finally {
			try {
				  Thread.sleep(20000);
				driver.quit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		System.out.println("Run ended");

	}


}
