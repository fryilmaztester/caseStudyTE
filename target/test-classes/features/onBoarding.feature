@iPaintApp
@onBoardingPage
Feature: Kullanıcı onboarding ekranını gormeli

  Background:
    Then Kullanıcı uygulamanın acıldıgını dogrular

  @swipeİslemiVeMetinVerify
  Scenario: Kullanıcı onboarding ekranınında swipe islemi yapar
    Then Kullanıcı swipe islemi yaparak metninleri ve basliklari dogrular

  @devamEtButonu
  Scenario: Kullanıcı onboarding ekranında devam et butonu ile gecer
    Then Kullanıcı devam et butonuna basarak sayfaları gectigini dogrular


