package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    @Before
    public void setUp(){
        openBrowser();
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully()
    {
        //click on the 'Computers' tab
        WebElement linkText = driver.findElement(By.linkText("Computers"));
        linkText.click();

        //Verify the text 'Computers'
        String expectedText = "Computers";
        String actualText = driver.findElement(By.linkText("Computers")).getText();
        Assert.assertEquals("verify the computer text", expectedText, actualText);

    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully()
    {
        // click on the 'Electronics'
        WebElement linkText = driver.findElement(By.linkText("Electronics"));
        linkText.click();

        //Verify the text 'Electronics'
        String expectedText = "Electronics";
        String actualText = driver.findElement(By.linkText("Electronics")).getText();
        Assert.assertEquals("verify the text Electronics", expectedText, actualText);

    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully()
    {
        // click on the 'Apparel' tab
        WebElement linkText = driver.findElement(By.linkText("Apparel"));
        linkText.click();


        //verify the text 'Apparel'
        String expectedText = "Apparel";
        String actualText = driver.findElement(By.linkText("Apparel")).getText();
        Assert.assertEquals("verify the text Apparel", expectedText, actualText);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully()
    {
        // click on the 'Digital downloads' tab
        WebElement linkText = driver.findElement(By.linkText("Digital downloads"));
        linkText.click();

        //Verify the text 'Digital downloads'
        String expectedText = "Digital downloads";
        String actualText = driver.findElement(By.linkText("Digital downloads")).getText();
        Assert.assertEquals("verify the text Digital downloads", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully()
    {
        // click on the ‘Books’ Tab
        WebElement linkText = driver.findElement(By.linkText("Books"));
        linkText.click();

        //Verify the text 'Books'
        String expectedText = "Books";
        String actualText = driver.findElement(By.linkText("Books")).getText();
        Assert.assertEquals("verify the text Books", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully()
    {
        // click on the ‘Jewelry’
        WebElement linkText = driver.findElement(By.linkText("Jewelry"));
        linkText.click();

        //Verify the text 'Jewelry'
        String expectedText = "Jewelry";
        String actualText = driver.findElement(By.linkText("Jewelry")).getText();
        Assert.assertEquals("verify the text Jewelry", expectedText, actualText);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully()
    {
        // click on the ‘Gift Cards’
        WebElement linkText = driver.findElement(By.linkText("Gift Cards"));
        linkText.click();

        //Verify the text 'Gift Cards'
        String expectedText = "Gift Cards";
        String actualText = driver.findElement(By.linkText("Gift Cards")).getText();
        Assert.assertEquals("verify the text Gift Cards", expectedText, actualText);
    }
    @After
    public void close() {
        closeBrowser();
    }
}

