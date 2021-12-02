@iPaintApp
@categoriesPage
Feature: Kullanıcı kategori page de aksiyon almalı

  Background:
    Then Kullanıcı uygulamanın acıldıgını dogrular
    Then Kullanıcı devam et butonuna basarak sayfaları gectigini dogrular
    When Kullanıcı reklamı gecer
    Then Kullanıcı home page de olduğunu doğrular
    When Kullanıcı kategori sayfasini acar
    Then Kullanıcı kategori sayfasini actigini dogrular
    And  Kullanıcı title dogrular "Kategoriler"

  @categoriesTitle
  Scenario: Kategori isimleri görülemeli
    Then Kullanıcı kategori sayfasinda gelmesi gereken kategori basliklarini dogrular

  @categoriesPicAcces
  Scenario: Kullanıcı kategori resimlerine iki farkli yerden ulasabilmeli
    When Kullanıcı tumunu goster de aksiyon alarak kategori resimlerine ulasır
    Then Kullanıcı kategori detay sayfasinin acildigini dogrular
    When Kullanıcı crown iconu olmayan bir resmi acar
    Then Kullanıcı resimin acildigini dogrular
    When Kullanıcı driver ile geri gelir
    Then Kullanıcı kategori detay sayfasinin acildigini dogrular
    When Kullanıcı driver ile geri gelir
    Then Kullanıcı title dogrular "Kategoriler"
    Then Kullanıcı daha fazla resi gormek icin ilgili texti dogrular
    When Kullanıcı plus ikonu ile detay safasina gider
    Then Kullanıcı kategori detay sayfasinin acildigini dogrular
    When Kullanıcı driver ile geri gelir
    Then  Kullanıcı title dogrular "Kategoriler"























