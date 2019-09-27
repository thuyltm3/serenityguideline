package ui.screenplay.qc_coccoc;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import screenplay.qcCocCoc.questions.CurrentUrl;
import screenplay.qcCocCoc.tasks.Login;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.containsString;

@RunWith(SerenityRunner.class)
public class LoginPage {

    private Actor donald = Actor.named("Donald");


    @Managed(uniqueSession = true)
    private WebDriver herBrowser;

    @Before
    public void annaCanBrowseTheWeb() {
        donald.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void login_with_correct_credential() {

        givenThat(donald).wasAbleTo(Login.loginThePage("ledinhcuong99@gmail.com",
                "Automationzone1990#"));
        then(donald).should(seeThat(CurrentUrl.information(),containsString("welcome")));
    }

}
