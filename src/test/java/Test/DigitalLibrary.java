package Test;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import BaseTest.BaseTest;
import io.appium.java_client.AppiumBy;

public 
class DigitalLibrary extends BaseTest{
	
	
	

	@Test(priority = 1)
	private void library () throws InterruptedException {
		
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Library, tab, 2 of 4\"]/android.widget.TextView[1]")).click();
		//driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Library, tab, 2 of 4\"]/android.view.ViewGroup/android.widget.TextView")).click();
		//android.widget.Button[@content-desc="Library, tab, 2 of 4"]/android.view.ViewGroup/android.widget.TextView
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		 
	}

	@Test(enabled = false)
	private void scrollDown () {
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

		boolean canScrollMore;
		do
		{
		canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		    "left", 100, "top", 100, "width", 200, "height", 200,
		    "direction", "Left",
		    "percent", 3.0
		));
		}while(canScrollMore);		
		
	}
	
	@Test
	private void scroll () {
		
		boolean canScrollMore;
		do {
			canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap
					.of("left", 200, "top", 400, "width", 300, "height", 600, "direction", "up", "percent", 1.0));
		} while (canScrollMore);
		
		
	}
	
	@Test(priority = 2)
	public void swipeAction(WebElement ele, String direction){
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

	((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
	    "elementId", ((RemoteWebElement)ele).getId(),
	    "direction", "left",
	    "percent", 0.75
	));
	}


	
	
	
	
	
	}


	
		
		
		
		
		
		
		
		
	
	

