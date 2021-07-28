package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Login_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login_Steps {
	Login_Page loginpage;
	Login_Steps lsteps;
	WebDriver driver;
	@Given("^User navigate to login page$")
	public void user_navigate_to_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-workspace\\DatomsTest\\Resources\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://accounts.datoms.io/login");
		  loginpage = new Login_Page(this.driver);
	}
	@Then("^User validate LoginLogo$")
	public void user_validate_LoginLogo() throws Throwable {
	   loginpage.checkLogo();
	}

	@Then("^User validate EmailHeader$")
	public void user_validate_EmailHeader() throws Throwable {
	    loginpage.checkemailHeader();
	}

	@Then("^User validate PassHeader$")
	public void user_validate_PassHeader() throws Throwable {
	    loginpage.checkpasswordHeader();
	}

	@Then("^User validate EmailTextBox$")
	public void user_validate_EmailTextBox() throws Throwable {
	   loginpage.checkEmailtxtBox();
	}

	@Then("^User validate PasswordTextBox$")
	public void user_validate_PasswordTextBox() throws Throwable {
	   loginpage.checkPasswordtxtBox();
	}

	@Then("^User validate LoginButton$")
	public void user_validate_LoginButton() throws Throwable {
	    loginpage.checkLoginBtn();
	}

	@Then("^User Validate ForgotPasswordLink$")
	public void user_Validate_ForgotPasswordLink() throws Throwable {
	  loginpage.checkForgotPasswordLink();
	}
	@Then("^User Close the login page$")
	public void user_Close_the_login_page() throws Throwable{
		loginpage.teardown();
	}
}
