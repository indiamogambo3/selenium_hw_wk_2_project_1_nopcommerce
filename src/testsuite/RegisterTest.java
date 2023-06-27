package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * 5. Write down the following test into ‘RegisterTest’
 * class
 * 1. userShouldNavigateToRegisterPageSuccessfully
 * * click on the ‘Register’ link
 * * Verify the text ‘Register’
 * 2. userSholdRegisterAccountSuccessfully
 * * click on the ‘Register’ link
 * * Select gender radio button
 * * Enter First name
 * * Enter Last name
 * * Select Day Month and Year
 * * Enter Email address
 * * Enter Password
 * * Enter Confirm password
 * * Click on REGISTER button
 * * Verify the text 'Your registration completed’
 */

public class RegisterTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setupUrl() {

        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {

        //Find Register element and click on Register element
        driver.findElement(By.linkText("Register")).click();
        //Verify the text "Register"
        String expectedText = "Register";
        String actualText = driver.findElement(By.xpath("//h1[text() = 'Register']")).getText();
        Assert.assertEquals("Text does not match.", expectedText, actualText);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {

        //Find Register element and click on Register element
        driver.findElement(By.linkText("Register")).click();
        //Find 'Male' radio button element and select 'Male' Gender radio button
        driver.findElement(By.id("gender-male")).click();
        //Find 'First name' element and enter valid first name in 'First name' field
        driver.findElement(By.id("FirstName")).sendKeys("Mukesh");
        //Find 'Last name' element and enter valid last name in 'Last name' field
        driver.findElement(By.id("LastName")).sendKeys("Shah");
        //Find 'Day' element in Date of birth and enter valid day in 'Day' field
        driver.findElement(By.xpath("//select[@name = 'DateOfBirthDay']")).sendKeys("10");
        //Find 'Month' element in Date of birth and enter valid month in 'Month' field
        driver.findElement(By.xpath("//select[@name = 'DateOfBirthMonth']")).sendKeys("March");
        //Find 'Year' element in Date of birth and enter valid year in 'Year' field
        driver.findElement(By.xpath("//select[@name = 'DateOfBirthYear']")).sendKeys("1980");
        //Find 'Email' element and enter valid email in 'Email' field
        driver.findElement(By.id("Email")).sendKeys("scrum1234@gmail.com");
        //Find 'Password' element and enter valid password in 'Password' field
        driver.findElement(By.id("Password")).sendKeys("Scrum1234");
        //Find 'Confirm password' element and enter valid confirm password in 'Confirm password' field
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Scrum1234");
        //Find 'REGISTER' button element and click on 'REGISTER' button
        driver.findElement(By.name("register-button")).click();
        //Verify the text 'Your registration completed'
        String expectedText = "Your registration completed";
        String actualText = driver.findElement(By.xpath("//div[@class = 'result']")).getText();
        Assert.assertEquals("Your registartion completed message not correct", expectedText, actualText);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
