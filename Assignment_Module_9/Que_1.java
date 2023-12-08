package Assignment_Module_9;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

// Write an Appium Program to connect with Realdevice and open APIdemo.app application on your realdevice.

public class Que_1 {
	
		static AppiumDriver driver = null;

		public static void main(String[] args) throws InterruptedException {
			try {
				openApi();
	
			} catch (MalformedURLException e) {
				System.out.println(e.getCause());
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	
		public static void openApi() throws MalformedURLException, InterruptedException {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", "OPPO Reno6 5G");
			cap.setCapability("udid", "U8KB9X45T4W8KVJN");		
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "12");
			cap.setCapability("app", "C:\\Users\\Sarika Namsha\\Downloads\\ApiDemos-debug.apk");
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
	
			driver = new AppiumDriver(url, cap);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
		
}
}

