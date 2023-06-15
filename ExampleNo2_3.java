import java.util.Arrays;
import java.util.Scanner;
public class ExampleNo2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во чисел в массиве: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] > 9 && numbers[i] < 100) {
                sum += i;
            }
            if (numbers[i] < 0) {
                numbers[i] = sum;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
