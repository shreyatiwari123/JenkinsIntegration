package PagesAccount;

import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class AccountBase {

    WebDriver driver;
    String url = "https://parabank.parasoft.com/parabank/index.htm";
    String userName = "jhon";
    String password = "demo";
    Scenario scenario;
}
