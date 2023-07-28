package HomeWorkNo2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleNo1 {
    public static void main(String[] args) {
        float num = getFloatInput();
        System.out.println("Вы ввели: " + num);
    }

    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введите дробное число: ");
                float num = scanner.nextFloat();
                return num;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введите корректное число.");
                scanner.nextLine();
            }
        }
    }
}
