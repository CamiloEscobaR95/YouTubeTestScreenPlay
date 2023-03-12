package tasks.canales;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.ResultadosBusquedaUI.*;

public class SuscribcionCanalTk implements Task {

    public static SuscribcionCanalTk suscribirseCanal() {
        return instrumented(SuscribcionCanalTk.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_SUSCRIBIRSE)
        );
    }
}
