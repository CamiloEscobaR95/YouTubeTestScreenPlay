package questions.canales;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.questions.*;
import org.apache.logging.log4j.*;


import static userInterfaces.ResultadosBusquedaUI.*;

public class ResultadosCanalQ implements Question<Boolean> {

    private static final Logger logger = LogManager.getLogger(ResultadosCanalQ.class);

    private  final String canal;
    private static Boolean canalOk = false;

    public ResultadosCanalQ(String canal, Boolean canalOk) {
        super();
        this.canal = canal;
        this.canalOk = canalOk;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String resultadoObtenido;
        if(Visibility.of(RESULT_CANAL).viewedBy(actor).asBoolean()) {

            resultadoObtenido = Text.of(RESULT_CANAL.of(canal)).viewedBy(actor).asString();
            if(resultadoObtenido.contains(canal)){
                canalOk = true;
                logger.info("El canal ha sido encontrado, en los resultados de busqueda!");
            }else{
                logger.error("El canal no se logro encontrar.");
            }
        }
        return canalOk;
    }

    public static Question<Boolean> validarResultado(String canal) {
        return new ResultadosCanalQ(canal, canalOk);
    }

}
