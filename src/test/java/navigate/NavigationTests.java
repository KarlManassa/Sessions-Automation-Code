package navigate;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {
    @Test
    public void testNavigation(){
        homePage.clickDynamicLoading().clickEx1Link();
        getWindowManager().goBack();
        getWindowManager().goForward();
        getWindowManager().refreshPage();
        getWindowManager().goTo("https://www.google.com/");
    }
}
