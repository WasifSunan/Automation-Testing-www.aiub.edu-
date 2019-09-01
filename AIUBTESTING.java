package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AIUBTESTING {

	private static JavascriptExecutor jes;

	public static void main(String[] args)throws InterruptedException {
		jes = null;
		
		System.setProperty("webdriver.gecko.driver" , "C:\\Users\\USER\\Downloads\\Compressed\\geckodriver.exe");
        WebDriver driver = (WebDriver) new FirefoxDriver();
        driver.get("http://www.aiub.edu");
        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/ul[2]/li[2]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[3]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/a[2]/button")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/a[3]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/a[4]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/a[5]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/a[6]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/a[7]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/ul[2]/li[2]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/a[2]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[3]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[3]/a[1]")).click();
        
        jes =(JavascriptExecutor)driver;
        driver.quit();
	}

}