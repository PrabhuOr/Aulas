package Test;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTest.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class FeeTest extends BaseTest{
	AppiumDriver driver;
/*
	public FeeTest(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	AppiumDriver driver;
	  
	//FeePage FP;
	*/
	@BeforeClass()
	private void Update () throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")).click();
		
		 	
		
	}
	
	
	@BeforeMethod
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
		//driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.TextView[@text='CONTINUE']")).click();
		Thread.sleep(9000);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		//wait.until(ExpectedConditions.textToBePresentInElementLocated(driver.findElement(By.xpath("//android.widget.TextView[@text='VERIFY']")),"VERIFY"));, null)
		driver.findElement(By.className("android.widget.EditText")).sendKeys("592726");
		//driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.TextView[@text='VERIFY']")).click();
		
	}
	
	@Test(priority=1)
	public void feeViewMore() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.findElement(AppiumBy.accessibilityId("Fee, tab, 3 of 4")).click();
		Thread.sleep(4000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='VIEW MORE']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Week']")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Months']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Months']")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Week']")).click();
		Thread.sleep(3000);
		//driver.findElement(AppiumBy.id("header-back")).click();
		driver.findElement(AppiumBy.accessibilityId("Go back")).click();
	}
	
	@Test(priority=2)
	public void generatePaymentRequestIndividual() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.findElement(AppiumBy.accessibilityId("Fee, tab, 3 of 4")).click();
		Thread.sleep(4000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Generate Payment Request']")).click();
		Thread.sleep(4000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Select Class']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='0 - BP8']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[1]")).sendKeys("Stu");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='student']")).click();
		Thread.sleep(4000);
		driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[2]")).sendKeys("40");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Set due date']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='14']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[3]")).sendKeys("Your College Fee ,Make Sure To Pay Before Due Date");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"SEND REQUEST\"));"));
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='SEND REQUEST']")).click();
		Thread.sleep(2000);
		
	 
	}
	@Test(priority=3)
	public void generatePaymentRequestClass() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(AppiumBy.accessibilityId("Fee, tab, 3 of 4")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Generate Payment Request']")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Class']")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Select Class']")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='0 - BP8']")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[1]")).sendKeys("40");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Set due date']")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='14']")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[2]")).sendKeys("Your Exam Fee ,Make Sure To Pay Before Due Date");
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"SEND REQUEST\"));"));
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='SEND REQUEST']")).click();
		/*
		String toastMessage=driver.findElement(By.xpath("//android.widget.Toast")).getAttribute("name");
		//Assert.assertEquals(toastMessage,"Payment request sent successfully");
		String Expected="Payment request sent successfully";
		if(toastMessage.equals(Expected))
		{
			System.out.println("toastMessage");
		}
		else
		{
			System.out.println("Error");
		}
         */
		
	 
	}
	@Test(priority=4)
	public void addOfflinePayment() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(AppiumBy.accessibilityId("Fee, tab, 3 of 4")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Add Offline Payment']")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Select Class']")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='0 - BP8']")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[1]")).sendKeys("Stu");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='student']")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[2]")).click();
		//driver.hideKeyboard();
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"4000\"));"));
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text='4000'])[1]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Set payment date']")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='1']")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Cash']")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ADD\"));"));
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='ADD']")).click();
		/*String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		StringBuilder name = new StringBuilder(8);
		for (int n = 0; n < 8; n++)
		{
			name.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		*/
		
	}
	
	
	
}
