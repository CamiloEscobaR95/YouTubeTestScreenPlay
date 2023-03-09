package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import userInterfaces.ResultadosBusquedaUI;

public class ResultadosBusqueda implements Question<String> {

    private static final Logger logger = LogManager.getLogger(ResultadosBusqueda.class);

    private final String tema;

    public ResultadosBusqueda(String tema) {
        this.tema = tema;
    }


    public static ResultadosBusqueda validarResultado(String tema) {
        return new ResultadosBusqueda(tema);
    }

    @Override
    public String answeredBy(Actor actor) {
        String resultadoObtenido;
        resultadoObtenido = Text.of(ResultadosBusquedaUI.RESULT_NUM_UNO.of(tema)).viewedBy(actor).asString();
        if (resultadoObtenido.contains(tema)){
            resultadoObtenido = tema;
            logger.info("El resultado de la busqueda es exitoso!");
        }else{
            logger.error("El criterio de busqueda no fue encontrado!");
        }
        return resultadoObtenido;
    }
}
