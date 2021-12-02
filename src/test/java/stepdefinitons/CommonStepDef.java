package stepdefinitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Allpage;

import static utilities.Driver.appiumDriver;

public class CommonStepDef {

    Allpage allpage = new Allpage();

    @When("Kullanıcı geri gelir")
    public void kullanıcıGeriGelir() {
        allpage.commonPage().backButton.click();
    }


    @And("Kullanıcı driver ile geri gelir")
    public void kullanıcıDriverIleGeriGelir() {
        appiumDriver.navigate().back();
    }



}
