

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {

    @Test
    public void testIsPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();

        // Test true cases
        assertTrue(checker.isPalindrome("radar"));
        assertTrue(checker.isPalindrome("A man, a plan, a canal, Panama"));
        assertTrue(checker.isPalindrome("race car"));
        assertTrue(checker.isPalindrome("Was it a car or a cat I saw?"));

        // Test false cases
        assertFalse(checker.isPalindrome("hello"));
        assertFalse(checker.isPalindrome("openai"));
        assertFalse(checker.isPalindrome("Palindrome"));
        assertFalse(checker.isPalindrome("12345"));
    }

    @Test
    public void testIsPalindromeWithEmptyString() {
        PalindromeChecker checker = new PalindromeChecker();

        // An empty string is considered a palindrome
        assertTrue(checker.isPalindrome(""));
    }

    @Test
    public void testIsPalindromeWithSingleCharacter() {
        PalindromeChecker checker = new PalindromeChecker();

        // A single character string is considered a palindrome
        assertTrue(checker.isPalindrome("a"));
        assertTrue(checker.isPalindrome("Z"));
        assertTrue(checker.isPalindrome("7"));
    }

    @Test
    public void testIsPalindromeWithWhitespace() {
        PalindromeChecker checker = new PalindromeChecker();

        // Test with strings that contain only whitespace
        assertTrue(checker.isPalindrome("   "));
        assertTrue(checker.isPalindrome("  \t  "));
    }

    @Test
    public void testIsPalindromeWithMixedCase() {
        PalindromeChecker checker = new PalindromeChecker();

        // Test with mixed-case strings
        assertTrue(checker.isPalindrome("MaDaM"));
        assertTrue(checker.isPalindrome("Able was I ere I saw elba"));
    }
}
