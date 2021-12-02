package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static utilities.Driver.appiumDriver;

public class CategoriesPage {

    public CategoriesPage() {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
    }

    public By dogTitleBy = By.xpath("//*[@text = 'Köpekler']");
    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/categories")
    public AndroidElement categoriesIcon;

    @AndroidFindBy(xpath = "//*[@text = 'Köpekler']")
    public AndroidElement dogTitle;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/categoryName")
    public List<AndroidElement> categoryName;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/showAll")
    public List<AndroidElement> showAll;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/categoryDetailRecyclerView")
    public AndroidElement categoryDetail;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/moreSoundsImage")
    public List<AndroidElement> morePicture;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/moreSoundsText")
    public AndroidElement moreText;
}
