package pages;


import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static utilities.Driver.appiumDriver;

public class PictureDetailsPage {

    public PictureDetailsPage() {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
    }

    public  By addBy = By.id("com.teknasyon.coloringbook:id/add");

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/colorImageView")
    public AndroidElement colorImageView;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/back")
    public AndroidElement pictureDetailBackButton;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/refresh")
    public AndroidElement refreshButton;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/reloadTExt")
    public AndroidElement reloadText;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/palette")
    public AndroidElement palette;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/addPalette")
    public AndroidElement addPalette;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/add")
    public AndroidElement add;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/color9")
    public List<AndroidElement> colorNine;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/color1")
    public List<AndroidElement> colorOne;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/title")
    public AndroidElement title;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/deletePalette")
    public AndroidElement deletePalette;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/savePalette")
    public AndroidElement savePalette;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/back5")
    public AndroidElement sunBarColorFive;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/indicator5")
    public AndroidElement indicatorFive;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/color")
    public List<AndroidElement> mainColor;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/undo")
    public AndroidElement undoButton;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/redo")
    public AndroidElement redoButton;





}
