package firstserenity.features.search;

import firstserenity.ui.FacebookPage;
import firstserenity.ui.SearchBox;
import firstserenity.ui.Tiki;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import firstserenity.tasks.OpenTheApplication;
import firstserenity.tasks.Search;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

@RunWith(SerenityRunner.class)
public class SearchByKeywordStory {

    Actor anna = Actor.named("Anna");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Steps
    OpenTheApplication openTheApplication;

    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void search_results_should_show_the_search_term_in_the_title() {

//        givenThat(anna).wasAbleTo(openTheApplication);
//
//        when(anna).attemptsTo(Search.forTheTerm("BDD In Action"));
//
        then(anna).should(eventually(seeThat(TheWebPage.title(), containsString("BDD In Action"))));

        anna.attemptsTo(
                Open.url("https://wwww.google.com"),
//                Enter.theValue("").into(SearchBox.SEARCH_FIELD),
//                Hit.the(Keys.ENTER).into(SearchBox.SEARCH_FIELD),
//                Click.on(SearchBox.OUTSIDE_INPUT),
//                Click.on(SearchBox.SEARCH_BUTTON),
                //Select is only used for select tag
//                SelectFromOptions.byIndex(1).from(FacebookPage.DAY),
//                SelectFromOptions.byValue("11").from(FacebookPage.MONTH),
//                SelectFromOptions.byVisibleText("1995").from(FacebookPage.YEAR),
                MoveMouse.to(Tiki.ACCOUNT_MENU),
                WaitUntil.the(Tiki.ACCOUNT_MENU, isVisible()).forNoMoreThan(5).seconds()
        );

    }
}