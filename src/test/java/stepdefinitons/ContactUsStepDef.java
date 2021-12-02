package stepdefinitons;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Allpage;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

import static utilities.Driver.appiumDriver;

public class ContactUsStepDef {

    Allpage allpage = new Allpage();
    Faker faker;
    public String fakeEmailWithoutSign;
    public String message = "Uygulamaniz cok guzel";

    @When("Kullanıcı bize ulasin sayfasina gider")
    public void contactUsAcar() {
        allpage.contactUsPage().contactUsText.click();
    }

    @Then("Kullanıcı {string} sayfasın acildigini dogrular")
    public void kullanıcıSayfasınAcildiginiDogrular(String bizeUlasin) {
        Assert.assertEquals(allpage.contactUsPage().contactUsTitle.getText(),
                bizeUlasin);
    }

    @When("Kullanıcı bize yazin butonunda aksiyon alir")
    public void kullanıcıBizeYazinButonundaAksiyonAlir() {

        allpage.contactUsPage().openMessage.click();
    }


    @When("Kullanıcı gonder butonunda aksiyon alir")
    public void kullanıcıGonderButonundaAksiyonAlir() {

        try {
            allpage.contactUsPage().createScreenButton.click();
        }catch (org.openqa.selenium.NoSuchElementException e){
            appiumDriver.hideKeyboard();
            allpage.contactUsPage().createScreenButton.click();
        }

    }

    @Then("Kullanıcı hata mesajini dogrular")
    public void kullanıcıHataMesajiniDogrular() {

        appiumDriver.hideKeyboard();
        Assert.assertTrue(allpage.contactUsPage().textInPutError.get(0).getText().contains("Zorunlu"));
    }

    @When("Kullanıcı hatali mail girer")
    public void kullanıcıHataliMailGirer() {
        faker = new Faker();
        String fakeEmail = faker.internet().emailAddress();
        fakeEmailWithoutSign = fakeEmail.replace("@", "");
        allpage.contactUsPage().inputField.get(1).sendKeys(fakeEmailWithoutSign);
    }

    @Then("Kullanıcı email icin hata mesajini dogrular")
    public void kullanıcıEmailIcinHataMesajiniDogrular() {
        Assert.assertTrue(allpage.contactUsPage().textInPutError.get(1).getText().contains("geçerli bir mail"));
    }

    @Then("Kullanıcı sectigi konulari setledigini dogrular")
    public void kullanıcıSectigiKonulariSetlediginiDogrular() throws InterruptedException {

        List<String> expectedSubject = new ArrayList<>();
        expectedSubject.add("Konu");
        expectedSubject.add("Abonelik");
        expectedSubject.add("Özellikler");
        expectedSubject.add("Sorun Bildirme");
        expectedSubject.add("Yorum/Öneri");
        expectedSubject.add("Diğer");

        allpage.contactUsPage().selectBox.click();
        Thread.sleep(500);

        int sizeOfDropDown = allpage.contactUsPage().dropDownSubject.size();

        for (int i = 0; i < sizeOfDropDown; i++) {

            allpage.contactUsPage().dropDownSubject.get(i).click();
            ReusableMethods.waitForVisibilityDisplayed(allpage.contactUsPage().dropDownSubject.get(0), 5);
            Assert.assertEquals(allpage.contactUsPage().dropDownSubject.get(0).getText(),
                    expectedSubject.get(i));
            System.out.println(allpage.contactUsPage().dropDownSubject.get(0).getText());
            allpage.contactUsPage().dropDownSubject.get(0).click();
            Thread.sleep(500);
        }

    }

    @When("Kullanıcı isim alanina isim gonderir")
    public void kullanıcısIsimGirer() {

        ReusableMethods.waitForVisibility(allpage.contactUsPage().inputField.get(0),10);
        faker = new Faker();
        String fakeName = faker.name().firstName();
        allpage.contactUsPage().inputField.get(0).sendKeys(fakeName);
    }


