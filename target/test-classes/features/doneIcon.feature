@iPaintApp
@doneIconPage
Feature: Kullanıcı done icon page de aksiyon almalı

  Background:
    Then Kullanıcı uygulamanın acıldıgını dogrular
    Then Kullanıcı devam et butonuna basarak sayfaları gectigini dogrular
    When Kullanıcı reklamı gecer
    Then Kullanıcı home page de olduğunu doğrular
    When Kullanıcı crown iconu olmayan bir resmi acar
    And Kullanıcı done icon acar

  @doneIcon
  Scenario: Kullanıcı done iconda aksiyon alabilmeli
    Then Kullanıcı title dogrular "Paylaş"
    And  Kullanıcı filigran dogrular
    When Kullanıcı background barında swipe islemi yapar


  @doneIconPaylas
  Scenario: Kullanıcı pic paylasabilmeli
    When Kullanıcı paylasmak icin alt barda bulunan paylas butonuna tıklar
    Then Kullanıcı paylasmak icin page acildigini dogrular
    When Kullanıcı driver ile geri gelir

