package com.demosqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AutoCompleteUser {
    public static final Target TXT_MULTIPLE_COLOR = Target.the("texto multiples colores").locatedBy("//div[@id='autoCompleteMultipleContainer']");
    public static final Target TXT_SELECT_MULTIPLE_COLOR = Target.the("selección color").locatedBy("//input[@id='autoCompleteMultipleInput']");
    public static final Target TXT_SINGLE_COLOR = Target.the("texto unico color").locatedBy("//div[@id='autoCompleteSingleContainer']");
    public static final Target TXT_SELECT_SINGLE_COLOR = Target.the("selección unico color").locatedBy("//input[@id='autoCompleteSingleInput']");

}
