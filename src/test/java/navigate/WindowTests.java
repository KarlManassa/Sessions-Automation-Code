package navigate;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WindowTests extends BaseTests {
    @Test
    public void testSwitchToTab(){
        var newWindowPage = homePage.clickMultipleWindows().clickLink();
        getWindowManager().switchToTab("New Window");
        String headerText = newWindowPage.getHeaderText();
        assertEquals(headerText, "New Window", "You are in the wrong context");
    }
}