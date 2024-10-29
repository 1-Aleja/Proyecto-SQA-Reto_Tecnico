package co.com.retoaleja.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Product {
    public static final Target SELECTPRODUCT=Target.the("firstname").
            locatedBy("//div[contains(@class, 'multi--outWrapper')]//span[contains(@class, 'image--icon--')]\n");
    public static final Target SELECTNUMBER=Target.the("firstname").
            locatedBy("//span[contains(@class,'comet-icon comet-icon-add')]//*[name()='svg']");
    public static final Target SHOPPINGCART=Target.the("firstname").
            locatedBy("//span[normalize-space()='Agregar al carrito']");
    public static final Target GOTOSHOPPINGCART=Target.the("firstname").
            locatedBy("//span[@class='comet-icon comet-icon-shoppingcart shop-cart--shoppingCartIcon--d5W36TW']//*[name()='svg']");
    public static final Target ADDPRODUCT=Target.the("firstname").
            locatedBy("//div[@class='group-container']//div[1]//div[1]//div[2]//div[2]//div[2]//div[2]//div[1]//div[2]//span[1]//*[name()='svg']");

}