    @When("Kullanıcı mail adresi girer")
    public void kullanıcıMailAdresiGirer() {

        faker = new Faker();
        String fakeEmail = faker.internet().emailAddress();

        if (allpage.contactUsPage().inputField.get(1).getText().equals(fakeEmailWithoutSign)) {
            allpage.contactUsPage().inputField.get(1).clear();
        }
        allpage.contactUsPage().inputField.get(1).sendKeys(fakeEmail);
    }

    @Then("Kullanıcı konu secim dropdown unun acildigini dogrular {string}")
    public void kullanıcıKonuSecimDropdownUnunAcildiginiDogrular(String six) {
        String dropDownSize = String.valueOf(allpage.contactUsPage().dropDownSubject.size());
        Assert.assertEquals(dropDownSize, six);

    }

    @And("Kullanıcı konu secer")
    public void kullanıcıKonuSecer() {

        appiumDriver.hideKeyboard();
        allpage.contactUsPage().dropDownSubject.get(0).click();
        ReusableMethods.waitFor(1);
        allpage.contactUsPage().dropDownSubject.get(1).click();
    }

    @When("Kullanıcı mesaj alanina mesaj gonderir {string}")
    public void kullanıcıMesajAlaninaMesajGonderir(String fy) {
        allpage.contactUsPage().textAreaEdit.sendKeys(fy);
    }

    @Then("Kullanıcı mesajın gonderildigini dogrular {string}")
    public void kullanıcıMesajınGonderildiginiDogrular(String tesekkurler) {
        Assert.assertEquals(allpage.contactUsPage().successScreen.getText(),
                tesekkurler);
    }

    @And("Kullanıcı mesaj alanina mesaj gonderir")
    public void kullanıcıMesajAlaninaMesajGonderir() {
        allpage.contactUsPage().textAreaEdit.sendKeys(message);
    }

    @When("Kullanıcı mesajlar sayfasina gider")
    public void kullanıcıMesajlarSayfasinaGider() {
        allpage.contactUsPage().succesOpenMessage.click();
    }

    @And("Kullanıcı default olarak mevcut tabının acildigini dogrular")
    public void kullanıcıDefaultOlarakMevcutTabınınAcildiginiDogrular() {

        Assert.assertEquals(allpage.contactUsPage().mevcutTabBar.getAttribute("selected"), "true");
    }

    @And("Kullanıcı gondermis oldugu mesajın en ustte oldugunu dogrular")
    public void kullanıcıGondermisOlduguMesajınEnUstteOldugunuDogrular() {

        Assert.assertEquals(allpage.contactUsPage().ticketSubject.get(0).getText(),
                message.toLowerCase());
    }

    @When("Kullanıcı gecmis tab barı acar")
    public void kullanıcıGecmisTabBarıAcar() {
        allpage.contactUsPage().gecmisTabBar.click();
    }

    @Then("Kullanıcı gecmis bar acildigini dogrular")
    public void kullanıcıGecmisBarAcildiginiDogrular() {

        Assert.assertEquals(allpage.contactUsPage().gecmisTabBar.getAttribute("selected"), "true");
    }

    @And("Kullanıcı cozulmemis talebinin olmadigini dogrular {string}")
    public void kullanıcıCozulmemisTalebininOlmadiginiDogrular(String expectedNoExpiredText) {
        Assert.assertEquals(allpage.contactUsPage().noExpiredTextEmpty.getText(),
                expectedNoExpiredText);
    }

    @When("Kullanıcı yeni bir ticket acmak icin plus ikonda aksiyon alir")
    public void kullanıcıYeniBirTicketAcmakIcinPlusIkondaAksiyonAlir() {

        allpage.contactUsPage().addNewTicket.click();
    }


    @Then("Kullanıcı yeni talep sayfasinin geldigini dogrular {string}")
    public void kullanıcıYeniTalepSayfasininGeldiginiDogrular(String newTicket) {
        Assert.assertEquals(allpage.contactUsPage().subTitlePreScreen.getText(),
                newTicket);
    }

    @When("Kullanıcı yukarı git butonuna tıklar")
    public void kullanıcıYukarıGitButonunaTıklar() {

        allpage.contactUsPage().yukarıGit.click();
    }
}
