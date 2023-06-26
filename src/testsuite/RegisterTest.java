package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser();
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        // Click on the Register Link
        WebElement Register = driver.findElement(By.xpath("//a[@class='ico-register']"));
        Register.click();

        //Verify the text ‘Register’
        String expectedText = "Register";
        String actualText = driver.findElement(By.linkText("Register")).getText();
        Assert.assertEquals("verify the text Register", expectedText, actualText);

    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        // Click on the Register Link
        WebElement Register = driver.findElement(By.xpath("//a[@class='ico-register']"));
        Register.click();
        // Click on Gender radio button
        driver.findElement(By.xpath("//input[@id='gender-female']")).click();
        // Enter First Name
        driver.findElement(By.xpath("//input[@id= 'FirstName']")).sendKeys("khushi");
        //Enter Last Name
        driver.findElement(By.xpath("//input[@id= 'LastName']")).sendKeys("pandey");
        // Click on day
        driver.findElement(By.xpath("//select[@name = 'DateOfBirthDay']//option[@value= '22']")).click();
        // Click on Month
        driver.findElement(By.xpath("//select[@name = 'DateOfBirthMonth']//option[@value= '11']")).click();
        // Click on year
        driver.findElement(By.xpath("//select[@name = 'DateOfBirthYear']//option[@value= '1991']")).click();
        // Enter Email
        driver.findElement(By.xpath("//input[@id= 'Email']")).sendKeys("khushi123@gmail.com");
        // Enter Password
        driver.findElement(By.xpath("//input[@name= 'Password']")).sendKeys("khushi123");
        // Enter confirm Password
        driver.findElement(By.xpath("//input[@name= 'ConfirmPassword']")).sendKeys("khushi123");
        // Click on Register button
        driver.findElement(By.xpath("//button[@name= 'register-button']")).click();
        //Verify the text 'Your registration completed’
        String expectedText = "Your registration completed";
        String actualText = driver.findElement(By.xpath("//div[text()= 'Your registration completed']")).getText();
        Assert.assertEquals("Enter message not displayed", expectedText, actualText);

    }

    @After
    public void close() {
        closeBrowser();
    }
}

