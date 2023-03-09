package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.HomePage.*;

public class YoutubeBusquedaTk implements Task {

    private  String busqueda;

    public YoutubeBusquedaTk(String busqueda) {
        this.busqueda = busqueda;
    }

    public static YoutubeBusquedaTk realizarBusqueda(String busqueda) {
        return instrumented(YoutubeBusquedaTk.class, busqueda);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(busqueda).into(INPUT_BUSQUEDA),
                Click.on(BTN_BUSCAR)
        );
    }
}
