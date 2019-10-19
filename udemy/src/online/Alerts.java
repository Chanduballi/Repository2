package online;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\Desktop\\driver chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/bootstrap-modal-demo.html");
		driver.findElement(By.className("btn btn-primary")).click();
		driver.switchTo().alert().accept();
	}

}
