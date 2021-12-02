package utilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Allpage;

import java.time.Duration;

public class ReusableMethods extends Driver {

    public static WebDriverWait wait;
    static Allpage allpage = new Allpage();

    public static void waitFor(int second) {

        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static AndroidElement waitForVisibility(AndroidElement element, int timeToWaitInSec) {

        wait = new WebDriverWait(appiumDriver, timeToWaitInSec);
        return (AndroidElement) wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static AndroidElement waitForClickAbility(AndroidElement element, int timeToWaitInSec) {

        wait = new WebDriverWait(appiumDriver, timeToWaitInSec);
        return (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static boolean invisibilityOfElementLocat(By element) {

        ExpectedConditions.invisibilityOfElementLocated(element);
        return true;
    }


    public static boolean waitForVisibilityDisplayed(AndroidElement element, int timeToWaitInSec) {

        wait = new WebDriverWait(appiumDriver, timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
    }


    public static void scrollElement(double anc, double startP, double endP) {

        Dimension size = appiumDriver.manage().window().getSize();


        int anchor = (int) (size.width * anc);
        int startPoint = (int) (size.height * startP);
        int endPoint = (int) (size.height * endP);

        ReusableMethods.waitFor(1);

        new TouchAction(appiumDriver)
                .press(PointOption.point(anchor, startPoint))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption.point(anchor, endPoint))
                .release().perform();

    }

    public static void textWithClick(String text) {

        appiumDriver.findElementByXPath("//*[@text " + "=" + " '" + text + "']").click();

    }


    public static void swipeOperator(double startX, double endX, double yOfset) {

        Dimension size = appiumDriver.manage().window().getSize();
        int anchor = (int) (size.height * yOfset);
        int startPoint = (int) (size.width * startX);
        int endPoint = (int) (size.width * endX);

        new TouchAction(appiumDriver)
                .press(PointOption.point(startPoint, anchor))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(endPoint, anchor))
                .release().perform();
    }

    public static WebElement waitAndFindElement(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void waitAndClick(By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element)).click();
    }

    public static void tapGestureWithElement(AndroidElement element) {

        new TouchAction(appiumDriver).
                tap(TapOptions.tapOptions().withElement(ElementOption.element(element))).
                release().
                perform();

    }

    public static void tapGestureWithPoint(double startX, double yOfset) {


        Dimension size = appiumDriver.manage().window().getSize();
        int endPoint = (int) (size.height * yOfset);
        int startPoint = (int) (size.width * startX);

        new TouchAction(appiumDriver).
                tap(PointOption.point(startPoint, endPoint)).
                release().
                perform();

    }

    public static void addCloseMethod(AndroidElement element) {
        try {

            ReusableMethods.waitForClickAbility(element, 5);
            element.click();

        } catch (Exception e) {

            if (allpage.commonPage().adCloseButton.isDisplayed()) {
                ReusableMethods.waitForClickAbility(allpage.commonPage().adCloseButton, 75);
                allpage.commonPage().adCloseButton.click();
            } else {
                appiumDriver.navigate().back();
            }

        }
    }


    public static void scroolElementWithUiSelector(String lang) {

        appiumDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))." +
                "scrollIntoView(text(\"" + lang + "\"))");
    }

    public static void waitForStaleElement(AndroidElement element) {
        int y = 0;
        while (y <= 15) {
            if (y == 1)
                try {
                    element.isDisplayed();
                    break;
                } catch (StaleElementReferenceException e) {
                    System.out.println(e.getMessage());
                    y++;
                }
        }

    }

}

