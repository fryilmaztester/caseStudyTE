package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import utilities.ReusableMethods;

import java.util.List;

import static utilities.Driver.appiumDriver;

public class RateAppPage {

    public RateAppPage() {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
    }

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/rateAppText")
    public AndroidElement rateAppLocator;

    @AndroidFindBy(className = "android.widget.ImageView")
    public List<AndroidElement> starSize;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/starText")
    public AndroidElement rateAppText;

    @AndroidFindBy(id = "com.android.vending:id/0_resource_name_obfuscated")
    public AndroidElement playStore;

}
