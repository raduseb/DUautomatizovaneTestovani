package cz.czechitas.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class HlavniProgram {

    public void run() throws Exception {
//      System.setProperty("webdriver.gecko.driver", System.getProperty("user.home") + "/Java-Training/Selenium/geckodriver");
        System.setProperty("webdriver.gecko.driver", "C:\\Java-Training\\Selenium\\geckodriver.exe");

        WebDriver prohlizec;
        prohlizec = new FirefoxDriver();
        prohlizec.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        prohlizec.navigate().to("https://cz-test-jedna.herokuapp.com/");

//        UKOL C. 1
//        WebElement prihlaseni = prohlizec.findElement(By.xpath("/html/body/div/header/nav/div/div[2]/a"));
//        prihlaseni.click();
//
//        WebElement email = prohlizec.findElement(By.xpath("//*[@id=\"email\"]"));
//        email.sendKeys("raduseb@gmail.com");
//        WebElement heslo = prohlizec.findElement(By.xpath("//*[@id=\"password\"]"));
//        heslo.sendKeys("123456Ab");
//
//        WebElement prihlasit = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div[3]/div/button"));
//        prihlasit.click();


//        UKOL C. 2
//        WebElement vyberKurz = prohlizec.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div[2]/a"));
//        vyberKurz.click();
//        WebElement vytvorPrihlasku = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div[2]/a"));
//        vytvorPrihlasku.click();
//        WebElement email = prohlizec.findElement(By.xpath("//*[@id=\"email\"]"));
//        email.sendKeys("raduseb@gmail.com");
//        WebElement heslo = prohlizec.findElement(By.xpath("//*[@id=\"password\"]"));
//        heslo.sendKeys("123456Ab");
//        WebElement prihlasit = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div[3]/div/button"));
//        prihlasit.click();
//        WebElement termin = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/form/table/tbody/tr[2]/td[2]/div/button/div/div/div"));
//        termin.click();
//        WebElement terminKonkretni = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/form/table/tbody/tr[2]/td[2]/div/div/div[2]/ul/li/a/span"));
//        terminKonkretni.click();
//        WebElement jmenoZaka = prohlizec.findElement(By.xpath("//*[@id=\"forename\"]"));
//        jmenoZaka.sendKeys("Abcd");
//        WebElement prijmeniZaka = prohlizec.findElement(By.xpath("//*[@id=\"surname\"]"));
//        prijmeniZaka.sendKeys("Efgh");
//        WebElement datumNarozeni = prohlizec.findElement(By.xpath("//*[@id=\"birthday\"]"));
//        datumNarozeni.sendKeys("5.1.2013");
//        WebElement zpusobUhrady = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/form/table/tbody/tr[8]/td[2]/span[1]/label"));
//        zpusobUhrady.click();
//        WebElement souhlasPodminky = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/form/table/tbody/tr[11]/td[2]/span/label"));
//        souhlasPodminky.click();
//        WebElement vytvoritPrihlasku = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/form/table/tbody/tr[11]/td[2]/input"));
//        vytvoritPrihlasku.click();
//        WebElement overitPrihlasku = prohlizec.findElement(By.xpath("/html/body/div/header/nav/div/div[1]/a[2]"));
//        overitPrihlasku.click();

//          UKOL C. 3
//
//        WebElement prihlasit = prohlizec.findElement(By.xpath("/html/body/div/header/nav/div/div[2]/a"));
//        prihlasit.click();
//        WebElement email = prohlizec.findElement(By.xpath("//*[@id=\"email\"]"));
//        email.sendKeys("raduseb@gmail.com");
//        WebElement heslo = prohlizec.findElement(By.xpath("//*[@id=\"password\"]"));
//        heslo.sendKeys("123456Ab");
//        WebElement prihlasitSe = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div[3]/div/button"));
//        prihlasitSe.click();
//        WebElement vytvoritNovouprihlasku = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/div[1]/a"));
//        vytvoritNovouprihlasku.click();
//        WebElement viceInformaci = prohlizec.findElement(By.xpath("/html/body/div/div/div[1]/div[4]/div/div[2]/a"));
//        viceInformaci.click();
//        WebElement vytvoritPrihlasku = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div[2]/a"));
//        vytvoritPrihlasku.click();
//        WebElement termin = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/form/table/tbody/tr[2]/td[2]/div/button/div/div/div"));
//        termin.click();
//        WebElement terminKonkretni = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/form/table/tbody/tr[2]/td[2]/div/div/div[2]/ul/li/a/span"));
//        terminKonkretni.click();
//        WebElement jmenoZaka = prohlizec.findElement(By.xpath("//*[@id=\"forename\"]"));
//        jmenoZaka.sendKeys("Hjkl");
//        WebElement prijmeniZaka = prohlizec.findElement(By.xpath("//*[@id=\"surname\"]"));
//        prijmeniZaka.sendKeys("Qwer");
//        WebElement datumNarozeni = prohlizec.findElement(By.xpath("//*[@id=\"birthday\"]"));
//        datumNarozeni.sendKeys("1.1.2015");
//        WebElement zpusobUhrady = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/form/table/tbody/tr[8]/td[2]/span[4]/label"));
//        zpusobUhrady.click();
//        WebElement souhlasPodminky = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/form/table/tbody/tr[11]/td[2]/span/label"));
//        souhlasPodminky.click();
//        WebElement vytvoritPrihlasku1 = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/form/table/tbody/tr[11]/td[2]/input"));
//        vytvoritPrihlasku1.click();
//        WebElement overitPrihlasku = prohlizec.findElement(By.xpath("/html/body/div/header/nav/div/div[1]/a[2]"));
//        overitPrihlasku.click();

//        UKOL C. 4 - overeni kontaktu, webove stranky v kontaktech
        WebElement kontakt = prohlizec.findElement(By.xpath("/html/body/div/header/nav/div/div[1]/a[2]"));
        kontakt.click();
        WebElement webovka = prohlizec.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div[1]/p[2]/a"));
        webovka.click();



        Thread.sleep(10_000);

        prohlizec.quit();
    }
}
