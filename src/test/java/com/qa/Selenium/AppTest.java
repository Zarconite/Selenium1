package com.qa.Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.*;

import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest 
{
	
	WebElement element;
	WebDriver driver;
	
	@Before
	public void setup() {
    	System.setProperty("webdriver.chrome.driver","C:\\Data\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
	}
	
	@Ignore
	@Test
    public void openGoogleAndSearch() throws InterruptedException{
		driver.get("http://www.google.com");
        WebElement input = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
        input.click();
        input.sendKeys("facepunch forum" + Keys.RETURN);
        WebElement link = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3"));
        link.click();
        WebElement header = driver.findElement(By.xpath("//*[@id=\"forum\"]/div[1]/div/ul/li[1]/div[1]/a"));
        String headerText = header.getAttribute("innerText");
        assertEquals("Should be Facepunch Forums", "Facepunch Forums", headerText);
        Thread.sleep(3000);
    }
	
	@Ignore
	@Test
    public void openDemoSite() throws InterruptedException{
		driver.get("http://www.thedemosite.co.uk");
		WebElement createUserLink = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
		createUserLink.click();
		WebElement userName = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		userName.click();
		userName.sendKeys("Akshually");
		WebElement passWord = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		passWord.click();
		passWord.sendKeys("Bish");
		WebElement saveButton = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
		saveButton.click();
		WebElement loginLink = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
		loginLink.click();
		WebElement userNameLogin = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
		userNameLogin.click();
		userNameLogin.sendKeys("Akshually");
		WebElement passWordLogin = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
		passWordLogin.click();
		passWordLogin.sendKeys("Bish");
		WebElement loginButton = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
		loginButton.click();
		WebElement result = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
		String resultText = result.getAttribute("innerText");
		assertEquals("Should be successful", "**Successful Login**", resultText);
    }
	
	@Test
    public void openAutomationPractice() throws InterruptedException{
		driver.get("http://www.automationpractice.com/index.php");
		WebElement selectSearchBox = driver.findElement(By.id("search_query_top"));
		selectSearchBox.click();
		selectSearchBox.sendKeys("Yellow summer dress" + Keys.RETURN);
		Thread.sleep(1000);
		WebElement dress1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
		Actions build = new Actions(driver);
		build.moveToElement(dress1, 85, 0).click().build().perform();
		WebElement dress1SizeDropDown = driver.findElement(By.xpath("//*[@id=\"group_1\"]"));
		dress1SizeDropDown.click();
		dress1SizeDropDown.sendKeys("m" + Keys.RETURN);
		Thread.sleep(1000);
		WebElement dress1Basket = driver.findElement(By.xpath("//*[@id=\'add_to_cart\']/button"));
		dress1Basket.click();
		Thread.sleep(2000);
		WebElement dress1ContinueShopping = driver.findElement(By.xpath("//*[@id=\'layer_cart\']/div[1]/div[2]/div[4]/span"));
		dress1ContinueShopping.click();
		Thread.sleep(1000);
		WebElement reSearch = driver.findElement(By.id("search_query_top"));
		reSearch.click();
		reSearch.sendKeys(Keys.RETURN);
		
		WebElement dress2 = driver.findElement(By.xpath("//*[@id=\'center_column\']/ul/li[2]/div/div[1]/div/a[1]/img"));
		Actions build2 = new Actions(driver);
		build2.moveToElement(dress2, 85, 0).click().build().perform();
		Thread.sleep(1000);
		WebElement dress2SizeDropDown = driver.findElement(By.xpath("//*[@id=\'group_1\']"));
		dress2SizeDropDown.click();
		dress2SizeDropDown.sendKeys("m" + Keys.RETURN);
		Thread.sleep(600);
		WebElement dress2Basket = driver.findElement(By.xpath("//*[@id=\'add_to_cart\']/button"));
		dress2Basket.click();
		Thread.sleep(1500);
		WebElement dress2ContinueShopping = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span"));
		dress2ContinueShopping.click();
		Thread.sleep(500);
		WebElement reSearch2 = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
		reSearch2.click();
		reSearch2.sendKeys(Keys.RETURN);
		Thread.sleep(200);
		
		
		WebElement dress3 = driver.findElement(By.xpath("//*[@id=\'center_column\']/ul/li[3]/div/div[1]/div/a[1]/img"));
		Actions build3 = new Actions(driver);
		build3.moveToElement(dress3, 85, 0).click().build().perform();
		Thread.sleep(300);
		WebElement dress3SizeDropDown = driver.findElement(By.xpath("//*[@id=\'group_1\']"));
		dress3SizeDropDown.click();
		dress3SizeDropDown.sendKeys("m" + Keys.RETURN);
		Thread.sleep(200);
		WebElement dress3Basket = driver.findElement(By.xpath("//*[@id=\'add_to_cart\']/button"));
		dress3Basket.click();
		Thread.sleep(1000);
		WebElement dress3FinishShopping = driver.findElement(By.xpath("//*[@id=\'layer_cart\']/div[1]/div[2]/div[4]/a"));
		dress3FinishShopping.click();
		
		WebElement proceedToCheckout = driver.findElement(By.xpath("//*[@id=\'center_column\']/p[2]/a[1]"));
		proceedToCheckout.click();
		WebElement emailInput = driver.findElement(By.xpath("//*[@id=\'email\']"));
		emailInput.click();
		emailInput.sendKeys("blitzation@googlemail.com");
		WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\'passwd\']"));
		passwordInput.click();
		passwordInput.sendKeys("Akshually");
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\'SubmitLogin\']"));
		loginButton.click();
		Thread.sleep(1000);
		WebElement proceedToShipping = driver.findElement(By.xpath("//*[@id=\'center_column\']/form/p/button"));
		proceedToShipping.click();
		Thread.sleep(1000);
		WebElement agreeCheckBox = driver.findElement(By.xpath("//*[@id=\'cgv\']"));
		agreeCheckBox.click();
		Thread.sleep(1000);
		WebElement proceedToPayment = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button"));
		proceedToPayment.click();
		Thread.sleep(1000);
		WebElement payByCard = driver.findElement(By.xpath("//*[@id=\'HOOK_PAYMENT\']/div[1]/div/p/a"));
		payByCard.click();
		Thread.sleep(1000);
		WebElement confirmOrder = driver.findElement(By.xpath("//*[@id=\'cart_navigation\']/button"));
		confirmOrder.click();
		Thread.sleep(1000);
		
		WebElement price = driver.findElement(By.xpath("//*[@id=\'center_column\']/div/span/strong"));
		String priceString = price.getAttribute("innerText");
		assertEquals("Should be successful", "$77.88", priceString);
		
		WebElement logOut = driver.findElement(By.xpath("//*[@id=\'header\']/div[2]/div/div/nav/div[2]/a"));
		logOut.click();
		Thread.sleep(2500);
	}
	
	@After
	public void end() {
		driver.quit();
	}


	
    //public void testApp()
    //{
    //    assertTrue( true );
    //}
}
