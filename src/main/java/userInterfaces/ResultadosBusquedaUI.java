package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ResultadosBusquedaUI {

    public static final Target RESULT_NUM_UNO =Target.the("Primer resultadod de busqueda").locatedBy("(//a[@id='video-title'])[1]");
    public static final Target RESULT_CANAL = Target.the("resultado de la busqueda de un canal").locatedBy("(//div[@id='info'])[5]//div");
    public static final Target BTN_SUSCRIBIRSE = Target.the("Boton para suscrbirse a un canal").locatedBy("(//div[@id='subscribe-button']//yt-button-shape)[1]");
}
