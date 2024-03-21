package example.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import example.example.factory.PageinstancesFactory;
import example.example.pages.FacebookLoginPage;

/**
 * The Class FaceBookLoginTest.
 *
 * @author Bharathish
 */
@Test(testName = "Facebook login test", description = "Facebook login test")
public class FaceBookLoginTest extends BaseTest {

//	@Test
//	public void facebookLoginTest() {
//		driver.get("https://www.facebook.com/");
//		FacebookLoginPage facebookLoginPage = PageinstancesFactory.getInstance(FacebookLoginPage.class);
//		facebookLoginPage.enterEmail("abc").enterPassword("abc").clickSignIn();
//		Assert.assertFalse(true, "Login failed : Test failed");
//	}

	@Test
	public void test1(){
		driver.get("https://www.google.com/");
		WebElement webElement=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		webElement.sendKeys("Durga Prasad");
		webElement.submit();
		System.out.println("iam here");
	}

	@Test
	public void test3(){
		driver.get("https://www.google.com/");
		WebElement webElement=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		webElement.sendKeys("Durga Prasad");
		webElement.submit();
		System.out.println("iam here");

	}

	@Test
	public void test2(){
		driver.get("https://www.google.com/");
		WebElement webElement=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		webElement.sendKeys("Durga Prasad");
		webElement.submit();

		System.out.println("iam here");

	}
}
