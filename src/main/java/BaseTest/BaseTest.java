package BaseTest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.HidesKeyboard;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
public class BaseTest {
	
	public AppiumDriver driver;
	public AppiumDriverLocalService service;
    public static Properties prop;
	/*
	public BaseTest(AppiumDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	*/
    public void Login() throws MalformedURLException, InterruptedException {
		//	FP=new FeePage(driver);
			//initilization();
			
			//tagName[@attribute='value']  -> //tagName
			Thread.sleep(8000);
			
			driver.findElement(By.xpath("//android.widget.TextView[@text='UPDATE NOW']")).click();
			Thread.sleep(8000);
		    driver.findElement(By.xpath("//android.widget.TextView[@text='RESTART AULAS']")).click();
		    Thread.sleep(1000);
			for(int i=0;i<7;i++) {
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[10]/android.view.ViewGroup")).click();
			}
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup/android.widget.TextView")).click();
			driver.findElement(By.className("android.widget.EditText")).sendKeys("9812168599");
			((HidesKeyboard) driver).hideKeyboard();
			driver.findElement(By.xpath("//android.widget.TextView[@text='CONTINUE']")).click();
			Thread.sleep(5000);
			driver.findElement(By.className("android.widget.EditText")).sendKeys("592726");
			((HidesKeyboard) driver).hideKeyboard();
			driver.findElement(By.xpath("//android.widget.TextView[@text='VERIFY']")).click();
			Thread.sleep(5000);
			System.out.println("The Login was successfull");
		}
    
    public void ScrollAndClick(String visibleText) {
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))")).click();
	        }


    public void swipeAction(WebElement ele, String direction){

		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement)ele).getId(),
		    "direction", direction,
		    "percent", 0.75
		));
			
}


    public void checkUpdates() throws InterruptedException, MalformedURLException {
		Thread.sleep(9000);
		boolean isPresent=driver.findElement(By.xpath("//*[@text='Update available']")).isDisplayed();
		if(isPresent) {
		List<WebElement> ele=driver.findElements(By.xpath("//*[@class='android.widget.TextView']"));
		int sizis=ele.size();
		System.out.println("The size is "+sizis);
		for(int i=0;i<sizis;i++) {
			String namesare=driver.findElements(By.xpath("//*[@class='android.widget.TextView']")).get(i).getText();
			System.out.println("The names are:"+namesare);
			if(namesare.equalsIgnoreCase("Update available")) {
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@text='UPDATE NOW']")).click();
				/*long startTime = System.nanoTime();
				while ((System.nanoTime()-startTime)< 5*60*NANOSEC_PER_SEC){
				  //System.out.println("waiting for 5 min");
				}*/
				String retrieved_text = driver.findElement(By.xpath("//*[@text='Updating']")).getText();
				System.out.println("The test is :"+retrieved_text);
	        //WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(5));
			//	wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//*[@text='Updating']"), retrieved_text));
				break;
			}
			
		}
		driver.findElement(By.xpath("//*[@text='RESTART AULAS']")).click();
		Thread.sleep(1000);
		System.out.println("Restart was successfully...");
		Thread.sleep(1000);
		Login();
		
	}
		else {
			Thread.sleep(1000);
			Login();
			Thread.sleep(1000); }
			
		}
		
		
	@BeforeClass
	public void initilization() throws MalformedURLException, InterruptedException {
		// CODE TO START SERVER
		// AndroidDriver , IOSDriver
		//Appium code -> Appium Server -> Mobile
		
		service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Brigosha_Guest\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				   .withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("realme RMX3171");
		options.setApp("C:\\Users\\Brigosha_Guest\\Documents\\app-release.apk");
		
		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	     Thread.sleep(3000);
	     //Actual automation
	     //Xpath, id, accessibilityId, classname, androidUIAutomator.
	    // Login();
	
	}
	
	@AfterClass
	private void tearDown() {
		driver.quit();
		service.stop();
		//stop server
	}
}








