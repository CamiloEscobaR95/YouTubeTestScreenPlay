package stepDefinitions;

import cucumber.api.java.en.*;
import questions.canales.ResultadosCanalQ;
import questions.canales.SuscripcionCanalQ;
import tasks.canales.BusquedaCanalTk;
import tasks.canales.SuscribcionCanalTk;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class SuscripcionDefinitions {

    @Given("^el usuario realiza la busqueda de un canal (.*)$")
    public void elUsuarioRealizaLaBusquedaDeUnCanalJulianMesa(String canal) throws InterruptedException {
        theActorInTheSpotlight().wasAbleTo(
                BusquedaCanalTk.buscarCanal(canal)
        );

        theActorInTheSpotlight().should(
                seeThat(ResultadosCanalQ.validarResultado(canal), equalTo(true) )
        );

    }

    @When("^el usuario se suscribe a el canal$")
    public void elUsuarioSeSuscribeAElCanal() {
        theActorInTheSpotlight().wasAbleTo(
                SuscribcionCanalTk.suscribirseCanal()
        );
    }

    @Then("^el usuario valida la suscripcion (.*)$")
    public void elUsuarioValidaLaSuscripcion(String canal) {
        theActorInTheSpotlight().should(
                seeThat(SuscripcionCanalQ.validarSuscripcion(canal), equalTo(true))
        );
    }
}
