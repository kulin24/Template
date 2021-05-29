import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
//import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class LocalSafariTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.out.println("Run started");

		String browserName = "Safari";
		DesiredCapabilities capabilities = new DesiredCapabilities(browserName, "", Platform.ANY);

		SafariDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		try {

			Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				driver.quit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		System.out.println("Run ended");

	}

}
