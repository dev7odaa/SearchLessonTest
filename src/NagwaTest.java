import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NagwaTest {

	String url = "https://www.nagwa.com";
	String printQuestions = "Number of questions displayed = ";
	
	@Test
	public void test_search() 
	{
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("/html/body/header/div[1]/div/div[2]/ul/li[2]/a/i")).click();
		driver.findElement(By.xpath("/html/body/header/div[1]/div/div[2]/ul/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/header/div[1]/div/div[3]/button/i")).click();
		driver.findElement(By.id("txt_search_query")).sendKeys("addition");
		driver.findElement(By.xpath("//*[@id=\"btn_global_search\"]/i")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/main/div[3]/ul/li[2]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"WorksheetSection\"]/div/div[2]/div/a")).click();
		
		 List<WebElement> elements = driver.findElements(By.className("one-part-question"));
		
		System.out.println(printQuestions + elements.size());
	
	}
	
}
