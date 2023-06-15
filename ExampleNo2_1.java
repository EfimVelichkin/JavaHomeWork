import java.util.Scanner;

public class ExampleNo2_1 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumOfPrimes(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            if (isPrime(n)) {
                sum += n;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел в массиве: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        boolean Num = false;
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        int sum = sumOfPrimes(numbers);
        System.out.println("Сумма простых чисел равна: " + sum);
    }
}
