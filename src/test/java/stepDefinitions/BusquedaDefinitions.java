package stepDefinitions;

import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static  net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;


import questions.ResultadosBusqueda;
import tasks.YoutubeBusquedaTk;
import userInterfaces.HomePage;

public class BusquedaDefinitions {

    @Given("^el usuario ingresa a youtube$")
    public void elUsuarioIngresaAYoutube() {
        HomePage youtube = new HomePage();
        theActorInTheSpotlight().wasAbleTo(
                Open.browserOn(youtube)
        );
    }

    @When("^el usuario realiza la busqueda de un tema (.*)$")
    public void elUsuarioRealizaLaBusquedaDeUnTemaAutomatizacionDePruebas(String busqueda) {
        theActorInTheSpotlight().wasAbleTo(
                YoutubeBusquedaTk.realizarBusqueda(busqueda)
        );
    }

    @Then("^el usuario visulaiza los diferentes resultados de busqueda (.*)$")
    public void elUsuarioVisulaizaLosDiferentesResultadosDeBusqueda(String tema) {
        theActorInTheSpotlight().should(
                seeThat(ResultadosBusqueda.validarResultado(tema), equalTo(tema))
        );
    }

}
