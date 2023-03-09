package stepDefinitions;

import cucumber.api.java.en.*;
import questions.canales.ResultadosCanal;
import questions.canales.SuscripcionCanal;
import tasks.canales.YoutubeBusquedaCanalTk;
import tasks.canales.YoutubeSuscribcionTk;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class SuscripcionDefinitions {

    @Given("^el usuario realiza la busqueda de un canal (.*)$")
    public void elUsuarioRealizaLaBusquedaDeUnCanalJulianMesa(String canal) throws InterruptedException {
        theActorInTheSpotlight().wasAbleTo(
                YoutubeBusquedaCanalTk.buscarCanal(canal)
        );

        theActorInTheSpotlight().should(
                seeThat(ResultadosCanal.validarResultado(canal), equalTo(true) )
        );

    }

    @When("^el usuario se suscribe a el canal$")
    public void elUsuarioSeSuscribeAElCanal() {
        theActorInTheSpotlight().wasAbleTo(
                YoutubeSuscribcionTk.suscribirseCanal()
        );
    }

    @Then("^el usuario valida la suscripcion (.*)$")
    public void elUsuarioValidaLaSuscripcion(String canal) {
        theActorInTheSpotlight().should(
                seeThat(SuscripcionCanal.validarSuscripcion(canal), equalTo(true))
        );
    }
}
