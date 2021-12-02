package stepdefinitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Allpage;

import static utilities.Driver.appiumDriver;

public class MyWorksStepDef {

    Allpage allpage = new Allpage();

    @When("Kullanıcı myworks page acar")
    public void myWorkAcar() {
        allpage.myWorksPage().myWorksIcon.click();
    }

    @Then("Kullanıcı myworks acildigi dogrular")
    public void kullanıcıMyworksAcildigiDogrular() {

        Assert.assertEquals(allpage.myWorksPage().myWorksIcon.getAttribute("selected"), "true");
    }

    @And("Kullanıcı calisma olmadıgını dogrular {string}")
    public void kullanıcıCalismaOlmadıgınıDogrular(String expectedWithoutWorksText) {
        Assert.assertEquals(allpage.myWorksPage().withoutWorksText.getText(),
                expectedWithoutWorksText);
    }

    @When("Kullanıcı boyama yapmak icin baslama butonunda aksiyon alir")
    public void kullanıcıBoyamaYapmakIcinBaslamaButonundaAksiyonAlir() {
        allpage.myWorksPage().startPainting.click();
    }

    @And("Kullanıcı yaptigi calismanin eklendigini dogrular")
    public void kullanıcıYaptigiCalismaninEklendiginiDogrular() {

        Assert.assertTrue(allpage.homePage().templateImage.get(0).isDisplayed());
    }

    @When("Kullanıcı yaptıgı calismayi acar")
    public void kullanıcıYaptıgıCalismayiAcar() {
        allpage.homePage().templateImage.get(0).click();
    }

    @And("Kullanıcı calismasini paylasir")
    public void kullanıcıCalismasiniPaylasir() {

        allpage.myWorksPage().myWorksShare.click();
    }

    @And("Kullanıcı calismasina devam eder")
    public void kullanıcıCalismasinaDevamEder() {

        allpage.myWorksPage().continueButton.click();
    }

    @Then("Kullanıcı calisma sayfasinda oldugunu dogrular")
    public void kullanıcıCalismaSayfasindaOldugunuDogrular() {

        Assert.assertTrue(allpage.doneIconPage().doneIcon.isDisplayed());
    }

    @And("Kullanıcı calismasini siler")
    public void kullanıcıCalismasiniSiler() {
        allpage.myWorksPage().deleteButton.click();
    }

    @Then("Kullanıcı silme popup dogrular {string}")
    public void kullanıcıSilmePopupDogrular(String deleteText) {

        Assert.assertEquals(allpage.myWorksPage().deleteText.getText(),
                deleteText);
    }

    @Then("Kullanıcı resmin silinmedigini dogrular")
    public void kullanıcıResminSilinmediginiDogrular() {
        Assert.assertTrue(allpage.homePage().templateImage.get(0).isDisplayed());
    }

    @Then("Kullanıcı calismasinin silindigini dogrular")
    public void kullanıcıCalismasininSilindiginiDogrular() {

        Assert.assertTrue(allpage.myWorksPage().withoutWorksText.isDisplayed());
    }
}
