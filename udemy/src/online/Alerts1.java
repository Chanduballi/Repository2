package online;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\Desktop\\driver chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();
		System.out.println(driver.switchTo().alert().getText());
	   driver.switchTo().alert().accept();

	}

}
