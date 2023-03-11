package userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.youtube.com/")
public class HomePage extends PageObject {

    public static final Target INPUT_BUSQUEDA = Target.the("Caja de busqueda").locatedBy("//input[@id=\"search\"]");
    public static final Target BTN_BUSCAR = Target.the("Caja de busqueda").locatedBy("//button[@id=\"search-icon-legacy\"]");
    public static final Target CANALES_SUSCRITOS = Target.the("Caja de busqueda").locatedBy("//div[@id='items']//a[@title='{0}']");
    public static final Target BTN_ACCEDER = Target.the("Boton para hacer login").locatedBy("(//a[@class='yt-spec-button-shape-next yt-spec-button-shape-next--outline yt-spec-button-shape-next--call-to-action yt-spec-button-shape-next--size-m yt-spec-button-shape-next--icon-leading '])[1]");
    public static final Target BTN_AVATAR = Target.the("Caja de busqueda").locatedBy("//button[@id='avatar-btn']");
}
