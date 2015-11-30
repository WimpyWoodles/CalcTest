package CalcTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTestSuite {
	
	@Test
	public void testWebCalc() throws InterruptedException {
	 
	  System.setProperty("webdriver.chrome.driver", "/Users/kassandraknapp/Downloads/chromedriver");
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("http://web2.0calc.com/");
	  
	  //Multiplication
	  driver.findElement(By.id("Btn4")).click();
	  driver.findElement(By.id("Btn2")).click();
	  driver.findElement(By.id("Btn3")).click();
	  driver.findElement(By.id("BtnMult")).click();
	  driver.findElement(By.id("Btn5")).click();
	  driver.findElement(By.id("Btn2")).click();
	  driver.findElement(By.id("Btn5")).click();
	  driver.findElement(By.id("BtnCalc")).click();
	  Thread.sleep(1000);
	  String multiResult = driver.findElement(By.id("input")).getAttribute("value");
	  Assert.assertEquals(multiResult, "222075");
	  driver.navigate().refresh();
	  
	  //Division
	  driver.findElement(By.id("Btn4")).click();
	  driver.findElement(By.id("Btn0")).click();
	  driver.findElement(By.id("Btn0")).click();
	  driver.findElement(By.id("Btn0")).click();
	  driver.findElement(By.id("BtnDiv")).click();
	  driver.findElement(By.id("Btn2")).click();
	  driver.findElement(By.id("Btn0")).click();
	  driver.findElement(By.id("Btn0")).click();
	  driver.findElement(By.id("BtnCalc")).click();
	  Thread.sleep(1000);
	  String divResult = driver.findElement(By.id("input")).getAttribute("value");
	  Assert.assertEquals(divResult, "20");
	  driver.navigate().refresh();
	  
	  //Addition
	  driver.findElement(By.id("BtnMinus")).click();
	  driver.findElement(By.id("Btn2")).click();
	  driver.findElement(By.id("Btn3")).click();
	  driver.findElement(By.id("Btn4")).click();
	  driver.findElement(By.id("Btn2")).click();
	  driver.findElement(By.id("Btn3")).click();
	  driver.findElement(By.id("Btn4")).click();
	  driver.findElement(By.id("BtnPlus")).click();
	  driver.findElement(By.id("Btn3")).click();
	  driver.findElement(By.id("Btn4")).click();
	  driver.findElement(By.id("Btn5")).click();
	  driver.findElement(By.id("Btn3")).click();
	  driver.findElement(By.id("Btn4")).click();
	  driver.findElement(By.id("Btn5")).click();
	  driver.findElement(By.id("BtnCalc")).click();
	  Thread.sleep(1000);
	  String addResult = driver.findElement(By.id("input")).getAttribute("value");
	  Assert.assertEquals(addResult, "111111");
	  driver.navigate().refresh();
	  
	  //Subtraction
	  driver.findElement(By.id("Btn2")).click();
	  driver.findElement(By.id("Btn3")).click();
	  driver.findElement(By.id("Btn4")).click();
	  driver.findElement(By.id("Btn8")).click();
	  driver.findElement(By.id("Btn2")).click();
	  driver.findElement(By.id("Btn3")).click();
	  driver.findElement(By.id("BtnMinus")).click();
	  driver.findElement(By.id("BtnMinus")).click();
	  driver.findElement(By.id("Btn2")).click();
	  driver.findElement(By.id("Btn3")).click();
	  driver.findElement(By.id("Btn0")).click();
	  driver.findElement(By.id("Btn9")).click();
	  driver.findElement(By.id("Btn4")).click();
	  driver.findElement(By.id("Btn8")).click();
	  driver.findElement(By.id("Btn2")).click();
	  driver.findElement(By.id("Btn3")).click();
	  driver.findElement(By.id("BtnCalc")).click();
	  Thread.sleep(1000);
	  String subResult = driver.findElement(By.id("input")).getAttribute("value");
	  Assert.assertEquals(subResult, "23329646");

	  driver.quit();

	}
}
