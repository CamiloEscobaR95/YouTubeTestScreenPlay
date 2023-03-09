package tasks.canales;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.HomePage.*;

public class YoutubeBusquedaCanalTk implements Task {

    private final String  canal;

    public YoutubeBusquedaCanalTk(String canal) {
        this.canal = canal;
    }

    public static YoutubeBusquedaCanalTk buscarCanal(String canal) {
        return instrumented(YoutubeBusquedaCanalTk.class, canal);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(canal).into(INPUT_BUSQUEDA),
                Click.on(BTN_BUSCAR)
        );
    }
}
