package filter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class PrimeNumbersFilter implements Filter {
    public List<Integer> filter() {
        List<Integer> primeNumberList = IntStream.rangeClosed(1, 100).filter(PrimeNumbersFilter::isPrimeNumber).boxed().collect(Collectors.toList());
        System.out.println(primeNumberList);
        return primeNumberList;
    }

    private static boolean isPrimeNumber(int number){
        return number > 1 && IntStream.range(2, number).noneMatch(i -> number % i == 0);
    }
}