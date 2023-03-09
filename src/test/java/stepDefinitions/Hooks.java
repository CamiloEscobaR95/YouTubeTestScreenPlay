package stepDefinitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Hooks {

    @Before
    public void theSetStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Camilo");
    }
}
