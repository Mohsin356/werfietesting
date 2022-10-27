// Page URL: https://formy-project.herokuapp.com/form
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject{

    private final String EMAIL = "zk2493174@gmail.com";
    private final String Pass = "12345678";

    @FindBy(id = "emailphone")
    private WebElement email;

    @FindBy(id = "login-password")
    private WebElement loginPassword;

    @FindBy(id = "loginAccount")
    private WebElement login_button;

    @FindBy(xpath = "/html/body/div[1]/header/div/div/div[2]/div/div[1]/div[2]/a/i")
    private WebElement dropdownButton;

    @FindBy(id = "logout_btn")
    private WebElement logOut;


    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(){
        this.email.sendKeys(EMAIL);
    }

    public void enterPassword(){
        this.loginPassword.sendKeys(Pass);
    }

    public void pressLoginButton(){
        this.login_button.click();
    }
    public void pressDropDown(){
        this.dropdownButton.click();
    }
    public void logOutAccount(){
        this.logOut.click();
    }

}
