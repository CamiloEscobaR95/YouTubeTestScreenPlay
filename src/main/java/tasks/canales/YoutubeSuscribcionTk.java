package tasks.canales;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.ResultadosBusquedaUI.*;

public class YoutubeSuscribcionTk implements Task {

    public static YoutubeSuscribcionTk suscribirseCanal() {
        return instrumented(YoutubeSuscribcionTk.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_SUSCRIBIRSE)
        );
    }
}
