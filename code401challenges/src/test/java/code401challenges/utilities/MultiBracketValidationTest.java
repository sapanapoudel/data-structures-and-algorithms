package code401challenges.utilities;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {
    @Test
    public void multiBracketValidationTest() {

        assertTrue(MultiBracketValidation.multiBracketValidation("{[sapana]}"));
        assertTrue(MultiBracketValidation.multiBracketValidation("()[[Extra Characters]]"));
        assertTrue(MultiBracketValidation.multiBracketValidation("{}{Code}[Fellows](())"));
        assertFalse(MultiBracketValidation.multiBracketValidation("{[sapana}"));
        assertFalse(MultiBracketValidation.multiBracketValidation("[({}]"));
        assertFalse(MultiBracketValidation.multiBracketValidation("{(})"));
    }

}