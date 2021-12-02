package stepdefinitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Allpage;
import utilities.ReusableMethods;

import static utilities.Driver.appiumDriver;

public class PictureDetailsStepDef {

    Allpage allpage = new Allpage();
    WebDriverWait wait;

    @And("Kullanıcı home page geri gelir")
    public void homePageBack(){

        allpage.pictureDetailsPage().pictureDetailBackButton.click();

        try{
            Assert.assertTrue(allpage.homePage().templateImage.get(0).isDisplayed());
        }catch (Exception e){

            /*
            ReusableMethods.waitForVisibility(allpage.commonPage().countdownCloseContainer,30);
            allpage.commonPage().countdownCloseContainer.click();
             */
            appiumDriver.navigate().back();
        }

    }

    @And("Kullanıcı refresh yapar")
    public void kullanıcıRefreshYapar() {
        allpage.pictureDetailsPage().refreshButton.click();
    }

    @Then("Kullanıcı reload page deki text i dogrular {string}")
    public void kullanıcıReloadPageDekiTextIDogrular(String yenidenBaslamak) {

        Assert.assertEquals(allpage.pictureDetailsPage().reloadText.getText(),
                yenidenBaslamak);
    }

    @When("Kullanıcı paleti acar")
    public void kullanıcıPaletiAcar() {

        allpage.pictureDetailsPage().palette.click();
    }

    @Then("Kullanıcı dialog title dogrular {string}")
    public void kullanıcıDialogTitleDogrular(String renkPaletleri) {

        Assert.assertEquals(allpage.commonPage().dialogTitle.getText(),
                renkPaletleri);
    }

    @When("Kullanıcı add islemi yapabilmek icin scroll islemi yapar")
    public void kullanıcıDigerPaletleriGormekIcinScrollIslemiYapar() {


        do {
            try {
                allpage.pictureDetailsPage().add.isDisplayed();
                break;
            }catch (Exception e){
                ReusableMethods.scrollElement(0.5,0.6,0.35);
            }
        }while (ReusableMethods.invisibilityOfElementLocat(allpage.pictureDetailsPage().addBy));



    }


    @And("Kullanıcı add islemi icin add butonuna tıklar")
    public void kullanıcıAddIslemiIcinAddButonunaTıklar() {

        allpage.pictureDetailsPage().add.click();
    }

    @And("Kullanıcı en son daki kutuya tıklar")
    public void kullanıcıEnSonDakiKutuyaTıklar() {

        ReusableMethods.waitFor(2);
        allpage.pictureDetailsPage().colorOne.get(allpage.pictureDetailsPage().colorOne.size()-1).click();

        allpage.pictureDetailsPage().colorNine.
                get(allpage.pictureDetailsPage().colorNine.size()-1).click();
    }

    @Then("Kullanıcı renk penceresinin acildigini dogrular {string}")
    public void kullanıcıRenkPenceresininAcildiginiDogrular(String rengiSec) {
        Assert.assertEquals(allpage.pictureDetailsPage().title.getText(),rengiSec);
    }

    @When("Kullanıcı renk paletinde gesture yapar")
    public void kullanıcıRenkPaletindeGestureYapar() {

        ReusableMethods.swipeOperator(0.2,0.7,0.3);
    }

    @And("Kullanıcı trasnparency de gesture yapar")
    public void kullanıcıTrasnparencyDeGestureYapar() {
        ReusableMethods.swipeOperator(0.2,0.45,0.55);
    }

    @And("Kullanıcı paleti siler")
    public void kullanıcıPaletiSiler() {

        allpage.pictureDetailsPage().deletePalette.click();
    }

    @When("Kullanıcı paletti save eder")
    public void kullanıcıPalettiSaveEder() {
        allpage.pictureDetailsPage().savePalette.click();
    }

    @And("Kullanıcı alt bardan renk secer")
    public void kullanıcıAltBardanRenkSecer() {

        ReusableMethods.tapGestureWithElement(allpage.pictureDetailsPage().sunBarColorFive);
    }

    @Then("Kullanıcı renk secildigini dogrular")
    public void kullanıcıRenkSecildiginiDogrular() {

        ReusableMethods.waitFor(1);
        Assert.assertEquals(allpage.pictureDetailsPage().indicatorFive.getAttribute("clickable"),
                "false");
    }


    @When("Kullanıcı alt tabdan ana rengi secer")
    public void kullanıcıAltTabdanAnaRengiSecer() {

        allpage.pictureDetailsPage().mainColor.get(5).click();
    }

    @Then("Kullanıcı ana rengin secildigini dogrular")
    public void kullanıcıAnaRenginSecildiginiDogrular() {
        Assert.assertEquals(allpage.pictureDetailsPage().mainColor.get(3).getAttribute("selected"),
                "true");

    }

    @Then("Kullanıcı undo buttonun kullanılamaz oldugunu dogrular")
    public void kullanıcıUndoButtonunKullanılamazOldugunuDogrular() {

        Assert.assertEquals(allpage.pictureDetailsPage().undoButton.getAttribute("enabled"),"true");

    }

    @And("Kullanıcı redo buttonun kullanılamaz oldugunu dogrular")
    public void kullanıcıRedoButtonunKullanılamazOldugunuDogrular() {
        Assert.assertEquals(allpage.pictureDetailsPage().redoButton.getAttribute("enabled"),"false");
    }

    @And("Kullanıcı resmin herhangi bir yerine boyama islemi yapar")
    public void kullanıcıResminHerhangiBirYerineBoyamaIslemiYapar() {

        ReusableMethods.tapGestureWithPoint(0.6,0.45);
    }

    @Then("Kullanıcı undo butonu kullanabilecegini dogrular")
    public void kullanıcıUndoButonuKullanabileceginiDogrular() {

        Assert.assertEquals(allpage.pictureDetailsPage().undoButton.getAttribute("enabled"),"true");
    }

    @When("Kullanıcı undo islemi yapar")
    public void kullanıcıUndoIslemiYapar() {

        allpage.pictureDetailsPage().undoButton.click();
    }

    @Then("Kullanıcı redo butonu kullanabilecegini dogrular")
    public void kullanıcıRedoButonuKullanabileceginiDogrular() {
        Assert.assertEquals(allpage.pictureDetailsPage().redoButton.getAttribute("enabled"),"true");
    }

    @When("Kullanıcı redo islemi yapar")
    public void kullanıcıRedoIslemiYapar() {

        allpage.pictureDetailsPage().redoButton.click();
    }

    @Then("Kullanıcı undo butonunun enable olmadıgını dogrular")
    public void kullanıcıUndoButonununEnableOlmadıgınıDogrular() {

        Assert.assertEquals(allpage.pictureDetailsPage().undoButton.getAttribute("enabled"),"false");
    }

    @Then("Kullanıcı redo butonunun enable olmadıgını dogrular")
    public void kullanıcıRedoButonununEnableOlmadıgınıDogrular() {
        Assert.assertEquals(allpage.pictureDetailsPage().redoButton.getAttribute("enabled"),"false");
    }



}
