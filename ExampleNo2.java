import java.util.Scanner;


public class ExampleNo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа:");
        String[] nums = scanner.nextLine().split(" ");
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (Integer.parseInt(nums[i]) > 0 && Integer.parseInt(nums[i+1]) < 0) {
                sum += Integer.parseInt(nums[i]);
            }
        }
        System.out.println(sum);
    }
}
