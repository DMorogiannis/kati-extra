import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailSignInTest{
    @Test
    public void gmailLoginShouldBeSuccessful(){
       //1. Go to Gmail website
        WebDriver driver = new FirefoxDriver();
        driver.get("http://gmail.com");
       // Fill in username
       // FIll in password
       // click sign in
        //verify user did sign in
       // sign out
       // verified user did sign out
    }
}