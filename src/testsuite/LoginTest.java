package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * 1. userShouldNavigateToLoginPageSuccessfully()
 * * click on the ‘Login’ link
 * * Verify the text ‘Welcome, Please Sign
 * In!’
 * 2. userShouldLoginSuccessfullyWithValidCredentials()
 * * click on the ‘Login’ link
 * * Enter a valid username
 * * Enter a valid password
 * * Click on the ‘Login’ button
 * * Verify the ‘Welcome to our store’
 * text is displayed
 * 3. verifyTheErrorMessage()
 * * click on the ‘Login’ link
 * * Enter the invalid username
 * * Enter the invalid password
 * * Click on the ‘Login’ button
 * * Verify the error message ‘Login was unsuccessful.
 * Please correct the errors and try again. No customer account found’
 */

public class LoginTest extends BaseTest {


    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);


    }
    //* 1. userShouldNavigateToLoginPageSuccessfully()

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {

        //Find the login link element and click on login link element
        WebElement loginLink = driver.findElement(By.linkText("Log in"));

        // click on the ‘Login’ link
        loginLink.click();

        //* * Verify the text ‘Welcome, Please Sign
        // * In!
        String expectedText = "Welcome, Please Sign In!";
        WebElement welcomeTextElement = driver.findElement(By.xpath("//h1"));
        String actualText = welcomeTextElement.getText();
        Assert.assertEquals("Not redirected to login page", expectedText, actualText);

    }
@Test
public void userShouldLoginSuccessfullyWithValidCredentials() {
    //* click on the ‘Login’ link
    WebElement loginLink = driver.findElement(By.linkText("Log in"));
    loginLink.click();

    //* Enter a valid username(Email)
    WebElement userName = driver.findElement(By.id("Email"));
    userName.sendKeys("Ram2109@gmail.com");

    //* Enter a valid password
    WebElement password = driver.findElement(By.name("Password"));
    password.sendKeys("123456");

    //* Click on the ‘Login’ button
    driver.findElement(By.xpath("//input[@value = 'Log in']")).click();

    //* Verify the ‘Welcome to our store’
    String expectedResult = "Welcome to our store";
    WebElement welComeTextMessage= driver.findElement(By.xpath("//div[@class = 'topic-html-content-title']"));
    String actualText = welComeTextMessage.getText();
    Assert.assertEquals("Not redirected to login page", expectedResult, actualText);



}
@Test
public void verifyTheErrorMessage(){
        //* click on the ‘Login’ link
    driver.findElement(By.linkText("Log in")).click();
    //* Enter the invalid username
    driver.findElement(By.id("Email")).sendKeys("Ram210@gmail.com");

    //* Enter the invalid password
    driver.findElement(By.name("Password")).sendKeys("123478");

    //* click on login
    driver.findElement(By.xpath("//input[@value = 'Log in']")).click();

    //* * Verify the error message ‘Login was unsuccessful.
    // * Please correct the errors and try again. No customer account found’
    String expectedResult="Login was unsuccessful. Please correct the errors and try again.\n" +
            "No customer account found";
    WebElement errorTextMessage= driver.findElement(By.xpath("//div[@class ='message-error']"));
    String actualText=errorTextMessage.getText();
    Assert.assertEquals("Not redirected to login page",expectedResult,actualText);

}

@After
public void tearDown(){
        closeBrowser();
}










    }




