package stepdefinitons;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.Allpage;
import utilities.ReusableMethods;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class OnBoardingStepDef {


    Allpage allpage = new Allpage();
    String[] onBoardingText =

            {
                    "Birbirinden harika resim koleksiyonumuzdan dilediğinizi seçin ve boyayarak rahatlayın.",
                    "Yaratıcılığınızı konuşturun! Tasarlayacağınız resimleri arkadaşlarınızla paylaşın ve beğeni toplayın.",
                    "Birbirinden harika renk paletlerini keşfedin. Artık hazırsınız."
            };

    String[] headerTextDetail = {
            "Rahatlayın",
            "Yaratıcı Olun",
            "Muhteşem Paletler"
    };

    @Then("Kullanıcı uygulamanın acıldıgını dogrular")
    public void uygulamaAcildigiVerify() {
        ReusableMethods.waitForVisibility(allpage.onBoardingPage().onBoardingbackGroundImage, 5);
        Assert.assertTrue(allpage.onBoardingPage().onBoardingbackGroundImage.isDisplayed());
    }


    @Then("Kullanıcı swipe islemi yaparak metninleri ve basliklari dogrular")
    public void swipeIslemiYaparakTextMetinDogrulama() {

        /*
        ReusableMethods.invisibilityOfElementLocat(allpage.onBoardingPage().headerTextEnd) metodu ile
        birlikte son başlık gelen kadar swipe yapıalbilir.
         */

        int i = 0;
        do {

            allpage.softAssert().assertEquals(allpage.onBoardingPage().detailText.getText(), onBoardingText[i]);
            allpage.softAssert().assertEquals(allpage.onBoardingPage().headerText.getText(), headerTextDetail[i]);
            allpage.softAssert().assertAll();
            ReusableMethods.swipeOperator(0.88, 0.05, 0.5);
            i++;

        } while (i < 2);


    }


    @Then("Kullanıcı devam et butonuna basarak sayfaları gectigini dogrular")
    public void devamEtButonu() {

        int i;

        for (i = 0; i < 2; i++) {
            allpage.onBoardingPage().skipButton.click();
            ReusableMethods.waitForVisibility(allpage.onBoardingPage().headerText, 5);
            allpage.softAssert().assertAll();
        }

        if (i == 2) {
            allpage.onBoardingPage().skipButton.click();
        }

    }


}
