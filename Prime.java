import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prime {
    private int start;
    private int end;

    public Prime(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> generatePrimes() {
        List<Integer> primes = new ArrayList<>();
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start of the range: ");
        int startRange = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int endRange = scanner.nextInt();

        Prime primeGenerator = new Prime(startRange, endRange);
        List<Integer> primeNumbers = primeGenerator.generatePrimes();

        System.out
                .println("Prime numbers within the range " + startRange + " to " + endRange + " are: " + primeNumbers);
    }
}
