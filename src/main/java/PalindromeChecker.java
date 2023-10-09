/*
    Assignments
    Task 1: creating a simple class and writing tests for it following the TDD approach

    Your task is to create a Java class called PalindromeChecker that can determine if a given string is a palindrome or not. A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward (ignoring spaces, punctuation, and capitalization).

    Steps
    Write Tests: Begin by writing tests for the PalindromeChecker class based on different cases of palindromes and non-palindromes.

    Implement the Class: Create the PalindromeChecker class with a method isPalindrome(String str) that takes a string as input and returns true if it's a palindrome and false otherwise.

    Run Tests: Run your test suite. Initially, the tests should fail because you haven't implemented the class yet.

    Implement the Method: Implement the isPalindrome method in the PalindromeChecker class to satisfy the test cases you've written.

    Refactor (if needed): Once your tests pass, you can refactor your code for better readability and maintainability while ensuring that all tests still pass.

    Example
    Here's a sample set of test cases you might consider:

    public class PalindromeCheckerTest {
        @Test
        public void testIsPalindrome() {
            PalindromeChecker checker = new PalindromeChecker();

            assertTrue(checker.isPalindrome("radar"));
            assertTrue(checker.isPalindrome("A man, a plan, a canal, Panama"));
            assertFalse(checker.isPalindrome("hello"));
            assertFalse(checker.isPalindrome("openai"));
        }
    }
    Your Task
    Begin by writing the test cases in the PalindromeCheckerTest class. These tests should guide you on what the isPalindrome method should do.

    Implement the PalindromeChecker class with the isPalindrome method, ensuring that it passes all the test cases.

    Run your tests frequently to make sure you're making progress.

    This exercise follows the TDD approach: you start by writing tests, then implement the functionality to make the tests pass, and finally refactor your code if necessary.
*/

public class PalindromeChecker {

    public boolean isPalindrome(String str) {
        // Remove spaces, punctuation, and convert to lowercase
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanStr.length() - 1;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false; // Characters don't match, not a palindrome
            }
            // Move the left and right pointers inwards
            left++;
            right--;
        }

        return true; // It's a palindrome
    }
}
