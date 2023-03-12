package tasks.login;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.apache.logging.log4j.*;
import questions.canales.SuscripcionCanalQ;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static userInterfaces.HomePageUI.*;
import static userInterfaces.LoginUI.*;

public class IniciarSesionTk implements Task {

    private static final Logger logger = LogManager.getLogger(SuscripcionCanalQ.class);
    private final String email;
    private final String contrasena;

    public IniciarSesionTk(String email, String contrasena) {
        this.email = email;
        this.contrasena = contrasena;
    }

    public static IniciarSesionTk iniciarSesion(String email, String contrasena) {
        return instrumented(IniciarSesionTk.class, email, contrasena);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ACCEDER)
        );

        if (Visibility.of(INPUT_CORREO).viewedBy(actor).asBoolean()) {
            logger.info("Ingresamos a llenar el campo de email");

            actor.attemptsTo(
                    Enter.theValue(email).into(INPUT_CORREO),
                    Click.on(BTN_SIGUIENTE),
                    //WaitUntil.the(INPUT_BANDERA_PASS, isEnabled()),
                    //WaitUntil.the(INPUT_BANDERA_PASS, isPresent()).forNoMoreThan(5).seconds()
                    WaitUntil.the(INPUT_BANDERA_PASS, isVisible())
            );
            logger.info("Click en boton siguiente de email OK");

            if (Visibility.of(INPUT_BANDERA_PASS).viewedBy(actor).asBoolean()) {
                logger.info("Ingresamos a llenar el campo de contraseña");
                actor.attemptsTo(
                        Enter.theValue(contrasena).into(INPUT_CONTRASENA),
                        Click.on(BTN_SIGUIENTE)
                );
            }
            logger.info("Click en boton siguiente de conraseña OK");

        }

    }
}
