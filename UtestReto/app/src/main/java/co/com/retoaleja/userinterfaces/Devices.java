package co.com.retoaleja.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Devices {
    public static final Target MOBILEDEVICE =Target.the("Mobile Device")
            .locatedBy("//input[@placeholder='Select Brand']"),
    MODEL=Target.the("Model")
            .locatedBy("//span[normalize-space()='Select a Model']"),
     OPERATINGSYSTEM=Target.the("Operating System")
            .locatedBy("//div[@disabled='disabled']//span[@aria-label='Select OS']");
}
