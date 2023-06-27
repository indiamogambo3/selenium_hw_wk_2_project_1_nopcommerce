package testsuite;

/**
 * 3. Write down the following test into ‘LoginTest’ class
 * 1. userShouldNavigateToLoginPageSuccessfully
 * * click on the ‘Login’ link
 * * Verify the text ‘Welcome, Please Sign
 * In!’
 * 2. userShouldLoginSuccessfullyWithValidCredentials
 * * click on the ‘Login’ link
 * * Enter valid username
 * * Enter valid password
 * * Click on ‘LOGIN’ button
 * * Verify the ‘Log out’ text is display
 * 3. verifyTheErrorMessage
 * * click on the ‘Login’ link
 * * Enter invalid username
 * * Enter invalid password
 * * Click on Login button
 * * Verify the error message ‘Login was unsuccessful.
 * Please correct the errors and try again. No customer account found’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {

        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToLogInPageSuccessfully() {

        //Find Login link and click on Login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //Verify "Welcome, Please Sign In!" text
        String expectedText = "Welcome, Please Sign In!";
        String actualText = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Welcome message does not match", expectedText, actualText);
    }

    @Test
    public void verifyUserShouldLoginSuccessfullyWithValidCredentials() {

        //Find Login link and click on Login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //Find email element and enter valid email in email field
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("scrum1234@gmail.com");
        //Find password element and enter valid password in password field
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("Scrum1234");
        //Find Login button and click on Login button
        WebElement loginButton = driver.findElement(By.xpath("//button [text() = 'Log in']"));
        loginButton.click();
        //Verify 'Log out' text is displayed
        String expectedText = "Log out";
        String actualText = driver.findElement(By.xpath("//a[text() = 'Log out']")).getText();
        Assert.assertEquals("Log out text not displayed correctly", expectedText, actualText);
    }

    @Test
    public void verifyTheErrorMessage(){

        //Find login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //Find email element and enter invalid email in email field
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("mukx123@gma.com");
        //Find password element and enter invalid password in password field
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("Mohhk@12@3");
        //Find Login button and click on Login button
        WebElement loginButton = driver.findElement(By.xpath("//button [text() = 'Log in']"));
        loginButton.click();
        //Verify error message ‘Login was unsuccessful. Please correct the errors and try again. No customer account found’
        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualText = driver.findElement(By.xpath("//div [@class = 'message-error validation-summary-errors']")).getText();
        Assert.assertEquals("Error message not displayed correctly", expectedText, actualText);
    }

    @After
    public void tearDown() {

        closeBrowser();
    }

}
