package tasks.home_page;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.HomePageUI.*;

public class HomePageBusquedaTk implements Task {

    private  String busqueda;

    public HomePageBusquedaTk(String busqueda) {
        this.busqueda = busqueda;
    }

    public static HomePageBusquedaTk realizarBusqueda(String busqueda) {
        return instrumented(HomePageBusquedaTk.class, busqueda);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(busqueda).into(INPUT_BUSQUEDA),
                Click.on(BTN_BUSCAR)
        );
    }
}
