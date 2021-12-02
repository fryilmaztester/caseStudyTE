package pages;

import com.gargoylesoftware.htmlunit.Page;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static utilities.Driver.appiumDriver;

public class AppLanguagePage {

    public AppLanguagePage() {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
    }

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/languageText")
    public AndroidElement languageText;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/imageView6")
    public AndroidElement langArrow;

    @AndroidFindBy(xpath = "//*[@text = 'Vietnamese']")
    public AndroidElement vietnamese;

}
