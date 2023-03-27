package tasks.canales;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.ResultadosBusquedaUI.*;

public class SuscripcionCanalTk implements Task {

    public static SuscripcionCanalTk suscribirseCanal() {
        return instrumented(SuscripcionCanalTk.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_SUSCRIBIRSE)
        );
    }
}
