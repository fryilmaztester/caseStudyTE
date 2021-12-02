package pages;


import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static utilities.Driver.appiumDriver;

public class CommonPage {

    public CommonPage() {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
    }

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/backButton")
    public AndroidElement backButton;

    @AndroidFindAll(value = {
            @AndroidBy(id = "countdown-close-container"),
            @AndroidBy(id = "close-button-place-holder"),
            @AndroidBy(xpath = "//*[@text = 'Kapat']"),
            @AndroidBy(id = "close-button-icon")
            })
    public AndroidElement adCloseButton;


    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/dialogTitle")
    public AndroidElement dialogTitle;

    @AndroidFindBy(id = "android:id/content")
    public AndroidElement contentId;





}
