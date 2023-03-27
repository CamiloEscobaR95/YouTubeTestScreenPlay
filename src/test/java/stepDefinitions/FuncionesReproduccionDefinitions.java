package stepDefinitions;

import cucumber.api.java.en.*;
import questions.reproduccion.BotonSonidoQ;
import tasks.funciones_reproduccion.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static  net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class FuncionesReproduccionDefinitions {

    @Then("^el usuario pausa reproduce y cambia el video$")
    public void elUsuarioPausaReproduceYCambiaElVideo() {
        theActorInTheSpotlight().wasAbleTo(
                PlayStopTk.reproducirPausar(),
                SiguienteTk.siguienteCancion()
        );
    }

    @Then("^el usuario puede silenciar y activar el sonido del video$")
    public void elUsuarioPuedeSilenciarYActivarElSonidoDelVideo() {
        theActorInTheSpotlight().wasAbleTo(
                SonidoTk.silenciarActivarSonido()
        );

        theActorInTheSpotlight().should(
                seeThat(BotonSonidoQ.validarBoton(true), equalTo(true))
        );
    }
}
