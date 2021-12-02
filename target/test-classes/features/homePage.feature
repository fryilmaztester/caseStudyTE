@iPaintApp
@homePage
Feature: Kullanıcı home page de aksiyon almalı

  Background:
    Then Kullanıcı uygulamanın acıldıgını dogrular
    Then Kullanıcı devam et butonuna basarak sayfaları gectigini dogrular
    When Kullanıcı reklamı gecer
    Then Kullanıcı home page de olduğunu doğrular

  @sliderImage
  Scenario: Slider image
    When Kullanıcı slider imagelerde swipe operator yapar
    And Kullanıcı slider imagelerden herhangi birine gider
    Then Kullanıcı slider imagelere gittigini dogrular
    When Kullanıcı geri gelir
    Then Kullanıcı home page de olduğunu doğrular

  @crownIcon
  Scenario: Crown ıconlu resimleri sadece premium uyeler gorebilmeli
    When Crown ikonlu resime tıklar
    Then Adversiting popup geldigi onaylanır "Reklam izleyerek bu içeriği ücretsiz boyamaya başlayabilirsin."
    When Adversiting popup kapatır
    Then Kullanıcı home page de olduğunu doğrular
    When Crown ikonlu resime tıklar
    And Kullanıcı "ABONE OL" tıklar
    And Kullanıcı reklamı gecer
    Then Kullanıcı home page de olduğunu doğrular
    When Crown ikonlu resime tıklar
    And Kullanıcı "VİDEO İZLE" tıklar
    And Kullanıcı driver ile geri gelir




















