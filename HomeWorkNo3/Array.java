package ExampleNo4;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество элементов:");
        int n = scanner.nextInt();

        System.out.println("Введите " + n + " элементов:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            list.add(num);
        }

        int min = list.get(0);
        int max = list.get(0);
        double sum = 0;

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }

        double avg = sum / list.size();

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + avg);

        scanner.close();
    }
}
