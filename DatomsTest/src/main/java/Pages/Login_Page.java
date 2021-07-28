package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public WebDriver driver;
	
	
@FindBy(xpath="//div[@class='head']")
WebElement LoginLogo;
@FindBy(xpath="//div[@class='header' and contains(text(),'Email Address')]")
WebElement EmailHeader;
@FindBy(xpath="//div[@class='header' and contains(text(),'Password')]")
WebElement PasswordHeader;
@FindBy(xpath="//input[@id='email']")
WebElement EmailtxtBox;
@FindBy(xpath="//input[@id='password']")
WebElement PasswordtxtBox;
@FindBy(xpath="//input[@id='form_submit_btn']")
WebElement LoginBtn;
@FindBy(xpath="//a[@href='/forgot']")
WebElement ForgotPasswordLink;

public Login_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void checkLogo() {
	LoginLogo.isDisplayed();
}
public void checkemailHeader() {
	EmailHeader.isDisplayed();
}
public void checkpasswordHeader() {
	PasswordHeader.isDisplayed();
}
public void checkEmailtxtBox() {
	EmailtxtBox.isDisplayed();
}
public void checkPasswordtxtBox() {
	PasswordtxtBox.isDisplayed();
}
public void checkLoginBtn() {
	LoginBtn.isDisplayed();
}
public void checkForgotPasswordLink() {
	ForgotPasswordLink.isDisplayed();
}
public void teardown() {
	driver.close();
}

}
