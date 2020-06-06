package firstserenity.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FacebookPage {
    public static Target DAY = Target.the("date of birth").located(By.id("day"));
    public static Target MONTH = Target.the("month of birth").located(By.id("month"));
    public static Target YEAR = Target.the("year of birth").located(By.id("year"));
}
