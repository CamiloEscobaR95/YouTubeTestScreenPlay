package userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.youtube.com/")
public class HomePage extends PageObject {

    public static final Target INPUT_BUSQUEDA = Target.the("Caja de busqueda").locatedBy("//input[@id=\"search\"]");
    public static final Target BTN_BUSCAR = Target.the("Caja de busqueda").locatedBy("//button[@id=\"search-icon-legacy\"]");
    public static final Target CANALES_SUSCRITOS = Target.the("Caja de busqueda").locatedBy("//div[@id='items']//a[@title='{0}']");
}
