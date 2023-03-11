package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Login {
    public static final Target INPUT_CORREO = Target.the("Input para ingresar correo").locatedBy("(//input[@class='whsOnd zHQkBf'])[1]");
    public static final Target BTN_SIGUIENTE = Target.the("Btn siguiente").locatedBy("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']");
    public static final Target INPUT_BANDERA_PASS = Target.the("Input para ingresar la contraseña").locatedBy("//div[contains(text(),'Ingresa tu contraseña')]");
    public static final Target INPUT_CONTRASENA = Target.the("Input para ingresar la contraseña").locatedBy("(//input[@class='whsOnd zHQkBf'])[1]");
}


