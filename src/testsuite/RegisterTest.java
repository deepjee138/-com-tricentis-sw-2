package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {

    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);


    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {

        //click on the ‘Register’ link
        driver.findElement(By.className("ico-register")).click();

        //Verify the text ‘Register’
        String expectedResult = "Register";
        WebElement title = driver.findElement(By.xpath("//div[@class = 'page-title']"));
        String actualResult = title.getText();
        Assert.assertEquals("message not display", expectedResult, actualResult);

    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //* click on the ‘Register’ link
        driver.findElement(By.className("ico-register")).click();
        //* Select the gender radio button
        driver.findElement(By.name("Gender")).click();
        //* Enter the First name
        driver.findElement(By.id("FirstName")).sendKeys("Ram");
        //** Enter the Last name
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        //* Enter the email
        driver.findElement(By.id("Email")).sendKeys("Ram2109@gmail.com");
        //* Enter Password
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("123456");
        //Enter Confirm password
        driver.findElement(By.name("ConfirmPassword")).sendKeys("123456");
        // Click on the ‘Register’ button
        driver.findElement(By.id("register-button")).click();
        //verifyText The specified email already exists
        String expectedResult = "The specified email already exists";
        WebElement title = driver.findElement(By.xpath("//div[@class = 'validation-summary-errors']"));
        String actualResult = title.getText();
        Assert.assertEquals("Not redirected to login page", expectedResult, actualResult);


    }

@After
    public void tearDown() {
         closeBrowser();
    }

}
