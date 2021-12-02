@iPaintApp
@contactUsPage
Feature: Kullanıcı bize ulasın page de aksiyon almalı

  Background:
    Then Kullanıcı uygulamanın acıldıgını dogrular
    Then Kullanıcı devam et butonuna basarak sayfaları gectigini dogrular
    When Kullanıcı reklamı gecer
    Then Kullanıcı home page de olduğunu doğrular
    When Kullanıcı digerleri sayfasini acar
    Then Kullanıcı digerleri sayfasini actigini dogrular
    And  Kullanıcı title dogrular "Diğerleri"
    When Kullanıcı bize ulasin sayfasina gider
    Then Kullanıcı "Bize Ulaşın" sayfasın acildigini dogrular

  @contactUsEmpty
  Scenario: Kullanıcı bize ulasın sayfasını doldurmadan mesaj iletememeli
    When Kullanıcı bize yazin butonunda aksiyon alir
    When Kullanıcı gonder butonunda aksiyon alir
    Then Kullanıcı hata mesajini dogrular
    When Kullanıcı hatali mail girer
    Then Kullanıcı email icin hata mesajini dogrular
    When Kullanıcı isim alanina isim gonderir
    And  Kullanıcı mail adresi girer
    And  Kullanıcı konu secer
    And  Kullanıcı gonder butonunda aksiyon alir
    Then Kullanıcı hata mesajini dogrular
    When Kullanıcı mesaj alanina mesaj gonderir "fy"
    Then Kullanıcı hata mesajini dogrular


  @contactUsSubject
  Scenario: Kullanıcı sectigi konunun setleyebilmeli
    When Kullanıcı bize yazin butonunda aksiyon alir
    Then Kullanıcı sectigi konulari setledigini dogrular

  @contactUsNonSubject
  Scenario: Kullanıcı konu secmediginde dropdown acilmali
    When Kullanıcı bize yazin butonunda aksiyon alir
    When Kullanıcı isim alanina isim gonderir
    And  Kullanıcı mail adresi girer
    And Kullanıcı gonder butonunda aksiyon alir
    Then Kullanıcı konu secim dropdown unun acildigini dogrular "6"

  @contactUsHappyPath
  Scenario: Kullanıcı bize ulasın alanında mesaj gonderebilmeli
    When Kullanıcı bize yazin butonunda aksiyon alir
    When Kullanıcı isim alanina isim gonderir
    And  Kullanıcı mail adresi girer
    And  Kullanıcı konu secer
    And  Kullanıcı gonder butonunda aksiyon alir
    And Kullanıcı mesaj alanina mesaj gonderir
    And Kullanıcı gonder butonunda aksiyon alir
    Then Kullanıcı mesajın gonderildigini dogrular "Teşekkürler"

  @contactUsSupport
  Scenario: Kullanıcı basrali sekilde mesaj gonderdikten sonra taleplerine ulasabilmeli
    When Kullanıcı bize yazin butonunda aksiyon alir
    When Kullanıcı isim alanina isim gonderir
    And  Kullanıcı mail adresi girer
    And  Kullanıcı konu secer
    And  Kullanıcı gonder butonunda aksiyon alir
    And  Kullanıcı mesaj alanina mesaj gonderir
    And  Kullanıcı gonder butonunda aksiyon alir
    Then Kullanıcı mesajın gonderildigini dogrular "Teşekkürler"
    When Kullanıcı mesajlar sayfasina gider
    Then Kullanıcı "Destek Taleplerim" sayfasın acildigini dogrular
    And Kullanıcı default olarak mevcut tabının acildigini dogrular
    And Kullanıcı gondermis oldugu mesajın en ustte oldugunu dogrular
    When Kullanıcı gecmis tab barı acar
    Then Kullanıcı gecmis bar acildigini dogrular
    And Kullanıcı cozulmemis talebinin olmadigini dogrular "Çözülmemiş destek talebiniz bulunmamaktadır."
    When Kullanıcı yeni bir ticket acmak icin plus ikonda aksiyon alir
    Then Kullanıcı yeni talep sayfasinin geldigini dogrular "Yeni bir mesaj gönder"
    When Kullanıcı yukarı git butonuna tıklar
    Then Kullanıcı "Destek Taleplerim" sayfasın acildigini dogrular
    When Kullanıcı yukarı git butonuna tıklar
    Then  Kullanıcı title dogrular "Diğerleri"
