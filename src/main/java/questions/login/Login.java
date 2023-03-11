package questions.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import static userInterfaces.HomePage.*;


public class Login implements Question<Boolean> {

    private static final Logger logger = LogManager.getLogger(Login.class);
    private Boolean login = false;

    public Login(boolean login) {
    }


    public static Question<Boolean> validarLogin(boolean login) {

        return new Login(login);
    }


    @Override
    public Boolean answeredBy(Actor actor) {

        if(Visibility.of(BTN_AVATAR).viewedBy(actor).asBoolean()) {
            login = true;
            logger.info("Inicio de sesion Exitoso!");
        }else{
            logger.error("No se logro iniciar sesion.");
        }
        return login;
    }
}
