package cTest2;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.net.MalformedURLException;

public class Hook {

    public Hook() {
    }

    @Before("@Shopica")
    public void setUpProd() throws MalformedURLException {
        System.out.println("in setUpProd");
        Driver.getInstance().get("http://www.google.com");
    }

    @After("@Shopica")
    public void tearDownProd(Scenario scenario) {
        System.out.println("Prod tearDown");
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getInstance()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
        Driver.closeDriver();
    }
}