package tasks.funciones_reproduccion;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.*;
import org.apache.logging.log4j.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.ReproduccionUI.*;

public class SiguienteTk implements Task {

    private static final Logger logger = LogManager.getLogger(PlayStopTk.class);

    public static SiguienteTk validarBoton() {
        return instrumented(SiguienteTk.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String nombreVideo1;

        for (int i = 1; i <= 2; i++) {

            nombreVideo1 = Text.of(NOMBRE_VIDEO).viewedBy(actor).asString();
            logger.info("El nombre del video en reproducción es: {}", nombreVideo1);

            actor.attemptsTo(
                    Click.on(BTN_SIGUIENTE)
            );

            if (Visibility.of(BTN_NO_GRACIAS).viewedBy(actor).asBoolean()) {
                actor.attemptsTo(
                        Click.on(BTN_NO_GRACIAS)
                );
            } else {
                logger.info("No aparecio PopUp de youtube premium en la pantalla {}", i);
            }
            String nombreVideo2 = Text.of(NOMBRE_VIDEO).viewedBy(actor).asString();
            if (!nombreVideo1.contentEquals(nombreVideo2)) {
                logger.info("El video fue cambiado con exito!");
            }
        }
    }
}
