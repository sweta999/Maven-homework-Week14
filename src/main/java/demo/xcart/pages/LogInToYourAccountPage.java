package demo.xcart.pages;

import demo.xcart.utility.Utility;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class LogInToYourAccountPage extends Utility {

    By verifyTextLogInToYourAccount = By.xpath("//h3[contains(text(),'Log in to your account')]");
    By enterEmailAddress = By.xpath("//input[@id='email']");
    By clickOnContinueButton = By.xpath("//span[contains(text(),'Continue')]");
    By verifyTextSecureCheckout = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]");



    public String getTextLogInToYourAccount() {
        Reporter.log("Verify the Text, Log in to your account" + verifyTextLogInToYourAccount.toString() + "<br>");
        return getTextFromElement(verifyTextLogInToYourAccount);
    }

    public void getEmailAddress() {
        Reporter.log("Enter Email Address" + enterEmailAddress.toString() + "<br>");
        sendTextToElement(enterEmailAddress,"nimmo@gmail.com");
    }
    /* public void setEnterEmailAddress() {
         String sendkey = RandomStringUtils.random(3)+"@gmail.com";
    }*/

    public void setClickOnContinueButton() {
        Reporter.log("Click on Continue Button" + clickOnContinueButton.toString() + "<br>");
        clickOnElement(clickOnContinueButton);
    }

    public String getTextSecureCheckout() {
        Reporter.log("Verify the Text, Secure Checkout" + verifyTextSecureCheckout.toString() + "<br>");
        return getTextFromElement(verifyTextSecureCheckout);
    }

}
