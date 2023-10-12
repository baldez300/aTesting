import java.util.Arrays;

/*
    Task 1: Calculate mean of an array in functional way (e.g. no for-loops)
*/

public class ArrayMeanCalculator {
    public static void main(String[] args) {
        double[] numbers = {5.5, 2.0, 10.5, 7.0, 3.5};

        // Using the Stream API to calculate the mean
        double mean = Arrays.stream(numbers)
                .average() // Calculate the average
                .orElse(0.0); // Provide a default value if the array is empty

        System.out.println("Mean: " + mean);
    }
}
