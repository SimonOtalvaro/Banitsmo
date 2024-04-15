package co.com.devco.certification.pg.tasks;

import co.com.devco.certification.pg.interactions.ChangeWindows;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.certification.pg.userinterfaces.Page.*;

public class ValidateDocument implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BUTTON_PRODUCTS_SERVICES,WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(BUTTON_PRODUCTS_SERVICES),
                WaitUntil.the(BUTTON_PRODUCTS,WebElementStateMatchers.isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(BUTTON_PRODUCTS),
                Click.on(BUTTON_VIRTUAL_INVERSION),
                ChangeWindows.number(),
                Scroll.to(BUTTON_DOCUMENTS).andAlignToTop(),
                Click.on(BUTTON_DOCUMENTS),
                Click.on(BUTTON_PDF),
                ChangeWindows.number()
        );


        actor.remember("URL",Serenity.getWebdriverManager().getCurrentDriver().getCurrentUrl());


    }

    public static ValidateDocument enter(){
        return Tasks.instrumented(ValidateDocument.class);
    }




}

