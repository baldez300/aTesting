/*
    Task 2: Filtering and Transforming a List of Numbers

    You are given a list of integers. Your task is to perform the following operations using Java functional programming techniques:

    Filter out all the even numbers from the list.
    Double each remaining number.
    Find the sum of the resulting numbers.
    Write a Java program that demonstrates these operations using lambda expressions, streams, and functional interfaces.
*/

import java.util.Arrays;
import java.util.List;

public class NumberOperations {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter out even numbers
        List<Integer> filteredNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .toList();

        // Double each remaining number
        List<Integer> doubledNumbers = filteredNumbers.stream()
                .map(n -> n * 2)
                .toList();

        // Find the sum of the resulting numbers
        int sum = doubledNumbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Original List: " + numbers);
        System.out.println("Filtered List (odd numbers only): " + filteredNumbers);
        System.out.println("Doubled List: " + doubledNumbers);
        System.out.println("Sum of Doubled List: " + sum);
    }
}
