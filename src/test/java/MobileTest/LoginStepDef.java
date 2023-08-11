package MobileTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class LoginStepDef extends InitDriver{
    public LoginStepDef() {
        super();
    }

    @Given("Input email {string}")
    public void inputEmail(String email) {
        driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys(email);
    }

    @And("Input password {string}")
    public void inputPassword(String password) {
        driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys(password);
        driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys(Keys.ENTER);
    }

    @When("Click login button")
    public void clickLoginButton() {
        driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonLogin")).click();
    }

    @Then("Displayed error messages")
    public void displayedErrorMessages() {
        driver.findElement(By.id("com.loginmodule.learning:id/snackbar_text")).isDisplayed();
    }
}
