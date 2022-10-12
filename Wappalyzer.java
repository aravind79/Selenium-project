package wappalyzer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wappalyzer {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE TESTING\\Selenium\\Webdriver chrome105\\chromedriver_win32\\chromedriver.exe");
		WebDriver D= new ChromeDriver();
        D.get("https://www.wappalyzer.com/");
        D.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]")).click();
        D.findElement(By.xpath("//div[@class='v-list-item__title subtitle-2'][normalize-space()='Technologies']")).click();
        D.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       D.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/a/div/div/div[2]/span")).click();
       D.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[1]/div[2]/div[3]/div/div/a")).click();
       

	}

}
