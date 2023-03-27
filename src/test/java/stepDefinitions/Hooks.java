package stepDefinitions;

import cucumber.api.Scenario;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import tasks.funciones_reproduccion.PlayStopTk;


public class Hooks {

    @Before
    public void theSetStage(Scenario scenario){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Camilo");

        String featureTag = scenario.getSourceTagNames().iterator().next();
        System.out.println("Caso de prueba: " + featureTag + " " + scenario.getName());
    }


}
