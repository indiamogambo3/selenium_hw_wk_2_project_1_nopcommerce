package testsuite;

/**
 * 4. Write down the following test into ‘TopMenuTest’ class
 * 1. userShouldNavigateToComputerPageSuccessfully
 * * click on the ‘Computers’ Tab
 * * Verify the text ‘Computers’
 * 2. userShouldNavigateToElectronicsPageSuccessfully
 * * click on the ‘Electronics’ Tab
 * * Verify the text ‘Electronics’
 * 3. userShouldNavigateToApparelPageSuccessfully
 * * click on the ‘Apparel’ Tab
 * * Verify the text ‘Apparel’
 * 4.
 * userShouldNavigateToDigitalDownloadsPageSuccessfully
 * * click on the ‘Digital downloads’ Tab
 * * Verify the text ‘Digital downloads’
 * 5. userShouldNavigateToBooksPageSuccessfully
 * * click on the ‘Books’ Tab
 * * Verify the text ‘Books’
 * 6. userShouldNavigateToJewelryPageSuccessfully
 * * click on the ‘Jewelry’ Tab
 * * Verify the text ‘Jewelry’
 * 7. userShouldNavigateToGiftCardsPageSuccessfully
 * * click on the ‘Gift Cards’ Tab
 * * Verify the text ‘Gift Cards’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {

        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {

        //Find Computers element and click on Computers element
        driver.findElement(By.xpath("//ul[@class = 'top-menu notmobile']//a[text() = 'Computers ']")).click();
        //Verify the text "Computers"
        String expectedText = "Computers";
        String actualText = driver.findElement(By.xpath("//h1[text() = 'Computers']")).getText();
        Assert.assertEquals("Text does not match.", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {

        //Find Electronics element and click on Electronics element
        driver.findElement(By.xpath("//ul[@class = 'top-menu notmobile']//a[text() = 'Electronics ']")).click();
        //Verify the text "Electronics"
        String expectedText = "Electronics";
        String actualText = driver.findElement(By.xpath("//h1[text() = 'Electronics']")).getText();
        Assert.assertEquals("Text does not match.", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {

        //Find Apparel element and click on Apparel element
        driver.findElement(By.xpath("//ul[@class = 'top-menu notmobile']//a[text() = 'Apparel ']")).click();
        //Verify the text "Apparel"
        String expectedText = "Apparel";
        String actualText = driver.findElement(By.xpath("//h1[text() = 'Apparel']")).getText();
        Assert.assertEquals("Text does not match.", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {

        //Find Digital downloads element and click on Digital downloads element
        driver.findElement(By.xpath("//ul[@class = 'top-menu notmobile']//a[text() = 'Digital downloads ']")).click();
        //Verify the text "Digital downloads"
        String expectedText = "Digital downloads";
        String actualText = driver.findElement(By.xpath("//h1[text() = 'Digital downloads']")).getText();
        Assert.assertEquals("Text does not match.", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {

        //Find Books element and click on books element
        driver.findElement(By.xpath("//ul[@class = 'top-menu notmobile']//a[text() = 'Books ']")).click();
        //Verify the text "Books"
        String expectedText = "Books";
        String actualText = driver.findElement(By.xpath("//h1[text() = 'Books']")).getText();
        Assert.assertEquals("Text does not match.", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {

        //Find Jewelery element and click on Jewelery element
        driver.findElement(By.xpath("//ul[@class = 'top-menu notmobile']//a[text() = 'Jewelry ']")).click();
        //Verify the text "Jewelry"
        String expectedText = "Jewelry";
        String actualText = driver.findElement(By.xpath("//h1[text() = 'Jewelry']")).getText();
        Assert.assertEquals("Text does not match.", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToGiftsCardsPageSuccessfully() {

        //Find Gift Cards element and click on Gift Cards element
        driver.findElement(By.xpath("//ul[@class = 'top-menu notmobile']//a[text() = 'Gift Cards ']")).click();
        //Verify the text "Gift Cards"
        String expectedText = "Gift Cards";
        String actualText = driver.findElement(By.xpath("//h1[text() = 'Gift Cards']")).getText();
        Assert.assertEquals("Text does not match.", expectedText, actualText);
    }

    @After
    public void tearDown() {

        closeBrowser();
    }

}
