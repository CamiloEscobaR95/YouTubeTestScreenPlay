package tasks.funciones_reproduccion;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Visibility;
import org.apache.logging.log4j.*;
import utilidades.Mouse;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.ReproduccionUI.*;

public class SonidoTk<Hooks> implements Task {
    Mouse mouse;
    private static final Logger logger = LogManager.getLogger(SonidoTk.class);


    public static SonidoTk silenciarActivarSonido() {
        return instrumented(SonidoTk.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_SILENCIAR_SONIDO)
        );
        logger.info("El sonido fue cancelado!");

        if (Visibility.of(BTN_ACTIVAR_SONIDO).viewedBy(actor).asBoolean()) {
            actor.attemptsTo(
                    Click.on(BTN_ACTIVAR_SONIDO)
            );
            logger.info("El sonido fue activado!");

        } else {
            logger.error("Existe un error y el boton para activar sonido no pudo ser encontrado");
        }


    }
}
