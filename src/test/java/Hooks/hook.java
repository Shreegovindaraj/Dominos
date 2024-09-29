package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.Base_Class.Base_Class;

public class hook extends Base_Class {

    @Before
    public void setup() {
        // This method is left empty as the browser setup will happen in step definitions
    }

    @After
    public void tearDown() {
        closeDriver();
    }
}