package stepdefinitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Allpage;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class CategoriesStepDef {

    Allpage allpage = new Allpage();


    @When("Kullanıcı kategori sayfasini acar")
    public void doneIconAcar() {
       allpage.categoriesPage().categoriesIcon.click();
    }

    @Then("Kullanıcı kategori sayfasini actigini dogrular")
    public void kullanıcıKategoriSayfasiniActiginiDogrular() {
        Assert.assertEquals(allpage.categoriesPage().categoriesIcon.getAttribute("selected"), "true");
    }

    @Then("Kullanıcı kategori sayfasinda gelmesi gereken kategori basliklarini dogrular")
    public void kullanıcıKategoriSayfasindaGelmesiGerekenKategoriBasliklariniDogrular() {

        List<String> expectedCategoriesTitle = new ArrayList<>();
        expectedCategoriesTitle.add("Kış");
        expectedCategoriesTitle.add("İnsanlar");
        expectedCategoriesTitle.add("Mandala");
        expectedCategoriesTitle.add("Hayvanlar");
        expectedCategoriesTitle.add("Yemekler");
        expectedCategoriesTitle.add("Kuşlar");
        expectedCategoriesTitle.add("Kolay");
        expectedCategoriesTitle.add("Kültür");
        expectedCategoriesTitle.add("Kelebekler");
        expectedCategoriesTitle.add("Kediler");
        expectedCategoriesTitle.add("Moda");
        expectedCategoriesTitle.add("Çiçekler");
        expectedCategoriesTitle.add("Modeller");
        expectedCategoriesTitle.add("Fantastik");
        expectedCategoriesTitle.add("Su Dünyası");
        expectedCategoriesTitle.add("Mesaj");
        expectedCategoriesTitle.add("Burçlar");
        expectedCategoriesTitle.add("Manzara");
        expectedCategoriesTitle.add("Köpekler");

        List<String> actualCategoriesTitle = new ArrayList<>();

        do {
            try {
                allpage.categoriesPage().dogTitle.isDisplayed();
                if (allpage.categoriesPage().dogTitle.isDisplayed()){
                    actualCategoriesTitle.add(allpage.categoriesPage().dogTitle.getText());
                }
                break;
            }catch (org.openqa.selenium.NoSuchElementException e){
                allpage.categoriesPage().categoryName.
                        stream().
                        map(t->t.getText()).
                        forEach(t->actualCategoriesTitle.add(t));
                ReusableMethods.scrollElement(0.5,0.9,0.3);
            }

        }while (ReusableMethods.invisibilityOfElementLocat(allpage.categoriesPage().dogTitleBy));


        List<String> actualCategoriesTitleDistinct = new ArrayList<>();
        actualCategoriesTitle.
                stream().
                distinct().
                forEach(t->actualCategoriesTitleDistinct.add(t));

        Assert.assertTrue(actualCategoriesTitleDistinct.get(0).contains("Mutlu"));
        actualCategoriesTitleDistinct.removeIf(t->t.contains("Mutlu Yıllar"));

        Assert.assertEquals(actualCategoriesTitleDistinct,expectedCategoriesTitle);





    }


    @When("Kullanıcı tumunu goster de aksiyon alarak kategori resimlerine ulasır")
    public void kullanıcıTumunuGosterDeAksiyonAlarakKategoriResimlerineUlasır() {
        allpage.categoriesPage().showAll.get(0).click();
    }

    @Then("Kullanıcı kategori detay sayfasinin acildigini dogrular")
    public void kullanıcıKategoriDetaySayfasininAcildiginiDogrular() {

        Assert.assertTrue(allpage.categoriesPage().categoryDetail.isDisplayed());
    }

    @Then("Kullanıcı resimin acildigini dogrular")
    public void kullanıcıResiminAcildiginiDogrular() {

        Assert.assertTrue(allpage.pictureDetailsPage().refreshButton.isDisplayed());
    }

    @And("Kullanıcı plus ikonu ile detay safasina gider")
    public void kullanıcıPlusIkonuIleDetaySafasinaGider() {
        allpage.categoriesPage().morePicture.get(0).click();
    }
    @Then("Kullanıcı daha fazla resi gormek icin ilgili texti dogrular")
    public void kullanıcıDahaFazlaResiGormekIcinIlgiliTextiDogrular() {
        Assert.assertTrue(allpage.categoriesPage().moreText.getText().contains("boyanacak resim daha"));
    }
}
