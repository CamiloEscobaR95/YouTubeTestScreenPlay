package tasks.funciones_reproduccion;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.*;
import org.apache.logging.log4j.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.ReproduccionUI.*;

public class PlayStopTk implements Task {

    private static final Logger logger = LogManager.getLogger(PlayStopTk.class);

    public static PlayStopTk reproducirPausar() {
        return instrumented(PlayStopTk.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (Visibility.of(TIEMPO_ACTUAL).viewedBy(actor).asBoolean()) {

            for (int i = 0; i <= 2; i++) {

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                actor.attemptsTo(
                        Click.on(BTN_PLAY_STOP)
                );

                switch (i) {
                    case 0:
                        String tiempoTranscurrido = Text.of(TIEMPO_ACTUAL).viewedBy(actor).asString();
                        logger.info("El boton fue pausado en {}", tiempoTranscurrido);
                        break;

                    case 1:
                        tiempoTranscurrido = Text.of(TIEMPO_ACTUAL).viewedBy(actor).asString();
                        logger.info("El boton fue reproducido en {}", tiempoTranscurrido);
                        break;

                    case 2:
                        tiempoTranscurrido = Text.of(TIEMPO_ACTUAL).viewedBy(actor).asString();
                        logger.info("El boton fue pausado en {}", tiempoTranscurrido);
                        break;

                }
            }
        } else {
            logger.error("No fue posible la reproducción del video!");
        }
    }
}
