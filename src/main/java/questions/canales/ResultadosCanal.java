package questions.canales;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static userInterfaces.ResultadosBusquedaUI.*;

public class ResultadosCanal implements Question<Boolean> {

    private static final Logger logger = LogManager.getLogger(ResultadosCanal.class);

    private  final String canal;
    private static Boolean canalOk = false;

    public ResultadosCanal(String canal, Boolean canalOk) {
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
        return new ResultadosCanal(canal, canalOk);
    }


}
