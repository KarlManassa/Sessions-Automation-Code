package modals;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ModalTests extends BaseTests {
    @Test
    public void testModal(){
        var modal = homePage.clickEntryAd();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        modal.clickClose();
        modal.clickRestartLink();
        assertEquals(modal.getHeaderText(), "Entry Ad",
                "The header is incorrect");
    }
}