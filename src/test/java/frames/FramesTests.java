package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class FramesTests extends BaseTests {
    @Test
    public void testFrames(){
        var nestedFramesPage=homePage.clickFrames().clickNestedFrames();
        assertTrue(nestedFramesPage.getLeftFrameText().contains("LEFT"),
                "The left text is incorrect");
        assertTrue(nestedFramesPage.getBottomFrameText().contains("BOTTOM"), // <-- غيرها إلى "BOTTOM"
                "The bottom text is incorrect");
    }

}