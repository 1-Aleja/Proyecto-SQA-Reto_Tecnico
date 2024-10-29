package co.com.retoaleja.stepdefinitions;

import co.com.retoaleja.tasks.RegisterProductReto;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.chrome.ChromeDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterUserStepDefinitions {
    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Aleja");
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
    }
    @Given("user in the home page")
    public void userInTheHomePage() {
        theActorInTheSpotlight().attemptsTo(new RegisterProductReto("https://es.aliexpress.com"));    }
    @When("I fill in all the fields")
    public void iWriteTheAllFields() {

    }
    @Then("satisfactory pressure cooker purchase")
    public void userWasSuccessfullCreation() {

    }

}
