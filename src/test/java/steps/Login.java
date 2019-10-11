package steps;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page.LoginPage;

public class Login {

    BaseUtil baseUtil;

    LoginPage loginPage;


    public Login(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;
        loginPage = new LoginPage(baseUtil.getWebDriver());
    }

    @When("^input username and password$")
    public void inputUserName() {
        System.out.println("input username and password ");
        loginPage.login();
    }

    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {
        System.out.println("lognin page");

        loginPage.navigateTo("http://www.executeautomation.com/demosite/Login.html");

    }

    @Then("say hello")
    public void sayHello() {
        System.out.println(" helllooooooooo ");
//    throw new RuntimeException(" faillllllllllllllllllllll");
    }
}
