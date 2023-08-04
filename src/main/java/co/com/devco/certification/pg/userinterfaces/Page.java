package co.com.devco.certification.pg.userinterfaces;



import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Page {

        public static final Target BUTTON_PRODUCTS_SERVICES = Target.the("Button products and services").
                located(By.xpath("//*[@id='menu-productos']"));

        public static final Target BUTTON_PRODUCTS = Target.the("Button products and services").
                located(By.xpath("//*[@id='header-productos-inversiones']"));

        public static final Target BUTTON_VIRTUAL_INVERSION = Target.the("Button for virtual inversion").
                located(By.xpath("(//div[@class='leer-mas'])[2]"));

        public static final Target BUTTON_DOCUMENTS = Target.the("Button for see the documents").
                located(By.xpath("//*[@href='#tab4']"));

        public static final Target BUTTON_PDF = Target.the("Button for see the documents").
                located(By.xpath("(//a[@target='_blank'])[7]"));





}

