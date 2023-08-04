package co.com.devco.certification.pg.utils;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Chrome {

    private ChromeDriver driver;
    private ChromeOptions chromeOptions;

    private Chrome() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized --ignore-certificate-errors --disable-download-notification --disable-popup-blocking --lang=es");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    public ChromeDriver pruebaX(){
        driver.get("https://www.bancolombia.com/personas");
        return driver;
    }


    public static Chrome in(){
        return new Chrome();
    }

}
