package waits;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitsTests extends BaseTests {
     @Test
     public void testwaits(){
         var ex1Page = homePage.clickDynamicLoading().clickEx1Link();
         ex1Page.clickOnStart();
         assertEquals(ex1Page.getLoadedMessage(), "Hello World!", "The text is not visible yet");
    }

    @Test
     public void testwaits2(){
         var ex2Page = homePage.clickDynamicLoading().clickEx2Link();
         ex2Page.clickOnStart();
         assertEquals(ex2Page.getLoadedMessage(), "Hello World!", "The text is not visible yet");
    }
}