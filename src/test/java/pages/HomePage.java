package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindByChainSet;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static utilities.Driver.appiumDriver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    public By homePageAdversitingClose = By.xpath ("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.widget.ImageView");
    public By templateImageBy = By.id("com.teknasyon.coloringbook:id/templateImage");


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.widget.ImageView")
    public AndroidElement homePageAdversitingCloseAndroid;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/home")
    public AndroidElement homePageLocator;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/sliderImage")
    public AndroidElement sliderImage;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/toolbarTitle")
    public AndroidElement toolBarTitle;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/crownIcon")
    public AndroidElement crownIcon;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/reward_desc")
    public AndroidElement rewardPopUpDetail;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/reward_cancel")
    public AndroidElement rewardCancel;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/templateImage")
    public List<AndroidElement> templateImage;




}

