@iPaintApp
@myWorksPage
Feature: Kullanıcı calismalarim page de aksiyon almalı

  Background:
    Then Kullanıcı uygulamanın acıldıgını dogrular
    Then Kullanıcı devam et butonuna basarak sayfaları gectigini dogrular
    When Kullanıcı reklamı gecer
    Then Kullanıcı home page de olduğunu doğrular

  @myWorksWithout
  Scenario: Kullanıcı calisma yapmamissa calisma sayfasindan home page ulasabilmeli
    When Kullanıcı myworks page acar
    Then Kullanıcı myworks acildigi dogrular
    And Kullanıcı title dogrular "Çalışmalarım"
    And Kullanıcı calisma olmadıgını dogrular "Tühhh! Henüz hiçbir boyaman yok."
    When Kullanıcı boyama yapmak icin baslama butonunda aksiyon alir
    Then Kullanıcı title dogrular "Kategoriler"

  @notPaintingSave
  Scenario: Kullanıcı herhangi bir islem yapmadigi resmi kaydetmemeli
    When Kullanıcı myworks page acar
    Then Kullanıcı myworks acildigi dogrular
    And Kullanıcı calisma olmadıgını dogrular "Tühhh! Henüz hiçbir boyaman yok."
    When Kullanıcı home page acar
    And Kullanıcı crown iconu olmayan bir resmi acar
    And Kullanıcı done icon acar
    And Kullanıcı "Kaydet" tıklar
    And Kullanıcı myworks page acar
    Then Kullanıcı calisma olmadıgını dogrular "Tühhh! Henüz hiçbir boyaman yok."

  @paintAndSave
  Scenario: Kullanıcı islem yaptigi resimleri calismalarim sayfasina save edebilmeli
    When Kullanıcı myworks page acar
    Then Kullanıcı myworks acildigi dogrular
    And Kullanıcı calisma olmadıgını dogrular "Tühhh! Henüz hiçbir boyaman yok."
    When Kullanıcı home page acar
    And Kullanıcı crown iconu olmayan bir resmi acar
    And Kullanıcı alt bardan renk secer
    Then Kullanıcı renk secildigini dogrular
    When Kullanıcı resmin herhangi bir yerine boyama islemi yapar
    And Kullanıcı done icon acar
    And Kullanıcı "Kaydet" tıklar
    And Kullanıcı myworks page acar
    Then Kullanıcı myworks acildigi dogrular
    And Kullanıcı yaptigi calismanin eklendigini dogrular

  @savedPicShare
  Scenario: Kullanıcı islem yaptigi resimleri calismalarim sayfasindan paylasabilmeli
    When Kullanıcı myworks page acar
    Then Kullanıcı myworks acildigi dogrular
    And Kullanıcı calisma olmadıgını dogrular "Tühhh! Henüz hiçbir boyaman yok."
    When Kullanıcı home page acar
    And Kullanıcı crown iconu olmayan bir resmi acar
    And Kullanıcı alt bardan renk secer
    Then Kullanıcı renk secildigini dogrular
    When Kullanıcı resmin herhangi bir yerine boyama islemi yapar
    And Kullanıcı done icon acar
    And Kullanıcı "Kaydet" tıklar
    And Kullanıcı myworks page acar
    Then Kullanıcı myworks acildigi dogrular
    And Kullanıcı yaptigi calismanin eklendigini dogrular
    When Kullanıcı yaptıgı calismayi acar
    And Kullanıcı calismasini paylasir
    Then Kullanıcı title dogrular "Paylaş"
    When Kullanıcı geri gelir
    Then Kullanıcı title dogrular "Çalışmalarım"

  @savedPicContinuePainting
  Scenario: Kullanıcı islem yaptigi resimleri calismalarim sayfasindan boyamaya devam edebilmeli
    When Kullanıcı myworks page acar
    Then Kullanıcı myworks acildigi dogrular
    And Kullanıcı calisma olmadıgını dogrular "Tühhh! Henüz hiçbir boyaman yok."
    When Kullanıcı home page acar
    And Kullanıcı crown iconu olmayan bir resmi acar
    And Kullanıcı alt bardan renk secer
    Then Kullanıcı renk secildigini dogrular
    When Kullanıcı resmin herhangi bir yerine boyama islemi yapar
    And Kullanıcı done icon acar
    And Kullanıcı "Kaydet" tıklar
    And Kullanıcı myworks page acar
    Then Kullanıcı myworks acildigi dogrular
    And Kullanıcı yaptigi calismanin eklendigini dogrular
    When Kullanıcı yaptıgı calismayi acar
    And Kullanıcı calismasina devam eder
    Then Kullanıcı calisma sayfasinda oldugunu dogrular
    When Kullanıcı driver ile geri gelir
    Then Kullanıcı title dogrular "Çalışmalarım"

  @savedPicAndDeletePic
  Scenario: Kullanıcı islem yaptigi resimleri calismalarim sayfasindan silebilmeli
    When Kullanıcı myworks page acar
    Then Kullanıcı myworks acildigi dogrular
    And Kullanıcı calisma olmadıgını dogrular "Tühhh! Henüz hiçbir boyaman yok."
    When Kullanıcı home page acar
    And Kullanıcı crown iconu olmayan bir resmi acar
    And Kullanıcı alt bardan renk secer
    Then Kullanıcı renk secildigini dogrular
    When Kullanıcı resmin herhangi bir yerine boyama islemi yapar
    And Kullanıcı done icon acar
    And Kullanıcı "Kaydet" tıklar
    And Kullanıcı myworks page acar
    Then Kullanıcı myworks acildigi dogrular
    And Kullanıcı yaptigi calismanin eklendigini dogrular
    When Kullanıcı yaptıgı calismayi acar
    And Kullanıcı calismasini siler
    Then Kullanıcı silme popup dogrular "Bu resmi çalışmalarından silmek istediğine emin misin?"
    When Kullanıcı "VAZGEÇ" tıklar
    Then Kullanıcı resmin silinmedigini dogrular
    When Kullanıcı yaptıgı calismayi acar
    And Kullanıcı calismasini siler
    And Kullanıcı "TAMAM" tıklar
    Then Kullanıcı calismasinin silindigini dogrular








