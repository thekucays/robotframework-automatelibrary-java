package com.cicil.robotautomatelibrary;

import java.net.URL;

//import org.apache.http.cookie.ClientCookie;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.springframework.core.io.Resource;
//
import com.cicil.extenders.WelcomeExtender;
import com.cicil.interfaces.Welcomer;
////import com.experitest.appium.SeeTestClient;
//import com.tomgibara.android.camera.CameraSource;
//import com.tomgibara.android.camera.SocketCamera;
//
//import android.graphics.Bitmap;
//import android.graphics.BitmapFactory;
//import android.graphics.Canvas;

/*
 * Prerequisites:
 * - download selenium jar from https://docs.seleniumhq.org/download/ (choose selenium standalone server)
 */

public class CalculatorTest extends WelcomeExtender implements Welcomer{
	//don't ever forget to use this on every class, so robot will recognize it
	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";
	
	public void welcomeTheTester() {
		super.printWelcome(this.getClass().getName());
	}
	
	public static void main(String[] args) {
//		WebDriver driver;
//		String accessKey = "eyJ4cC51Ijo3MDYzLCJ4cC5wIjo2MzU0LCJ4cC5tIjoiTVRVME16VXhPRGswTWpBeE13IiwiYWxnIjoiSFMyNTYifQ.eyJleHAiOjE4NTg4NzkwMzUsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.zl3ukyCVrWRO2pmwhIKL_JpLPn47VUohqvdAD1Xg9nk";
		try {
//			DesiredCapabilities capabilities = new DesiredCapabilities();
//			capabilities.setCapability("BROWSER_NAME", "Android");
//			capabilities.setCapability("VERSION", "7.0"); 
//			capabilities.setCapability("deviceName","330044b1985082cb");
//			capabilities.setCapability("platformName","Android");
//			capabilities.setCapability("instrumentApp", true);
////			capabilities.setCapability("accessKey", accessKey);
//			
//			// ini si kalkulator
//			capabilities.setCapability("appPackage", "id.co.cicil.staging");
//	         capabilities.setCapability("appActivity", "id.co.cicil.ui.launcher.LauncherActivity");
////			capabilities.setCapability("appPackage", "com.gamma.scan");
////			capabilities.setCapability("appActivity", "com.gamma.barcodeapp.ui.BarcodeCaptureActivity");
//			
//			System.out.println("creating new remote driver");
//			driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//			
//			// sleep, and do some action
//			System.out.println("Sleeping 5s");
//			Thread.sleep(5000);
			
			// try using socket camera
			//CameraSource cs = new SocketCamera("192.168.0.100", 9889, 320, 240, true);
//			try {
//				CameraSource cs = new SocketCamera("192.168.28.101", 5555, 320, 240, true);
//				if (!cs.open()) {  
//					//deal with failure to obtain camera 
//				}
//	//			Bitmap bmp = Bitmap.createScaledBitmap(src, dstWidth, dstHeight, filter);
//				Bitmap bmp2 = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
//				Canvas csv = new Canvas(bmp2);
//				cs.capture(csv);//capture the frame onto the canvas
//				cs.close();
//			} catch(Exception e) {
//				e.printStackTrace();
//			}
			
			// try inject picture
//			SeeTestClient client = new SeeTestClient((RemoteWebDriver)driver);
//			System.out.println("after creating new client");
//			client.setProperty("android.instrumentation.camera", "true");
//			System.out.println("Simulating capture");
//			client.simulateCapture("C:\\3.png");
//			System.out.println("Simulated");
			
			
			// click some element
//			System.out.println("wake up from sleep after 10s");
//			
//			WebElement btnClear = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.Button[3]"));
//			btnClear.click();
//			Thread.sleep(10000);
		} catch(Exception e) {
			System.out.println("there are fucking errors");
			e.printStackTrace();
		}	
	}

	
//	public void clickFromRobot(Object webDriver, String xpath) {
//		System.out.println("WebDriver object: " + webDriver.toString());
//		
//		try {
//			WebDriver driver2 = (WebDriver) webDriver;
//			WebElement element = driver2.findElement(By.xpath(xpath));
//			element.click();
//		} catch(Exception e) {
//			System.out.println(e.toString());
//			e.printStackTrace();
//		}
//	}
	
	public void sayHelloCalculator() {
		System.out.println("Hello calculator");		
	}
		
}
