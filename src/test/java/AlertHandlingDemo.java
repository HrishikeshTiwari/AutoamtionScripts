import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("https://www.browserstack.com/users/sign_up");
		driver.findElement(By.id("user_full_name")).sendKeys("Hrishikesh");
		driver.findElement(By.id("user_email_login")).sendKeys("hrishikeshbihar@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("Mahadev@1296");
		Thread.sleep(2000);
		driver.findElement(By.id("user_submit")).click();
		
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		String text= alert.getText();
		System.out.println(text);
		Thread.sleep(2000);
		alert.accept();
		driver.quit();
		

	}

}
