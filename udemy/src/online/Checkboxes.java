package online;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\Desktop\\driver chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.findElement(By.id("familyandfriend")).isSelected());
	    driver.findElement(By.id("familyandfriend")).click();
	    Thread.sleep(5000);
		System.out.println(driver.findElement(By.id("familyandfriend")).isSelected());
		
		//not printing true statement
		
	}

}
