package tasks.home_page;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.HomePageUI.VIDEO_RANDOM;

public class SeleccionarVideoRandomTk implements Task {

    public static SeleccionarVideoRandomTk seleccionar() {
        return instrumented(SeleccionarVideoRandomTk.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(VIDEO_RANDOM)
        );
    }
}
