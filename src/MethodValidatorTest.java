import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Usuario on 23/06/2016.
 */
public class MethodValidatorTest {

    @Test
    public void testIsValidMethod(){
        MethodValidator methodValidator = new MethodValidator();
        assertTrue(methodValidator.isValidMethod("public static void main (String[] args)"));
    }
}