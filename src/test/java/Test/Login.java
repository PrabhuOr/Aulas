package Test;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import BaseTest.BaseTest;
import io.appium.java_client.HidesKeyboard;

public class Login extends BaseTest {
	

	
	@Test(priority = 1)
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






}
