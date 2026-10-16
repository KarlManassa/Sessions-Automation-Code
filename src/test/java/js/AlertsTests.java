package js;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseTests {
    @Test
    public void testAlert(){
        var javaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertsPage.clickJSAlert();
        assertEquals(javaScriptAlertsPage.getAlertText(), "I am a JS Alert",
                "The alert text is not correct");
//        javaScriptAlertsPage.acceptAlert();
        javaScriptAlertsPage.dismissConfirm();
        assertEquals(javaScriptAlertsPage.getResultMessage(), "You successfully clicked an alert",
                "The result text is not correct");
    }

    @Test
    public void testConfirm(){
        var javaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertsPage.clickJSConfirm();
        assertEquals(javaScriptAlertsPage.getAlertText(), "I am a JS Confirm",
                "The alert text is not correct");
        javaScriptAlertsPage.dismissConfirm();
        assertEquals(javaScriptAlertsPage.getResultMessage(), "You clicked: Cancel",
                "The result text is not correct");
    }

    @Test
    public void testPrompt(){
        var javaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertsPage.clickJSPrompt();
        assertEquals(javaScriptAlertsPage.getAlertText(), "I am a JS prompt",
                "The alert text is not correct");
        javaScriptAlertsPage.setPromptText("Route");
        javaScriptAlertsPage.acceptAlert();
        assertEquals(javaScriptAlertsPage.getResultMessage(), "You entered: Route",
                "The result text is not correct");
    }
}