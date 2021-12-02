package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static utilities.Driver.appiumDriver;

public class OthersPage {

    public OthersPage() {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
    }


    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/others")
    public AndroidElement othersIcon;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/freeAccount")
    public AndroidElement freeAccountText;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/offerslimxitedAccess")
    public AndroidElement offerslimxitedAccess;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/goPremiumText1")
    public AndroidElement premiumTextOne;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/appLanguage")
    public AndroidElement appLanguage;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/contactUsLabel")
    public AndroidElement contactUsLabel;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/imageView12")
    public AndroidElement appInfoLabel;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/appInfoText")
    public AndroidElement appInfo;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/imageView14")
    public AndroidElement privacyText;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/imageView16")
    public AndroidElement playIntro;


}
