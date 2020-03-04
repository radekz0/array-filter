package filter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
    }

    private static void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("To get all prime numbers in range of 1 to 100 type: Prime Numbers Filter.");
        String filterType = scanner.nextLine();

        switch(filterType.toLowerCase()){
            case "prime numbers filter":
                PrimeNumbersFilter primeNumbersFilter = new PrimeNumbersFilter();
                primeNumbersFilter.filterArray();
                break;
            default:
                System.out.println("Wrong type of filter.");
        }
    }
}