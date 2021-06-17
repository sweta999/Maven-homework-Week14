package demo.xcart.pages;

import demo.xcart.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class SecureCheckoutPage extends Utility {

    By enterFirstname = By.xpath("//input[@id='shippingaddress-firstname']");
    By enterLastname = By.xpath("//input[@id='shippingaddress-lastname']");
    By enterAddress = By.xpath("//input[@id='shippingaddress-street']");
    By enterState = By.xpath("//input[@id='shippingaddress-custom-state']");
    By selectDeliverMethodToLocalShipping = By.xpath("//span[contains(text(),'Local shipping')]");
    By selectPaymentMethodCOD = By.xpath("//div[@class='radio']/label/input[@id='pmethod6']");
    By verifyTotal$37cent03 = By.xpath("//div[@class='total clearfix']/span/span");//div[@class='total clearfix']/span/span[1]/span OR //body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/span[2]/span[1]/span[1]
    By clickOnPlaceOrderButton = By.xpath("//span[contains(text(),'Place order: $37.03')]");
    By verifyTextThankYouForYourOrder = By.id("page-title");//h1[@id='page-title']

    public void setEnterFirstname() {
        Reporter.log("Enter First Name" + enterFirstname.toString() + "<br>");
        sendTextToElement(enterFirstname,"limo");
    }

    public void setEnterLastname() {
        Reporter.log("Enter Last Name" + enterLastname.toString() + "<br>");
        sendTextToElement(enterLastname,"nimmo");
    }

    public void setEnterAddress() {
        Reporter.log("Enter Address" + enterAddress.toString() + "<br>");
        sendTextToElement(enterAddress,"12 ka 4, paradise way");
    }

    public void setState() {
        Reporter.log("Enter State" + enterState.toString() + "<br>");
        sendTextToElement(enterState,"abc");
    }

    public void setSelectDeliverMethodToLocalShipping() {
        Reporter.log("Select Deliver Method to Local Shipping" + selectDeliverMethodToLocalShipping.toString() + "<br>");
        mouseHoverToElementAndClick(selectDeliverMethodToLocalShipping);
    }

    public void setSelectPaymentMethodCOD() {
        Reporter.log("Select Payment Method COD" + selectPaymentMethodCOD.toString() + "<br>");
        clickOnElement(selectPaymentMethodCOD);
    }

    public String getVerifyTotal$37cent03() {
        Reporter.log("Verify Total $37.03" + verifyTotal$37cent03.toString() + "<br>");
        return getTextFromElement(verifyTotal$37cent03);
    }

    public void setClickOnPlaceOrderButton() {
        Reporter.log("Click on Place Order Button" + clickOnPlaceOrderButton.toString() + "<br>");
        clickOnElement(clickOnPlaceOrderButton);
    }

    public String getVerifyTextThankYouForYourOrder() {
        Reporter.log("Verify Text, Thank You For Your Order" + verifyTextThankYouForYourOrder.toString() + "<br>");
        return getTextFromElement(verifyTextThankYouForYourOrder);
    }


}
