package steps;

import base.BaseUtil;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks {

    private BaseUtil baseUtil;

    public Hooks(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;
    }

    @Before
    public void init(){
        enableChrome();
//        enableFireFox();
    }

    private void enableFireFox() {
        FirefoxDriverManager.firefoxdriver().setup();
        baseUtil.setWebDriver(new FirefoxDriver());
    }

    private void enableChrome() {
        ChromeDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
//        options.setHeadless(true);
        baseUtil.setWebDriver(new ChromeDriver(options));
    }


    @After
    public void tearDown(Scenario scenario){
    baseUtil.getWebDriver().close();

    }
}
