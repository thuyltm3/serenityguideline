package screenplay.qcCocCoc.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo();

    }




    public static Login loginThePage() {
        return instrumented(Login.class);
    }

}
