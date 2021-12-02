package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.And;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static utilities.Driver.appiumDriver;

public class ContactUsPage {

    public ContactUsPage() {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
    }

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/contactUsTextView")
    public AndroidElement contactUsText;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/toolbar_title")
    public AndroidElement contactUsTitle;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/txtOpenMessageFormTicketList")
    public AndroidElement openMessage;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/create_screen_button_text")
    public AndroidElement createScreenButton;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/textinput_error")
    public List<AndroidElement> textInPutError;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/input_edit_text")
    public List<AndroidElement> inputField;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/dropdown")
    public List<AndroidElement> dropDownSubject;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/select_box")
    public AndroidElement selectBox;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/textarea_edit_text")
    public AndroidElement textAreaEdit;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/success_screen_subtitle")
    public AndroidElement successScreen;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/success_screen_open_message_form")
    public AndroidElement succesOpenMessage;

    @AndroidFindBy(accessibility = "Mevcut")
    public AndroidElement mevcutTabBar;

    @AndroidFindBy(accessibility = "Geçmiş")
    public AndroidElement gecmisTabBar;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/ticket_subject")
    public List<AndroidElement> ticketSubject;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/no_expired_text_empty")
    public AndroidElement noExpiredTextEmpty;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/action_add_new_ticket")
    public AndroidElement addNewTicket;

    @AndroidFindBy(id = "com.teknasyon.coloringbook:id/subTitle_pre_screen")
    public AndroidElement subTitlePreScreen;

    @AndroidFindBy(accessibility = "Yukarı git")
    public AndroidElement yukarıGit;








}
