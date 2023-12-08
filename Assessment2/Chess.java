package Assessment2;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Chess {
		  static AppiumDriver driver = null;
		  
		  public static void main(String[] args) throws InterruptedException {
				try {
					openamazon();
				} catch (MalformedURLException e) {
					System.out.println(e.getCause());
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
		  public static void openamazon() throws MalformedURLException, InterruptedException {
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setCapability("deviceName", "OPPO Reno6 5G");
				cap.setCapability("udid", "U8KB9X45T4W8KVJN");
				cap.setCapability("platformName", "Android");
				cap.setCapability("platformVersion", "12");
				cap.setCapability("appPackage", "uk.co.aifactory.chessfree");
				cap.setCapability("appActivity", "uk.co.aifactory.chessfree.ChessFreeActivity");

				URL url = new URL("http://127.0.0.1:4723/wd/hub");

				driver = new AppiumDriver(url, cap);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				Thread.sleep(2000);
				driver.findElement(By.id("uk.co.aifactory.chessfree:id/YesButton")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("uk.co.aifactory.chessfree:id/ButtonPlay")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("uk.co.aifactory.chessfree:id/CrossProm_ExitButton")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.Button")).click();
				driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[10]/android.widget.Button[1]")).click();
				driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")).click();
				WebElement ok = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button"));
				ok.click();
				WebElement menu = driver.findElement(By.id("uk.co.aifactory.chessfree:id/ButtonMenu"));
				menu.click();
}
}