@iPaintApp
@rateAppPage
Feature: Kullanıcı app i degerlendirmeli

  Background:
    Then Kullanıcı uygulamanın acıldıgını dogrular
    Then Kullanıcı devam et butonuna basarak sayfaları gectigini dogrular
    When Kullanıcı reklamı gecer
    Then Kullanıcı home page de olduğunu doğrular
    When Kullanıcı digerleri sayfasini acar
    Then Kullanıcı digerleri sayfasini actigini dogrular
    And  Kullanıcı title dogrular "Diğerleri"


  @rateApp
  Scenario: Kategori uygulamayı degerlendirebilmeli
    When Kullanıcı uygulama degerlendirme sayfasını acar
    Then Kullanıcı rate app page acildigini dogrular "Bize kaç yıldız veriyorsun?"
    When Kullanıcı rate verir
    Then Kullanıcı rate yaptigini dogrular


























