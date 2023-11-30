package co.com.choucair.certificacion.serenityis.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static co.com.choucair.certificacion.serenityis.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class Login implements Task {
    private final List<Map<String, String>> data;

    public Login(List<Map<String, String>> data) {
        this.data = data;
    }

    public static Login intoPage(List<Map<String, String>> data) {
        return Tasks.instrumented(Login.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
               /* WaitUntil.the(CLIENTE_EMPRESARIAL, isCurrentlyVisible()).forNoMoreThan(60).seconds(),
                Enter.theValue(data.get(0).get("ClienteEmpresarial")).into(CLIENTE_EMPRESARIAL),
                WaitUntil.the(TIPO_DE_IDENTIFICACION, isCurrentlyVisible()).forNoMoreThan(60).seconds(),
                Enter.theValue(data.get(0).get("TipoDeIdentificación")).into(IPO_DE_IDENTIFICACION,
                WaitUntil.the(NUMERO_DE_IDENTIFICACION, isCurrentlyVisible()).forNoMoreThan(60).seconds(),
                Enter.theValue(data.get(0).get("NúmeroDeIdentificación")).into(NUMERO_DE_IDENTIFICACION),
                WaitUntil.the(CLAVE_PERSONAL, isCurrentlyVisible()).forNoMoreThan(60).seconds(),
                Enter.theValue(data.get(0).get("ClavePersonal")).into(CLAVE_PERSONAL),
                WaitUntil.the(CLAVE_TOKEN, isCurrentlyVisible()).forNoMoreThan(60).seconds(),
                Enter.theValue(data.get(0).get("ClavePersonal")).into(CLAVE_TOKEN),
                WaitUntil.the(INPUT_PASSWORD, isCurrentlyVisible()).forNoMoreThan(60).seconds(),
                Enter.theValue(data.get(0).get("ClaveToken")).into(INPUT_PASSWORD),
                Click.on(BTN_SIGIN)*/
                );
    }
}
