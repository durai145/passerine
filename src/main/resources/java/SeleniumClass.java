
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;

public class SeleniumClass {

public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\agalya\\Downloads\\chromedriver_win32_96\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.manage().window().maximize();

driver.get("https://kindgirls.com");

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
WebElement email=  driver.findElement(By.name("email"));
if (email != null) {
	email.sendKeys("durai", Keys.TAB);
	WebElement password=  driver.findElement(By.name("password"));
	
	password.sendKeys("1qaz2wsx", Keys.TAB, Keys.TAB);
	
	WebElement submit= driver.findElement(By.className("btnAction"));
	submit.click();
	
	
}


//driver.close();

}

}