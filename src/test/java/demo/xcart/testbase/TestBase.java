package demo.xcart.testbase;

import demo.xcart.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {
    String browser = "chrome";

    @BeforeMethod (groups = {"sanity","smoke", "regression"})
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod (groups ={"sanity","smoke","regression"})
    public void tearDown(){
        closeBrowser();
    }

}
