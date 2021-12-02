@iPaintApp
@picDetailsPage
Feature: Kullanıcı home page de aksiyon almalı

  Background:
    Then Kullanıcı uygulamanın acıldıgını dogrular
    Then Kullanıcı devam et butonuna basarak sayfaları gectigini dogrular
    When Kullanıcı reklamı gecer
    Then Kullanıcı home page de olduğunu doğrular

  @withoutCrownIcon
  Scenario: Kullanıcı crown iconsuz resimlerde islem yapabilmeli
    When Kullanıcı crown iconu olmayan bir resmi acar
    And Kullanıcı home page geri gelir
    Then Kullanıcı home page de olduğunu doğrular
    When Kullanıcı crown iconu olmayan bir resmi acar
    And Kullanıcı refresh yapar
    Then Kullanıcı reload page deki text i dogrular "Yeniden başlamak istediğine emin misin?"
    When Kullanıcı "Vazgeç" tıklar
    And Kullanıcı refresh yapar
    And Kullanıcı "Tamam" tıklar
    And Kullanıcı paleti acar
    Then Kullanıcı dialog title dogrular "Renk Paletleri"
    When Kullanıcı add islemi yapabilmek icin scroll islemi yapar
    And  Kullanıcı add islemi icin add butonuna tıklar
    And Kullanıcı en son daki kutuya tıklar
    Then Kullanıcı renk penceresinin acildigini dogrular "Rengi Seç"
    When Kullanıcı renk paletinde gesture yapar
    And Kullanıcı trasnparency de gesture yapar
    And Kullanıcı paleti siler
    Then Kullanıcı dialog title dogrular "Renk Paletleri"
    And  Kullanıcı add islemi icin add butonuna tıklar
    And Kullanıcı en son daki kutuya tıklar
    When Kullanıcı paletti save eder
    Then Kullanıcı dialog title dogrular "Renk Paletleri"
    When Kullanıcı driver ile geri gelir
    And Kullanıcı alt bardan renk secer
    Then Kullanıcı renk secildigini dogrular
    When Kullanıcı alt tabdan ana rengi secer
    Then Kullanıcı ana rengin secildigini dogrular

  @undoAndRedoButton
  Scenario: Kullanıcı undo ve redo buttonlarını kullabilmeli
    When Kullanıcı crown iconu olmayan bir resmi acar
    Then Kullanıcı undo buttonun kullanılamaz oldugunu dogrular
    And Kullanıcı alt bardan renk secer
    And Kullanıcı resmin herhangi bir yerine boyama islemi yapar
    And Kullanıcı redo buttonun kullanılamaz oldugunu dogrular
    When Kullanıcı undo islemi yapar
    Then Kullanıcı undo butonunun enable olmadıgını dogrular
    And Kullanıcı redo butonu kullanabilecegini dogrular
    When Kullanıcı redo islemi yapar
    Then Kullanıcı redo butonunun enable olmadıgını dogrular