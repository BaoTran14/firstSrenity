package firstserenity.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Tiki {
    public static Target ACCOUNT_MENU = Target.the("account menu").located(By.cssSelector("i.user-icon"));
}
