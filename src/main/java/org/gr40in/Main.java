package org.gr40in;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
//        double[] arr = {12.3, 2312.2, 0.0, 1231.0, 32.01};
//        System.out.println(getAverageForEvenNumbers(new BigDecimal(12)));
//        printAverageForEvenNumbers(new BigDecimal(12), 12, 0.21, 24L);
    }

    public static OptionalDouble getAverageForEvenNumbers(Number... numbers) {
        return Arrays.stream(numbers)
                .mapToDouble(Number::doubleValue)
                .filter(x -> x % 2 == 0)
                .average();
    }

    public static void printAverageForEvenNumbers(Number... numbers) {
        var result = getAverageForEvenNumbers(numbers);
        result.ifPresentOrElse(System.out::println, () -> System.out.println("No even elements"));
    }


}