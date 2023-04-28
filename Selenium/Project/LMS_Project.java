import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LMS_Project {
        // Declare the WebDriver object
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        // Set up the Firefox driver
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NuLL");
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void ValidatedTitle() {
        // Check the title of the page
        String title = driver.getTitle();

        //Print the title of the page
        System.out.println("Page title is: " + title);

        //Assertion for page title
        Assert.assertEquals("Alchemy LMS – An LMS Application", title);
    }
    @Test
    public void Validatedheader() {
        // Check the title of the page
        WebElement headingLOC = driver.findElement(By.xpath("//h1[contains(text(),'Learn from Industry Experts')]"));
        String heading = headingLOC.getText();
        //Print the title of the page
        System.out.println("Page heading is: " + heading);

        //Assertion for page title
        Assert.assertEquals("Learn from Industry Experts", heading);
    }
    @Test
    public void ValidateTitleofFirstbox() {
        // Check the title of the page
        WebElement headingLOC = driver.findElement(By.xpath("(//h3[@class='uagb-ifb-title'])[1]"));

        String heading = headingLOC.getText();
        //Print the title of the page
        System.out.println("Page heading is: " + heading);

        //Assertion for page title
        Assert.assertEquals("Actionable Training", heading);
    }
    @Test
    public void ValidateTitleofSecondcourse() {
        // Check the title of the page
        WebElement headingLOC = driver.findElement(By.xpath("(//h3[@class='entry-title'])[2]"));

        String heading = headingLOC.getText();
        //Print the title of the page
        System.out.println("Page Second course text is: " + heading);

        //Assertion for page title
        Assert.assertEquals("Email Marketing Strategies", heading);
    }
    @Test
    public void ValidateAccount() {

        // Check the title of the page
        WebElement headingLOC = driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
        
        WebElement accountLOC = driver.findElement(By.className("uagb-ifb-title"));
        String heading = accountLOC.getText();
        //Print the title of the page
        System.out.println("Account Page text is: " + heading);

        //Assertion for page title
        Assert.assertEquals("Account", heading);
    }




    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}


