package stepDefinitions;

import cucumber.api.java.en.*;
import tasks.funciones_reproduccion.*;

import static  net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FuncionesReproduccionDefinitions {

    @Then("^el usuario pausa reproduce y cambia el video$")
    public void elUsuarioPausaReproduceYCambiaElVideo() {
        theActorInTheSpotlight().wasAbleTo(
                PlayStopTk.validarBoton(),
                SiguienteTk.validarBoton()
        );
    }
}
