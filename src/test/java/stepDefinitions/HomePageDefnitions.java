package stepDefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static  net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.hamcrest.CoreMatchers.equalTo;


import questions.homepage.ResultadosBusquedaQ;
import tasks.home_page.HomePageBusquedaTk;
import tasks.home_page.SeleccionarVideoRandomTk;
import userInterfaces.HomePageUI;

public class HomePageDefnitions {

    @Given("^el usuario ingresa a youtube$")
    public void elUsuarioIngresaAYoutube() {

        HomePageUI youtube = new HomePageUI();
        theActorInTheSpotlight().wasAbleTo(
                Open.browserOn(youtube)
        );

    }

    @When("^el usuario realiza la busqueda de un tema (.*)$")
    public void elUsuarioRealizaLaBusquedaDeUnTema(String busqueda) {
        theActorInTheSpotlight().wasAbleTo(
                HomePageBusquedaTk.realizarBusqueda(busqueda)
        );
    }

    @When("^el usuario selecciona un video en home page$")
    public void elUsuarioSeleccionaUnVideoEnHomePage() {
        theActorInTheSpotlight().wasAbleTo(
                    SeleccionarVideoRandomTk.seleccionar()
        );
    }

    @Then("^el usuario visulaiza los diferentes resultados de busqueda (.*)$")
    public void elUsuarioVisulaizaLosDiferentesResultadosDeBusqueda(String tema) {
        theActorInTheSpotlight().should(
                seeThat(ResultadosBusquedaQ.validarResultado(tema), equalTo(tema))
        );
    }

}
