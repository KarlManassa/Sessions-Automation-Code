package js;

import base.BaseTests;
import org.testng.annotations.Test;

public class JsExecuterTests extends BaseTests {
    @Test
    public void testScrollToTable(){
        var largeAndDeepDomPage = homePage.clickLargeAndDeepDom();
        largeAndDeepDomPage.scrollToTable();
    }

    @Test
    public void testScrollToParagraph(){
        homePage.clickInfiniteScroll().scrollIntoParagraph(5);
    }
}