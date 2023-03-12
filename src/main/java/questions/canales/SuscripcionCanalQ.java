package questions.canales;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static userInterfaces.HomePageUI.CANALES_SUSCRITOS;


public class SuscripcionCanalQ implements Question<Boolean> {

    private static final Logger logger = LogManager.getLogger(SuscripcionCanalQ.class);

    private static Boolean suscripcion = false;
    private final String canal;

    public SuscripcionCanalQ(String canal, Boolean suscripcion) {
        this.suscripcion = suscripcion;
        this.canal = canal;
    }

        public static Question<Boolean> validarSuscripcion(String canal) {
        return new SuscripcionCanalQ(canal, suscripcion);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String listaCanales;
        if(Visibility.of(CANALES_SUSCRITOS.of(canal)).viewedBy(actor).asBoolean()) {
            listaCanales = Text.of(CANALES_SUSCRITOS.of(canal)).viewedBy(actor).asString();
            if (listaCanales.contains(canal)){
                suscripcion = true;
                System.out.println("La suscripción fue exitosa!");
                logger.info("La suscripcion al canal {} fue exitosa!", canal);
            }else{
                logger.error("La suscripcion al canal {} no fue posible", canal);
            }
        }else{
            logger.error("La suscripcion al canal {} no fue posible, debe iniciar sessión", canal);

        }
        return suscripcion;
    }
}
