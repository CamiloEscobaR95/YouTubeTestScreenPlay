package tasks.funciones_reproduccion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Visibility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.ReproduccionUI.*;

public class SonidoTk implements Task {

    private static final Logger logger = LogManager.getLogger(SonidoTk.class);


    public static SonidoTk validarBoton() {
        return instrumented(SonidoTk.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SILENCIAR_SONIDO)

        );
        logger.info("El sonido fue cancelado!");

        if(Visibility.of(BTN_ACTIVAR_SONIDO).viewedBy(actor).asBoolean()){
            actor.attemptsTo(
                    Click.on(BTN_ACTIVAR_SONIDO)
            );
            logger.info("El sonido fue activado!");
        }else {
            logger.error("Existe un error y el boton sonido no pudo ser encontrado");
        }
    }
}
