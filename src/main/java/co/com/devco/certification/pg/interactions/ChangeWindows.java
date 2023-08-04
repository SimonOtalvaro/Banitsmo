package co.com.devco.certification.pg.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class ChangeWindows implements Interaction {



    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        Set<String> theWindows = driver.getWindowHandles();
        for (String currentWindow : theWindows) {
            driver.switchTo().window(currentWindow);
        }
    }



    public static ChangeWindows number(){
        return new ChangeWindows();
    }

}
