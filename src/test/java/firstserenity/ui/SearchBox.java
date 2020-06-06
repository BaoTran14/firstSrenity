package firstserenity.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchBox {
    public static Target SEARCH_FIELD = Target.the("search field").located(By.name("q"));
    public static Target OUTSIDE_INPUT = Target.the("outside of inut field").located(By.id("hplogo"));
    public static Target SEARCH_BUTTON = Target.the("search button").located(By.name("btnK"));
}
