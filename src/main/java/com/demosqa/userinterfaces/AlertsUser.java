package com.demosqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AlertsUser {
    public static final Target BTN_SEE_ALERT = Target.the("boton see alert").locatedBy("//button[@id='alertButton']");
    public static final Target BTN_ALERT_5_S = Target.the("boton alert 5 segundos").locatedBy("//button[@id='timerAlertButton']");
    public static final Target BTN_ALERT_CONFIRM = Target.the("boton alert confirmar").locatedBy("//button[@id='confirmButton']");
    public static final Target BTN_ALERT_PROMPT = Target.the("boton alert propt").locatedBy("//button[@id='promtButton']");
    public static final Target TXT_YOU_SELECTED  = Target.the("texto tu seleccionaste").locatedBy("//span[@id='confirmResult']");
    public static final Target TXT_ALERT_PROMPT = Target.the("boton alert propt").locatedBy("//span[@id='promptResult']");

}
