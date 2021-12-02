package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

public class OnBoardingPage {

    public OnBoardingPage() {

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),
                this);
    }

    public By headerTextEnd = By.xpath("//*[@text = 'Muhteşem Paletler']");

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/headerText")
    public AndroidElement headerText;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/backgroundImage")
    public AndroidElement onBoardingbackGroundImage;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/detailText")
    public AndroidElement detailText;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/skipButton")
    public AndroidElement skipButton;





}
