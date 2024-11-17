package testsuite;
/**
 * 1. userShouldNavigateToComputerPageSuccessfully()
 * * click on the ‘COMPUTERS’ Tab
 * * Verify the text ‘Computers’
 * 2. userShouldNavigateToElectronicsPageSuccessfully()
 * * click on the ‘ELECTRONICS’ Tab
 * * Verify the text ‘Electronics’
 * 3. userShouldNavigateToApparelAndShoesPage
 * Successfully()
 * * click on the ‘APPAREL & SHOES’ Tab
 * * Verify the text ‘Apparel & Shoes’
 * 4.
 * userShouldNavigateToDigitalDownloadsPageSuccessfully()
 * * click on the ‘DIGITAL DOWNLOADS’ Tab
 * * Verify the text ‘Digital downloads’
 * 5. userShouldNavigateToBooksPageSuccessfully()
 * * click on the ‘BOOKS’ Tab
 * * Verify the text ‘Books’
 * 6. userShouldNavigateToJewelryPageSuccessfully()
 * * click on the ‘JEWELRY’ Tab
 * * Verify the text ‘Jewelry’
 * 7. userShouldNavigateToGiftCardsPageSuccessfully()
 * * click on the ‘GIFT CARDS’ Tab
 * * Verify the text ‘Gift Cards’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);


    }
    @Test

//userShouldNavigateToComputerPageSuccessfully()
    public void userShouldNavigateToComputerPageSuccessfully(){
        //* click on the ‘COMPUTERS’ Tab
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[@class='top-menu']/li[2]/a")).click();

        //* Verify the text ‘Computers’
       String expectedResult="Computers";
        WebElement title=driver.findElement(By.xpath("//div[@class = 'page-title']"));
        String actualText=title.getText();
        Assert.assertEquals("Not redirected to login page",expectedResult,actualText);

    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //click on the ‘ELECTRONICS’ Tab
      driver.findElement(By.xpath("//div[@class='header-menu']/ul[@class='top-menu']/li[3]/a")).click();

//        //* Verify the text ‘Electronics’
        String expectedResult="Electronics";
        WebElement title=driver.findElement(By.xpath("//div[@class = 'page-title']"));
        String actualResult=title.getText();
       Assert.assertEquals("does not show in display",expectedResult,actualResult);


    }
    @Test
    public void userShouldNavigateToApparelAndShoesPageSuccessfully(){
        //* click on the ‘APPAREL & SHOES’ Tab
      driver.findElement(By.xpath("//div[@class='header-menu']/ul[@class='top-menu']/li[4]/a")).click();

        //Verify the text ‘Apparel & Sh’
        String expectedResult="Apparel & Shoes";
        WebElement title=driver.findElement(By.xpath("//div[@class = 'page-title']"));
        String actualResult=title.getText();
        Assert.assertEquals("text on the display",expectedResult,actualResult);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        // click on the ‘DIGITAL DOWNLOADS’ Tab
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[@class='top-menu']/li[5]/a")).click();

        //* Verify the text ‘Books’
        String expectedResult="Digital downloads";
        WebElement title=driver.findElement(By.xpath("//div[@class = 'page-title']"));
        String actualResult=title.getText();
        Assert.assertEquals("Not redirected to login page",expectedResult,actualResult);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //* click on the ‘JEWELRY’ Tab
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[@class='top-menu']/li[6]/a")).click();

        //* Verify the text ‘Jewelry’
        String expectedResult="Jewelry";
        WebElement title=driver.findElement(By.xpath("//div[@class = 'page-title']"));
        String actualResult=title.getText();
        Assert.assertEquals("Not redirected to login page",expectedResult,actualResult);


    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        // click on the ‘GIFT CARDS’ Tab
       driver.findElement(By.xpath("//div[@class='header-menu']/ul[@class='top-menu']/li[7]/a")).click();

        //Verify the text ‘Gift Cards’
        String expectedResult="Gift Cards";
        WebElement title=driver.findElement(By.xpath("//div[@class = 'page-title']"));
        String actualResult=title.getText();
        Assert.assertEquals("text not shows", expectedResult, actualResult);

    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){

        // click on book
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[@class='top-menu']/li[1]/a")).click();
        //
        //Verify the text ‘Books’
        String expectedResult="Books";
        WebElement title=driver.findElement(By.xpath("//div[@class = 'page-title']"));
        String actualResult=title.getText();
        Assert.assertEquals("text not shows", expectedResult, actualResult);

    }
    @After
    public void tearDown(){
         closeBrowser();
    }


}
