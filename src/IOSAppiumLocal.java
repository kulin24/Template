import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;

@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
public class IOSAppiumLocal {

	public static void mains(String[] args) throws ParseException {
		SimpleDateFormat dateFormatGmt = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss");
		dateFormatGmt.setTimeZone(TimeZone.getTimeZone("UTC"));

		// Local time zone
		SimpleDateFormat dateFormatLocal = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss");

		// Time in GMT
		System.out.println(dateFormatGmt.format(new Date()));

		OffsetDateTime now = OffsetDateTime.now(ZoneOffset.UTC.ofHours(-7));
		System.out.println(now.format(DateTimeFormatter.ofPattern("MM/dd/yy")).toString());
		String formatted = now.toString();
		System.out.println(formatted);
	}

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.out.println("Run started");
		String browserName = "";

		DesiredCapabilities capabilities = new DesiredCapabilities(browserName, "", Platform.ANY);

		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("bundleId", "");

		// Create Remote WebDriver

		System.out.println("Creating Device Test per specified capabilities");
//		ChromeOptions co = new ChromeOptions();
//		co. setCapability("androidPackage", "com.android.chrome");
//		capabilities.setCapability(AndroidMobileCapabilityType.CHROME_OPTIONS, co);
		IOSDriver driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);

		try {

			try {
				driver.resetApp();
				Thread.sleep(15000);
//				Write selenium code here
				
				
				
				
				
				Thread.sleep(10000);
			} catch (Exception e) {
				System.out.println("Done");
				e.printStackTrace();
			} finally {
				try {
					driver.quit();
					System.out.println("Run ended");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} finally {
		}
	}

}
