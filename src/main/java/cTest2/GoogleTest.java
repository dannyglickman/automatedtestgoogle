package cTest2;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebElement;

import cTest2.services.RefresherService;

public class GoogleTest extends BaseTest implements XpathDirectory{
    /*
    @When("^go to google$")
    public void go_to_google() throws Throwable {
        cTest2.Driver.getInstance().get(GOOGLE_PAGE);
        WebElement googleSearchArea = waitForScreenRefresh(GOOGLE_PAGE);
        System.out.println("CheckGoogleSearchArea = " + googleSearchArea);
        googleSearchArea.sendKeys("Danny Glickman");
        WebElement searchButton = waitForScreenRefresh(GOOGLE_SEARCH_BUTTON);
        searchButton.click();
    }

     */
    @Given("^go to google$")
    public void go_to_google() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Driver.getInstance().get("http://localhost:8080");
        WebElement dataWebElement = waitForScreenRefresh("/html/body/pre");
        String dataText = dataWebElement.getText();
        RefresherService refresherService = new RefresherService();
        int dataInt = refresherService.getData();
        if (!dataText.equals(""+dataInt)) {
        	System.out.println("hello");
        	//assert (false);
        	throw new Exception();
        }
        System.out.println("space");
    }

    public GoogleTest() {
        System.out.println("aaa");
    }
}
