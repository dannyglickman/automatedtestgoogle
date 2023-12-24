package cTest2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static WebDriver driver;

    public static WebDriver getInstance() {

        WebDriverManager.chromedriver().setup();
        if (driver == null) {
            driver = new ChromeDriver();
        }

        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
/*
public class cTest2.Driver {
    public static  WebDriver driver;
    private static String os = System.getProperty("os.name").toLowerCase();


    @SuppressWarnings("deprecation")
    public static WebDriver getInstance() {
        if (driver == null) {

            String browser = Config.getProperty("browser");
            switch (browser) {
                case "firefox":
                    System.out.println("Instantiating the GeckoDriver...");
                    FirefoxBinary firefoxBinary = new FirefoxBinary();
                    firefoxBinary.addCommandLineOptions("--headless");
                    System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.setBinary(firefoxBinary);
                    FirefoxDriver firefoxDriver = new FirefoxDriver(firefoxOptions);
                    driver = firefoxDriver;

//				   System.out.println("Instantiating the GeckoDriver...");
//				   System.setProperty("webdriver.gecko.driver", Config.getProperty("gecko.driver.path"));
//				   driver=new FirefoxDriver();
//


                    break;
                case "chrome":

                    System.setProperty("webdriver.chrome.driver", "C:/exittools/Drivers/chromedriver.exe");
                    ChromeOptions chromeOptions2 = new ChromeOptions();
                    chromeOptions2.addArguments("--headless");

                    driver = new ChromeDriver(chromeOptions2);









                    //				 System.out.println("Bonigarcia test...");
//				  WebDriverManager.chromedriver().setup();
//				  driver = new ChromeDriver();






//				   System.out.println("Instantiating the Chromedriver...");
//				   if(isWindows()) {
//				   System.setProperty("webdriver.chrome.driver",Config.getProperty("chrome.driver.path"));
//				   }else{
//				   System.setProperty("webdriver.chrome.driver",Config.getProperty("chromelinux.driver.path"));
//				   }
//				   driver = new ChromeDriver();
                    break;
                case "ie":
                    System.out.println("Instantiating the Internet Explorer...");
                    System.setProperty("webdriver.iexplorer.driver", Config.getProperty("ie.driver.path"));
                    driver = new InternetExplorerDriver();
                    break;
                case "htmlUnitDriver":
                    driver = new HtmlUnitDriver();
                    break;
                case "headlessChrome":
                    System.out.println("Instantiating the Headless Chrome...");
                    System.setProperty("webdriver.chrome.driver", Config.getProperty("chrome.driver.path"));
                    System.setProperty("https.protocols", "TLSv1,TLSv1.1,TLSv1.2");
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--headless");
                    chromeOptions.addArguments("window-size=1200,1100");
                    DesiredCapabilities caps2 = DesiredCapabilities.chrome();
                    caps2.setPlatform(Platform.ANY);
                    caps2.setCapability(CapabilityType.BROWSER_NAME, "chrome");
                    caps2.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
                    WebDriver headLessDriver = new ChromeDriver(caps2);
                    driver=headLessDriver;
                    break;
                case "chromium":
                    System.out.println("Instantiating the Chromium....");
//				   final ChromeOptions chromeOptions3 = new ChromeOptions();
//				   chromeOptions3.setBinary("/usr/bin/chromium");
//				   chromeOptions3.addArguments("--headless");
//				   final DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
//				   desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions3);
//				   driver = new RemoteWebDriver(desiredCapabilities);

                    final ChromeOptions chromeOptions5 = new ChromeOptions();
                    chromeOptions5.setBinary("/usr/bin/chromium");
                    chromeOptions5.addArguments("--headless");
                    final DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
                    desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions5);
                    driver = new RemoteWebDriver(desiredCapabilities);



                    // final ChromeOptions chromeOptions1 = new ChromeOptions();
                    // String chromeDriverPath="/usr/bin/chromedriver --port=9515";
                    // chromeOptions1.addArguments("--headless");
                    // System.setProperty("webdriver.chrome.driver",chromeDriverPath);
                    // driver=new ChromeDriver();
                    // driver.get("https://www.facebook.com/");
                    // String title=driver.getTitle();
                    // System.out.println(title);
                    // options
                    // final DesiredCapabilities caps = DesiredCapabilities.chrome();
                    // final WebDriver driver = new RemoteWebDriver(new
                    // URL("http://localhost:8080/json"), caps);
                    // driver.get("http://www.google.com");
                    // final ChromeOptions chromeOptions1 = new ChromeOptions();
                    // chromeOptions1.setBinary("/usr/bin/chromium");
                    // chromeOptions1.addArguments("--headless");
                    // chromeOptions1.addArguments("window-size=1200,1100");
                    // DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
                    // desiredCapabilities.setPlatform(Platform.ANY);
                    // desiredCapabilities.setCapability(CapabilityType.BROWSER_NAME, "chromium");
                    // desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions1);
                    // try {
                    // driver=new RemoteWebDriver(new URL
                    // ("http://172.16.25.33:8080/"),desiredCapabilities);
                    // } catch (MalformedURLException e) {

                    // e.printStackTrace();
                    // }
                    break;
            }
        }
        return driver;

    }
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
    public static boolean isWindows() {
        return (os.indexOf("win") >= 0);
    }
    public static boolean isMac() {
        return (os.indexOf("mac") >= 0);
    }
    public static boolean isLinux() {
        return (os.indexOf("nix") >= 0);
    }
}
 */