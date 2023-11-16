package com.demosqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DemoPageUser {

    public static final Target LBL_IMAGE = Target.the("imagen").locatedBy("//img[@class ='banner-image']");

    public static final Target LBl_OPTIONS = Target.the("labels opciones").locatedBy("//div[@class='card-body' and contains(.,'{0}')]");
    public static final Target LBL_OPTION_ACCORDION = Target.the("opcion de acordion").locatedBy("//div[@class ='header-text'and contains(.,'{0}')]");
    public static final Target LBl_SUB_MENU = Target.the("labels sub menu").locatedBy("//li[@id='item-1' and contains(.,'{0}')]");
    public static final Target LBl_ALERTS = Target.the("labels auto complete").locatedBy("//li[@id='item-1' and contains(.,'Alerts')]");
}
