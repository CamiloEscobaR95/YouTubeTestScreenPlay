package stepDefinitions;

import com.ibm.icu.impl.InvalidFormatException;
import cucumber.api.Scenario;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import utilidades.DataToFeature;

import java.io.IOException;

public class Hooks {

    @Before
    public void theSetStage(Scenario scenario) throws IOException, InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Camilo");

        String featureTag = scenario.getSourceTagNames().iterator().next();
        System.out.println("Caso de prueba: " + featureTag + " " + scenario.getName());


        DataToFeature.overrideFeatureFiles("./src/test/resources/features");


    }

    @After
    public static void tearDown(){
        try {
            System.out.println("Generando reporte");
            String[] cmd = {"cmd.exe", "/c", "node index.js"};
            Runtime.getRuntime().exec(cmd);
            System.out.println("Reporte generado  con exito");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
