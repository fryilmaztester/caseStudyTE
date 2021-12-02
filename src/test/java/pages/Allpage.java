package pages;


import org.testng.asserts.SoftAssert;


public class Allpage {


    public Allpage() {

    }

    private OnBoardingPage onBoardingPage;
    private SoftAssert softAssert;
    private HomePage homePage;
    private CommonPage commonPage;
    private PictureDetailsPage pictureDetailsPage;
    private DoneIconPage doneIconPage;
    private MyWorksPage myWorksPage;
    private CategoriesPage categoriesPage;
    private OthersPage othersPage;
    private AppLanguagePage appLanguagePage;
    private ContactUsPage contactUsPage;
    private RateAppPage rateAppPage;




    public OnBoardingPage onBoardingPage(){
        if (onBoardingPage == null){
            onBoardingPage = new OnBoardingPage();
        }return onBoardingPage;
    }

    public SoftAssert softAssert(){
        if (softAssert == null){
            softAssert = new SoftAssert();
        }return softAssert;
    }

    public HomePage homePage(){
        if (homePage == null){
            homePage = new HomePage();
        }return homePage;
    }

    public CommonPage commonPage(){
        if (commonPage == null){
            commonPage = new CommonPage();
        }return commonPage;
    }

    public PictureDetailsPage pictureDetailsPage(){
        if (pictureDetailsPage == null){
            pictureDetailsPage = new PictureDetailsPage();
        }return pictureDetailsPage;
    }

    public DoneIconPage doneIconPage(){
        if (doneIconPage == null){
            doneIconPage = new DoneIconPage();
        }
        return doneIconPage;
    }

    public MyWorksPage myWorksPage(){
        if (myWorksPage == null){
            myWorksPage = new MyWorksPage();
        }
        return myWorksPage;
    }

    public CategoriesPage categoriesPage(){
        if (categoriesPage == null){
            categoriesPage = new CategoriesPage();
        }
        return categoriesPage;
    }

    public OthersPage othersPage(){
        if (othersPage == null){
            othersPage = new OthersPage();
        }
        return othersPage;
    }

    public AppLanguagePage appLanguagePage(){
        if (appLanguagePage == null){
            appLanguagePage = new AppLanguagePage();
        }
        return appLanguagePage;
    }

    public ContactUsPage contactUsPage(){
        if (contactUsPage == null){
            contactUsPage = new ContactUsPage();
        }
        return contactUsPage;
    }

    public RateAppPage rateAppPage(){
        if (rateAppPage == null){
            rateAppPage = new RateAppPage();
        }
        return rateAppPage;
    }






}


