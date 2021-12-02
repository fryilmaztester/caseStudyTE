package stepdefinitons;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Allpage;
import utilities.ReusableMethods;

public class RateAppStepDef {

    Allpage allpage = new Allpage();

    @When("Kullanıcı uygulama degerlendirme sayfasını acar")
    public void rateAppAcar() {
        ReusableMethods.addCloseMethod(allpage.rateAppPage().rateAppLocator);
    }

    @Then("Kullanıcı rate app page acildigini dogrular {string}")
    public void kullanıcıRateAppPageAcildiginiDogrular(String expectedRateAppText) {
        Assert.assertEquals(allpage.rateAppPage().rateAppText.getText(), expectedRateAppText);
    }

    @When("Kullanıcı rate verir")
    public void kullanıcıRateVerir() {

        allpage.rateAppPage().starSize.get(5).click();
    }

    @Then("Kullanıcı rate yaptigini dogrular")
    public void kullanıcıRateYaptiginiDogrular() {
        Assert.assertTrue(allpage.rateAppPage().playStore.isDisplayed());
    }
}
