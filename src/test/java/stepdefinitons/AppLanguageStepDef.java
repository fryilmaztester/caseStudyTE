package stepdefinitons;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;
import pages.Allpage;
import utilities.ReusableMethods;

import static utilities.Driver.appiumDriver;

public class AppLanguageStepDef {

    Allpage allpage = new Allpage();
    public String languageStr;

    @When("Kullanıcı app dilini alir")
    public void kullanıcıAppDiliniAlir() {
        languageStr = allpage.appLanguagePage().languageText.getText();
    }

    @Then("Kullanıcı default dilin {string} olduğunu dogrular")
    public void defaultLang(String turkish) {

        Assert.assertEquals(languageStr, turkish);
    }


    @When("Kullanıcı ok ile dil degistirme sayfasina gider")
    public void kullanıcıOkIleDilDegistirmeSayfasinaGider() {

        allpage.appLanguagePage().langArrow.click();
    }

    @Then("Kullanıcı dil degistirme sayfasının secili olan dil ile acildigini dogrular")
    public void kullanıcıDilDegistirmeSayfasınınSeciliOlanDilIleAcildiginiDogrular() {
        Assert.assertEquals(allpage.homePage().toolBarTitle.getText(), languageStr);
    }


    @When("Kullanıcı istedigi dilini secer {string}")
    public void kullanıcıIstedigiDiliniSecer(String lang) {

        try {
            ReusableMethods.textWithClick(lang);
        } catch (org.openqa.selenium.NoSuchElementException e) {
            ReusableMethods.scroolElementWithUiSelector(lang);
            ReusableMethods.textWithClick(lang);
        }
    }

    @Then("Kullanıcı {string} dilinin secildigini dogrular")
    public void kullanıcıDilininSecildiginiDogrular(String lang) {
        Assert.assertEquals(languageStr, lang);
    }


    @When("Kullanıcı dil ile {string} dil degistirme sayfasına gider")
    public void kullanıcıDilIleDilDegistirmeSayfasınaGider(String lang) {
        ReusableMethods.textWithClick(lang);
    }


}
