package stepdefs;

import io.cucumber.java.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class StepDefs {

    WebDriver driver;
    String url = "https://parabank.parasoft.com/parabank/index.htm";
    String userName = "jhon";
    String password = "demo";
    Scenario scenario;


    @Before //native dependency injection in cucumber
    public void setUp(Scenario scenario) {
        this.scenario = scenario;
        scenario.log("executed before step");
        driver = new ChromeDriver();
        driver.manage().window().maximize();//maximize browser window
        driver.manage().deleteAllCookies();//delete all cookies
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void cleanUp(Scenario scenario) {
        if (!(driver==null)) {
            driver.quit();
        }
        scenario.log("executed after step");
    }

    @BeforeStep
    public void beforeEachStep(){
        scenario.log("executed before each step");
    }
    @AfterStep
    public void afterEachStep(){
        if (scenario.isFailed()){
            if (!(driver==null)){
                TakesScreenshot scrnShot = (TakesScreenshot) driver;
                byte[] data = scrnShot.getScreenshotAs(OutputType.BYTES);
                scenario.attach(data,"image/png","Failed Step Name: " + scenario.getName());
            }
        }
       // scenario.log("executed after each step");
    }


            @Given("User opened the browser")
            public void User_opened_the_browser()
            {
                driver.get(url);

            }

            @And("User clicked on link {string}")
            public void User_clicked_on_link(String linkName){
            driver.findElement(By.linkText(linkName)).click();
            }

    @And("User navigated to the application url")
            public void user_navigated_to_the_application_url(){
                driver.get(url);
            }

            @When("User enter username as {string} and password as {string} and click on login button")
            public void user_enter_username_as_and_password_as_and_click_on_login_button(String userName, String password) {
            driver.findElement(By.name("username")).sendKeys(userName);
            driver.findElement(By.name("password")).sendKeys(password);
            driver.findElement(By.xpath("//input[@value='Log In']")).click();

    }
            @Then("User is able to login in the application")
            public void user_is_able_to_login_in_the_application(){
                Assert.assertEquals("Parabank | Accounts Overview",driver.getTitle());
                boolean actualTableDisplayed = driver.findElement(By.id("accountTable")).isDisplayed();
                Assert.assertEquals(true, actualTableDisplayed);

            }

            @Given("User is Logged in")
            public void User_is_Logged_in(){
            //open
                   User_opened_the_browser();
            //navigate
                    user_navigated_to_the_application_url();
            //login
                user_enter_username_as_and_password_as_and_click_on_login_button(userName,password);
            }

            @When("User select account as {string} and account number as {string}")
            public void User_select_account_as_and_account_number_as(String type, String accNumber) {
                WebElement dropDownAccType = driver.findElement(By.id("type"));
                Select selectAccType = new Select(dropDownAccType);
                selectAccType.selectByVisibleText(type);

                WebElement dropDownAccNumber = driver.findElement(By.id("fromAccountId"));
                Select selectAccNumber = new Select(dropDownAccNumber);
                selectAccNumber.selectByVisibleText(accNumber);

            }
          @When("User select account as {string} and any account number")
          public void User_select_account_as_and_any_account_number(String type) {
              WebElement dropDownAccType = driver.findElement(By.id("type"));
              Select selectAccType = new Select(dropDownAccType);
              selectAccType.selectByVisibleText(type);

              WebElement dropDownAccNumber = driver.findElement(By.id("fromAccountId"));
              Select selectAccNumber = new Select(dropDownAccNumber);
              selectAccNumber.selectByIndex(0);
          }

        @When("User click on Button Open New Account")
                public void User_click_on_Button_Open_New_Account() throws InterruptedException {
                Thread.sleep(5000);
                driver.findElement(By.xpath("//input[@value='Open New Account']")).click();
                }

                @Then("Account Openned Massage is Displayed")
                public void Account_Openned_Massage_is_Displayed(){
                WebElement element = driver.findElement(By.xpath("//h1[text()='Account Opened!']"));
                Assert.assertEquals(element.isDisplayed(),true,"Account Success Message");
                }

                @Then("a new account number is generated")
                public void a_new_account_number_is_generated(){
                WebElement element = driver.findElement(By.id("newAccountId"));
                String accountNumber = element.getText();
                Assert.assertEquals(element.isDisplayed(),true,"New Account Number Link");
               scenario.log("New Account Number is Generated as: " + accountNumber);
                }


}
//Extend report
//logging
//lombook
//parellel execution


