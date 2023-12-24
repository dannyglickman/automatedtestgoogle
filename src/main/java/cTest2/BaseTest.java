package cTest2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Date;

public class BaseTest {

    public WebElement findWebElementByXpath (String xpath) {
        WebElement webElement = Driver.getInstance().findElement(By.xpath(xpath));
        return webElement;
    }

    public WebElement findWebElementByName(String name) {
        WebElement webElement = Driver.getInstance().findElement(By.name(name));
        return webElement;
    }

    public WebElement findWebElementById(String id) {
        WebElement webElement = Driver.getInstance().findElement(By.id(id));
        return webElement;
    }

    public static WebElement waitForScreenRefresh (String xpath, long sleepTime, long msToWait) throws ScreenRefreshTimeoutException { //method declaration, long is a huge int (can to into the billions+), make our own execption class
        WebElement webElement = null;
        Date start = new Date(); //whenever you make a new Date object, it always has the current date and time, accurate to ms
        while (webElement == null) { //as long as variable equals (==) no, it will continue looping;
            //waiting for screen to refresh
            try {
                webElement = Driver.getInstance().findElement(By.xpath(xpath));
            } catch (Exception e){
                //element is not found
            }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
                throw new ScreenRefreshTimeoutException();
            }
            if (new Date().getTime()-start.getTime() > msToWait) { //Boolean expressions are true/false. Greater than returns boolean.
                throw new ScreenRefreshTimeoutException();
            }
        }
        System.out.println("webElement = "+ webElement);
        return webElement;
    }

    public static WebElement waitForScreenRefresh (String xpath, String textValue, boolean exists, long sleepTime, long msToWait) throws ScreenRefreshTimeoutException { //method declaration, long is a huge int (can to into the billions+), make our own execption class
        WebElement webElement = null;
        Date start = new Date(); //whenever you make a new Date object, it always has the current date and time, accurate to ms
        while ((webElement == null) || (
                exists ? !webElement.getText().equals(textValue): webElement.getText().equals(textValue)
        )) { //as long as variable equals (==) no, it will continue looping;
            //waiting for screen to refresh
            try {
                webElement = Driver.getInstance().findElement(By.xpath(xpath));
            } catch (Exception e){
                //element is not found
            }
            if ((webElement == null) || (
                    exists ? !webElement.getText().equals(textValue): webElement.getText().equals(textValue))) {
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    throw new ScreenRefreshTimeoutException();
                }
                if (new Date().getTime() - start.getTime() > msToWait) { //Boolean expressions are true/false. Greater than returns boolean.
                    throw new ScreenRefreshTimeoutException();
                }
            }
        }
        return webElement;
    }

    //use the below to call the other method with a hard coded value for sleepTime
    public static WebElement waitForScreenRefresh (String xpath) throws ScreenRefreshTimeoutException { //overload is two methods with the same name but different parameters
        WebElement webElement = waitForScreenRefresh(xpath, 1000, 10000); // this is another type of method call. can use the other method if we need to change the sleepTime length
        System.out.println("webElement = "+ webElement);
        return webElement;
    }
    public static WebElement waitForScreenRefresh (String xpath, String textValue) throws ScreenRefreshTimeoutException {
        return waitForScreenRefresh(xpath, textValue, true, 1000, 10000);
    }
    public static WebElement waitForScreenRefresh (String xpath, String textValue, boolean exists) throws ScreenRefreshTimeoutException {
        return waitForScreenRefresh(xpath, textValue, exists, 1000, 10000);
    }
    public static WebElement waitForScreenRefresh (String xpath, String textValue, long msToWait) throws ScreenRefreshTimeoutException {
        return waitForScreenRefresh(xpath, textValue, true, 1000, msToWait);
    }
}
