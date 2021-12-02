package stepdefinitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Allpage;
import utilities.ReusableMethods;

public class OtherStepDef {


    Allpage allpage = new Allpage();

    @When("Kullanıcı digerleri sayfasini acar")
    public void doneIconAcar() {
        allpage.othersPage().othersIcon.click();
    }

    @Then("Kullanıcı digerleri sayfasini actigini dogrular")
    public void kullanıcıDigerleriSayfasiniActiginiDogrular() {
        Assert.assertEquals(allpage.othersPage().othersIcon.getAttribute("selected"), "true");
    }


    @Then("Kullanıcı {string} kullandigini dogrular")
    public void kullanıcıKullandiginiDogrular(String stardatAccount) {

        Assert.assertEquals(allpage.othersPage().freeAccountText.getText(), stardatAccount);
    }

    @And("Kullanıcı standart hesap aciklamasi dogrulanir {string}")
    public void kullanıcıStandartHesapAciklamasiDogrulanir(String limitedAcces) {

        Assert.assertEquals(allpage.othersPage().offerslimxitedAccess.getText(),
                limitedAcces);
    }


    @And("Kullanıcı {string} secebilecegini dogrular")
    public void kullanıcıSecebileceginiDogrular(String appLang) {

        Assert.assertEquals(allpage.othersPage().appLanguage.getText(),appLang);
    }

    @And("Kullanıcı {string} field dogrular")
    public void kullanıcıFieldDogrular(String contactUsLabelText) {

        Assert.assertEquals(allpage.othersPage().contactUsLabel.getText(),contactUsLabelText);
    }

    @And("Kullanıcı {string} alanlarini dogrular")
    public void kullanıcıAlanlariniDogrular(String appInfoLabelText) {
        Assert.assertEquals(allpage.othersPage().appInfoLabel.getText(),appInfoLabelText);
    }


    @When("Kullanıcı abonelikler hakkında sayfasini acar")
    public void kullanıcıAboneliklerHakkındaSayfasiniAcar() {

        try {
            allpage.othersPage().appInfoLabel.click();
        }catch (Exception e){
            ReusableMethods.scroolElementWithUiSelector("Abonelikler Hakkında");
        }

    }

    @When("Kullanıcı kosullar ve gizlilik sayfasını acar")
    public void kullanıcıKosullarVeGizlilikSayfasınıAcar() {

        try {
            allpage.othersPage().privacyText.click();
        }catch (Exception e){
            ReusableMethods.scroolElementWithUiSelector("Koşullar ve Gizlilik");
        }

    }

    @When("Kullanıcı introyu tekrar oynat acar")
    public void kullanıcıIntroyuTekrarOynatAcar() {


        try {
            allpage.othersPage().playIntro.click();
        }catch (Exception e){
            ReusableMethods.scroolElementWithUiSelector("Introyu Tekrar Oynat");
        }
        ;
    }
}
