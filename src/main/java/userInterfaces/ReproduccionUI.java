package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;


public class ReproduccionUI {
    public static final Target BTN_PLAY_STOP = Target.the("Boton para reproducir o pausar").locatedBy("//button[@class='ytp-play-button ytp-button']");
    public static final Target BTN_SIGUIENTE = Target.the("Boton para pasar canción").locatedBy("(//a[@class='ytp-next-button ytp-button'])[1]");
    public static final Target BTN_SILENCIAR_SONIDO = Target.the("Boton para mutear sonido").locatedBy("//button[@title='Silenciar (m)']");
    public static final Target BTN_ACTIVAR_SONIDO = Target.the("Boton para activar sonido").locatedBy("//button[@title='Activar sonido (m)']");
    public static final Target NOMBRE_VIDEO = Target.the("Nombre del video").locatedBy("//h1[@class='style-scope ytd-watch-metadata']");
    public static final Target TIEMPO_ACTUAL = Target.the("tiempo transcurrido en la reproducción").locatedBy("//span[@class='ytp-time-current']");
    public static final Target BTN_NO_GRACIAS = Target.the("Boton para rechazar youtube premium").locatedBy("// yt-button-renderer[@id='dismiss-button']//button");

}
