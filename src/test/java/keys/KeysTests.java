package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests {
    @Test
    public void testKeys(){
        var keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.setText(Keys.chord(Keys.SHIFT, "a"));
        assertEquals(keyPressesPage.getResultMessage(), "You entered: A",
                "Message is incorrect");
    }
}