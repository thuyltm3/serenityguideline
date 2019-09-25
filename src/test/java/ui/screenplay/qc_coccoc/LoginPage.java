package ui.screenplay.qc_coccoc;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.*;


public class LoginPage {

    Actor donald = Actor.named("Donald");


    @Managed(uniqueSession = true)
    private WebDriver herBrowser;

    @Before
    public void annaCanBrowseTheWeb() {
        donald.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void search_results_should_show_the_search_term_in_the_title() {

        givenThat(donald).wasAbleTo();


    }

}
