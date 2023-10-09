import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class StringManipulatorTest {

    private StringManipulator stringManipulator;

    @BeforeEach
    void setUp() {
        stringManipulator = new StringManipulator();
    }

    @Test
    void testConcatenate() {
        assertEquals("Hello, World!", stringManipulator.concatenate("Hello, ", "World!"));
        assertEquals("12345", stringManipulator.concatenate("123", "45"));
    }

    @Test
    void testFindLength() {
        assertEquals(0, stringManipulator.findLength(""));
        assertEquals(5, stringManipulator.findLength("Hello"));
        assertEquals(10, stringManipulator.findLength("JUnitTest2"));
    }

    @Test
    void testConvertToUpperCase() {
        assertEquals("HELLO", stringManipulator.convertToUpperCase("hello"));
        assertEquals("TESTING", stringManipulator.convertToUpperCase("Testing"));
        assertEquals("JAVA", stringManipulator.convertToUpperCase("Java"));
    }

    @Test
    void testConvertToLowerCase() {
        assertEquals("world", stringManipulator.convertToLowerCase("World"));
        assertEquals("programming", stringManipulator.convertToLowerCase("Programming"));
        assertEquals("example", stringManipulator.convertToLowerCase("Example"));
    }

    @Test
    void testContainsSubstring() {
        assertTrue(stringManipulator.containsSubstring("Hello, World!", "Hello"));
        assertTrue(stringManipulator.containsSubstring("JUnit Testing", "Testing"));
        assertFalse(stringManipulator.containsSubstring("Java Programming", "Python"));
    }
}