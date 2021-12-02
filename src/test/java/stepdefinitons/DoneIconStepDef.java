package stepdefinitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Allpage;
import utilities.ReusableMethods;

import static utilities.Driver.appiumDriver;


public class DoneIconStepDef {


    Allpage allpage = new Allpage();

    @When("Kullanıcı done icon acar")
    public void doneIconAcar() {
        ReusableMethods.addCloseMethod(allpage.doneIconPage().doneIcon);
    }


    @Then("Kullanıcı title dogrular {string}")
    public void kullanıcıTitleDogrular(String paylas) {
        Assert.assertEquals(allpage.homePage().toolBarTitle.getText(),paylas);
    }

    @And("Kullanıcı filigran dogrular")
    public void kullanıcıFiligranDogrular() {

        Assert.assertTrue(allpage.doneIconPage().filigran.isDisplayed());
    }

    @When("Kullanıcı background barında swipe islemi yapar")
    public void kullanıcıBackgroundBarındaSwipeIslemiYapar() {

        ReusableMethods.swipeOperator(0.85,0.35,0.85);
    }

    @When("Kullanıcı paylasmak icin alt barda bulunan paylas butonuna tıklar")
    public void kullanıcıPaylasmakIcinAltBardaBulunanPaylasButonunaTıklar() {

        allpage.doneIconPage().shareButton.click();
    }

    @Then("Kullanıcı paylasmak icin page acildigini dogrular")
    public void kullanıcıPaylasmakIcinPageAcildiginiDogrular() {
        ReusableMethods.waitForVisibility(allpage.doneIconPage().shareText,10);
        String expectedText = "İletişim uygulamalarında iletişim kurduktan sonra burada kişilerle paylaşım yapabilirsiniz.";
        Assert.assertEquals(allpage.doneIconPage().shareText.getText(),expectedText);
    }
}
