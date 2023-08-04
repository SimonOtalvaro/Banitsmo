package co.com.devco.certification.pg.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.devco.certification.pg.utils.Constant.URLPDF;

public class Validation implements Question {



    @Override
    public Object answeredBy(Actor actor) {
        String url = actor.recall("URL");
        String url2 = URLPDF;

        if (url.equals(url2)){
            return true;
        }else{
            return false;
        }

    }

    public static Validation ok(){
        return new Validation();
    }
}
