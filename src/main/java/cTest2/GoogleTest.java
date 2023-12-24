package cTest2;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebElement;

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
        Driver.getInstance().get(GOOGLE_PAGE);
        WebElement googleSearchArea = waitForScreenRefresh(GOOGLE_SEARCH_AREA);
        System.out.println("CheckGoogleSearchArea = " + googleSearchArea);
        googleSearchArea.sendKeys("Danny Glickman");
        WebElement searchButton = waitForScreenRefresh(GOOGLE_SEARCH_BUTTON);
        searchButton.click();
        WebElement firstSearchResult = waitForScreenRefresh(FIRST_SEARCH_RESULT);
        String searchResultText = firstSearchResult.getText();
        if (!searchResultText.equals("Danny Glickman")) {
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
