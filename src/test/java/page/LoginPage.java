package page;

import com.company.baseElement.CustomElementFieldDecorator;
import com.company.baseElement.InputText;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new CustomElementFieldDecorator(driver, driver),this);
    }

    @FindBy(name = "UserName")
    public InputText userName;

    @FindBy(how = How.XPATH,xpath = "//input[contains(@name,'Password')]")
    public WebElement password;



    public void navigateTo(String url) {
        driver.navigate().to(url);

    }

    public void login(){
        userName.setText("admin");
        password.sendKeys("admin");
    }

}
