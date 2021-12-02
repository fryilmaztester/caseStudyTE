@iPaintApp
@othersPage
Feature: Kullanıcı diğerleri page de aksiyon almalı

  Background:
    Then Kullanıcı uygulamanın acıldıgını dogrular
    Then Kullanıcı devam et butonuna basarak sayfaları gectigini dogrular
    When Kullanıcı reklamı gecer
    Then Kullanıcı home page de olduğunu doğrular
    When Kullanıcı digerleri sayfasini acar
    Then Kullanıcı digerleri sayfasini actigini dogrular
    And  Kullanıcı title dogrular "Diğerleri"

  @othersMainPage
  Scenario: Diğerli sayfasında bulunması gereken başlıklar
    Then Kullanıcı "Standart Hesap" kullandigini dogrular
    And Kullanıcı standart hesap aciklamasi dogrulanir "Sınırlı kullanım hakkı sunar."
    And Kullanıcı "Uygulama Dili" secebilecegini dogrular
    And Kullanıcı "İletişim" field dogrular
    And Kullanıcı "Uygulamayı Değerlendir" alanlarini dogrular


  @appLanguage
  Scenario Outline: Kullanıcı istedigi dil ile app i kullanabilmeli
    When Kullanıcı app dilini alir
    Then Kullanıcı default dilin "Türkçe" olduğunu dogrular
    When Kullanıcı ok ile dil degistirme sayfasina gider
    Then Kullanıcı dil degistirme sayfasının secili olan dil ile acildigini dogrular
    When Kullanıcı istedigi dilini secer "<Lang>"
    And Kullanıcı app dilini alir
    Then Kullanıcı "<Lang>" dilinin secildigini dogrular
    When Kullanıcı dil ile "<Lang>" dil degistirme sayfasına gider
    Then Kullanıcı dil degistirme sayfasının secili olan dil ile acildigini dogrular
    Examples:
      | Lang      |
      | Danish    |
      | Norwegian |

  @aboutApp
  Scenario: Kullanıcı abonelikler hakkında bilgi almalı
    When Kullanıcı abonelikler hakkında sayfasini acar
    Then  Kullanıcı title dogrular "Abonelikler Hakkında"
    When Kullanıcı geri gelir
    Then  Kullanıcı title dogrular "Diğerleri"

  @privacyText
  Scenario: Kullanıcı kosullar ve gizlilik hakkında bilgi almalı
    When Kullanıcı kosullar ve gizlilik sayfasını acar
    Then  Kullanıcı title dogrular "Koşullar ve Gizlilik"
    When Kullanıcı geri gelir
    Then  Kullanıcı title dogrular "Diğerleri"

  @introPlay
  Scenario: Kullanıcı introyu tekrardan izleyebilmeli
    When Kullanıcı introyu tekrar oynat acar
    Then Kullanıcı uygulamanın acıldıgını dogrular

































