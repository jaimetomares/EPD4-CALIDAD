import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class IntegerTests {

    @Test
    public void testParseIntValidNumber() {
        assertEquals(Integer.parseInt("123"), 123, "Parsing of '123' failed.");
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testParseIntInvalidNumber() {
        Integer.parseInt("abc");
    }

    @Test
    public void testValueOfValidNumber() {
        Integer value = Integer.valueOf("123");
        assertNotNull(value, "valueOf returned null for '123'.");
        assertEquals(value.intValue(), 123, "valueOf '123' did not match expected value.");
    }

    @Test
    public void testCompareTo() {
        Integer x = 5;
        Integer y = 10;
        assertTrue(x.compareTo(y) < 0, "compareTo should return negative value when comparing smaller to larger.");
    }

    @Test
    public void testEquals() {
        Integer x = new Integer(5);
        Integer y = new Integer(5);
        assertEquals(x, y, "Two Integers with the same value are not equal.");
    }

    @Test
    public void testHashCode() {
        Integer x = new Integer(5);
        Integer y = new Integer(5);
        assertEquals(x.hashCode(), y.hashCode(), "Hash codes of equal Integers should be the same.");
    }

    @Test
    public void testToString() {
        Integer x = 5;
        assertEquals(x.toString(), "5", "toString should return '5' for Integer 5.");
    }

    // More tests can be added here...

}
