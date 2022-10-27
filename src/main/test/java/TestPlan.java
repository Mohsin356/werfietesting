import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class TestPlan {
     private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
//        System.setProperty("webdriver.chrome.driver","C://Users//shahzad.hussain//IdeaProjects//seleniumJars and drivers//drivers//chromedriver/chromedriver.exe");

    }

    @Test(testName = "Login-Account")
    public static void loginAccount(){
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        driver.manage().window().maximize();
        webForm.enterEmail();
        webForm.enterPassword();
        webForm.pressLoginButton();
        webForm.pressDropDown();
        webForm.logOutAccount();
    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}