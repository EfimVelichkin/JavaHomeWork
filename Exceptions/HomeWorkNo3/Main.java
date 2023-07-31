package HomeWorkNo3;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {

    private static final int REQUIRED_DATA_COUNT = 6;

    public static void main(String[] args) {
        String input = "Иванов Иван Иванович 01.01.2000 1234567890 m";
        String[] data = input.split(" ");

        if (data.length != REQUIRED_DATA_COUNT) {
            System.out.println("Ошибка: неверное количество данных");
            return;
        }

        String lastName = data[0];
        String firstName = data[1];
        String patronymic = data[2];

        LocalDate birthDate;
        try {
            birthDate = LocalDate.parse(data[3], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (DateTimeParseException e) {
            System.out.println("Ошибка: неверный формат даты рождения");
            return;
        }

        long phoneNumber;
        try {
            phoneNumber = Long.parseLong(data[4]);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неверный формат номера телефона");
            return;
        }

        char gender;
        if (data[5].equals("m") || data[5].equals("f")) {
            gender = data[5].charAt(0);
        } else {
            System.out.println("Ошибка: неверный формат пола");
            return;
        }

        String fileName = lastName + ".txt";
        String fileContent = lastName + firstName + patronymic + birthDate + " " + phoneNumber + gender + "\n";

        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(fileContent);
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
