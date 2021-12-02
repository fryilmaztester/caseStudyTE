package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.And;
import org.openqa.selenium.support.PageFactory;

import static utilities.Driver.appiumDriver;

public class MyWorksPage {

    public MyWorksPage() {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
    }

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/myWork")
    public AndroidElement myWorksIcon;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/textView")
    public AndroidElement withoutWorksText;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/startPainting")
    public AndroidElement startPainting;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/share")
    public AndroidElement myWorksShare;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/continueButton")
    public AndroidElement continueButton;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/delete")
    public AndroidElement deleteButton;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/deleteText")
    public AndroidElement deleteText;
}
