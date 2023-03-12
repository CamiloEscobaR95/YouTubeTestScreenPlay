package stepDefinitions;

import cucumber.api.java.en.*;
import questions.login.LoginQ;
import tasks.login.IniciarSesionTk;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class InicioSesionDefinitions {
    @When("^el usuario realiza login (.*) (.*)$")
    public void elUsuarioRealizaLoginQualityAutomatorCamiloEGmailComPassGoogleTest(String email, String contrasena) {
        theActorInTheSpotlight().wasAbleTo(
                IniciarSesionTk.iniciarSesion(email, contrasena)
        );
    }


    @Then("^el usuario visualiza el home page desde su cuenta$")
    public void elUsuarioVisualizaElHomePageDesdeSuCuenta() {
        theActorInTheSpotlight().should(
            seeThat(LoginQ.validarLogin(true), equalTo(true))
        );
    }

}
