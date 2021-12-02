package stepdefinitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.regexp.RE;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Allpage;
import utilities.ReusableMethods;

public class HomePageStepDef {

    Allpage allpage = new Allpage();
    public static WebDriverWait wait;


    @When("Kullanıcı reklamı gecer")
    public void homePageReklam() {

       // ReusableMethods.waitAndClick(allpage.homePage().homePageAdversitingClose);

        ReusableMethods.waitForVisibilityDisplayed(allpage.homePage().homePageAdversitingCloseAndroid,30);
        allpage.homePage().homePageAdversitingCloseAndroid.click();
    }

    @When("Kullanıcı home page acar")
    public void kullanıcıHomePageAcar() {

        allpage.homePage().homePageLocator.click();
    }

    @Then("Kullanıcı home page de olduğunu doğrular")
    public void kullanıcıHomePageDeOlduğunuDoğrular() {
        ReusableMethods.waitForVisibility(allpage.homePage().sliderImage, 10);
        Assert.assertEquals(allpage.homePage().homePageLocator.getAttribute("selected"), "true");
    }


    @When("Kullanıcı slider imagelerde swipe operator yapar")
    public void kullanıcıSliderImagelerdeSwipeOperatorYapar() {
        ReusableMethods.swipeOperator(0.88, 0.05, 0.15);
    }


    @And("Kullanıcı slider imagelerden herhangi birine gider")
    public void kullanıcıSliderImagelerdenHerhangiBirineGider() {
        allpage.homePage().sliderImage.click();
    }

    @Then("Kullanıcı slider imagelere gittigini dogrular")
    public void kullanıcıSliderImagelereGittiginiDogrular() {
        Assert.assertTrue(allpage.homePage().toolBarTitle.isDisplayed());
    }


    @When("Crown ikonlu resime tıklar")
    public void crownIkonluResimeTıklanır() {

        /*

        Ekran küçük olduğu zaman
        eğer cown iconlu resim gelmez ise scroll işlemi yapıalcaktır.

         */
        do {
            try {
                allpage.homePage().crownIcon.click();
                break;
            } catch (NoSuchElementException e) {
                ReusableMethods.scrollElement(0.5, 0.2, 0.4);
            }
        } while (ReusableMethods.waitForVisibilityDisplayed(allpage.homePage().crownIcon,20));


    }

    @Then("Adversiting popup geldigi onaylanır {string}")
    public void adversitingPopupGeldigiOnaylanır(String adeversitingPopUpText) {
        ReusableMethods.waitForVisibility(allpage.homePage().rewardPopUpDetail,5);
        Assert.assertEquals(allpage.homePage().rewardPopUpDetail.getText(),adeversitingPopUpText);
    }


    @When("Adversiting popup kapatır")
    public void adversitingPopupKapatır() {
        allpage.homePage().rewardCancel.click();
    }

    @And("Kullanıcı {string} tıklar")
    public void kullanıcıTıklanır(String str) {
        ReusableMethods.textWithClick(str);
    }

    @When("Kullanıcı crown iconu olmayan bir resmi acar")
    public void kullanıcıCrownIconuOlmayanBirResmiAcar() {
        allpage.homePage().templateImage.get(0).click();
    }



}

