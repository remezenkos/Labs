
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;


@RunWith(JUnit4.class)
public class StringCheckerTest {

    @Test
    public void testFindAverage() {
        StringChecker sc = new StringChecker();
        String[] input = {"123", "1234", "12345"};
        int expResult = 4;
        int actResult = sc.findAverage(input);
        assertEquals(expResult, actResult);
    }
    @Test
    public void testFindLessThanAverage() {
        StringChecker sc = new StringChecker();
        String[] input = {"123", "1234", "12345"};
        String [] expResult = {"123"};
        String[] actResult = sc.findLessThanAverage(input);
        assertArrayEquals(expResult,actResult);
    }
}
