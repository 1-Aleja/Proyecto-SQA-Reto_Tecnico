package co.com.retoaleja.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Home {
    public static final Target SEARCHBAR =Target.the("search bar").
            locatedBy("//input[@id='search-words']");
    public static final Target ClOSEPOPUP =Target.the("ClOSEPOPUP").
    locatedBy("//img[@class='pop-close-btn']");
    public static final Target ClOSENOTIFICAQTION =Target.the("Close notification").
            locatedBy("//img[@class='_24EHh']");
    public static final Target SEARCH =Target.the("Close notification").
            locatedBy("//input[@type='button']");
    public static final Target CLOSESEARCH =Target.the("Close notification").
            locatedBy("//div[@class='esm--upload-close--1x0SREz']//img");

}


