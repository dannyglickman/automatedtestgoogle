package cTest2;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.net.MalformedURLException;

public class Hook {

    public Hook() {
    }

    @Before("@Shopica")
    public void setUpProd() throws MalformedURLException {
        System.out.println("in setUpProd");
        Driver.getInstance().get("http://localhost:8080");
    }

    @After("@Shopica")
    public void tearDownProd(Scenario scenario) {
        System.out.println("Prod tearDown");
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getInstance()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Attach");
        }
        Driver.closeDriver();
    }
}