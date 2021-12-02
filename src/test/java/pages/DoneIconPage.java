package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.cy_gb.Anrhegediga;
import org.openqa.selenium.support.PageFactory;

import static utilities.Driver.appiumDriver;

public class DoneIconPage {

    public DoneIconPage() {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
    }


    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/doneIcon")
    public AndroidElement doneIcon;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/filigran")
    public AndroidElement filigran;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/shareText")
    public AndroidElement shareButton;

    @AndroidFindBy(id = "android:id/chooser_row_text_option")
    public AndroidElement shareText;

}
