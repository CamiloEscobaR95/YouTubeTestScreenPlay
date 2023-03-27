package questions.reproduccion;

import net.serenitybdd.screenplay.*;
import org.sikuli.script.*;
import utilidades.Mouse;

import static userInterfaces.ReproduccionUI.*;

public class BotonSonidoQ implements Question<Boolean> {
    Mouse mouse = new Mouse();
    private Boolean sonido = false;

    public BotonSonidoQ(boolean sonido) {
    }

    public static Question<Boolean> validarBoton(boolean sonido) {
        return new BotonSonidoQ(sonido);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        try {
            mouse.mover(100, 100);
            String titleBtn = BTN_SILENCIAR_SONIDO.resolveFor(actor).getAttribute("title");
            if(titleBtn.contentEquals("Silenciar (m)")){
                sonido = true;
            }
        } catch (FindFailed e) {
            e.printStackTrace();
        }
        return sonido;
    }
}
