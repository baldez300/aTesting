/*
    Task 2: Design a class and JUnit tests

    StringManipulator Class
    Create a Java class called StringManipulator with the following methods:

    String concatenate(String str1, String str2) - Concatenates two input strings and returns the result.
    int findLength(String str) - Returns the length of the input string.
    String convertToUpperCase(String str) - Converts the input string to uppercase and returns the result.
    String convertToLowerCase(String str) - Converts the input string to lowercase and returns the result.
    boolean containsSubstring(String str, String subStr) - Checks if the input string contains the given substring and returns true if it does, otherwise returns false.
    Your task is to write JUnit test cases for the StringManipulator class to ensure that these methods work as expected.

    StringManipulatorTest Class
    Create a JUnit test class called StringManipulatorTest and implement test cases for each of the methods mentioned above.

    Remember to create the StringManipulator class with the specified methods before implementing the test cases. Additionally, include the necessary JUnit dependencies in your project to use the annotations and assertion methods (assertEquals, etc.).

    Once you've written the test cases, run them using your IDE to verify that the StringManipulator methods behave correctly.
*/

public class StringManipulator {

    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public int findLength(String str) {
        return str.length();
    }

    public String convertToUpperCase(String str) {
        return str.toUpperCase();
    }

    public String convertToLowerCase(String str) {
        return str.toLowerCase();
    }

    public boolean containsSubstring(String str, String subStr) {
        return str.contains(subStr);
    }
}
