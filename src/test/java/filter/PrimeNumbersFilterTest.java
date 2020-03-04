package filter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PrimeNumbersFilterTest {

    @Test
    void filter() {
        PrimeNumbersFilter primeNumbersFilter = new PrimeNumbersFilter();
        List<Integer> primeNumbers = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97));
        List<Integer> primeNumbersFilterList = primeNumbersFilter.filter();

        Assertions.assertEquals(primeNumbers, primeNumbersFilterList);
    }
}