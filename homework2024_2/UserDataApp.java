package homework2024_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class UserDataApp {

    public static boolean isOnlyLetters(String inputData) {
        // Регуляное выражение для всех букв латинского и русского алфавита
        String pattern = "^[a-zA-Zа-яА-Я]+";
        return inputData.matches(pattern);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            BufferedWriter writer = null;
            try {

                // Запрашиваем у пользователя все данные в одной строке
                System.out.print(
                        "Введите данные в одной строке в формате: \n" +
                                "Фамилия Имя Отчество дата рождения (в формате dd.mm.yyyy) \n" +
                                "номер телефона (10 цифр подряд без пробелов и дефисов) \nпол(м или ж,  m или f): ");
                String inputData = scanner.nextLine();
                scanner.close();

                // Разбиваем данные на отдельные части по пробелу
                String[] fields = inputData.split(" ");

                // Проверяем, что количество полей соответствует требованиям
                if (fields.length != 6) {
                    throw new IllegalArgumentException("неверное количество данных!");
                }

                String lastName = fields[0]; // фамилия
                String firstName = fields[1]; // имя
                String middleName = fields[2]; // отчество
                String birthDateString = fields[3]; // строка с датой

                // String phoneNumber = fields[4]; // строка с номером телефона
                // // использовать integer для номера телефона не имеет смысла, код зоны
                // if (!phoneNumber.matches("\\d{10}")) {
                // throw new IllegalArgumentException("номер телефона должен состоять из десяти
                // цифр!");
                // }
                long phoneNumber = 0;

                try {
                    // phoneNumber = Integer.parseInt(fields[4]);
                    phoneNumber = Long.parseLong(fields[4]);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("вместо номера телефона введен какой-то другой набор символов");
                }

                // Проверяем, что номер телефона соответствует требованиям
                if (phoneNumber < 1000000000 || phoneNumber > 9999999999L) {
                    throw new IllegalArgumentException("неверный номер телефона = " + phoneNumber + " введено значение = " + fields[4]);
                }
                // Проверяем, что пол соответствует требованиям
                String gender = fields[5].replace("м", "m").replace("ж", "f");
                if (!gender.equals("m") && !gender.equals("f")) {
                    throw new IllegalArgumentException("неверный пол");
                }

                // Проверяем, что фамилия, имя и отчество начинаются с заглавной буквы и
                // приводим их в верное состояние
                if (isOnlyLetters(lastName)) {
                    lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
                } else {
                    throw new IllegalArgumentException("в фамилии есть символы, отличные от букв");
                }

                if (isOnlyLetters(firstName)) {
                    firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
                } else {
                    throw new IllegalArgumentException("в имени есть символы, отличные от букв");
                }

                if (isOnlyLetters(middleName)) {
                    middleName = middleName.substring(0, 1).toUpperCase() + middleName.substring(1).toLowerCase();
                } else {
                    throw new IllegalArgumentException("в отчестве есть символы, отличные от букв");
                }

                // Проверяем, что дата рождения соответствует требованиям

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
                dateFormat.setLenient(false);
                // Date birthDate = null;
                SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
                try {
                    Date birthDate = (Date) dateFormat.parse(birthDateString);
                    Date minDate = yearFormat.parse("1900");
                    Date maxDate = yearFormat.parse("2022");

                    if (birthDate.before(minDate) || birthDate.after(maxDate)) {
                        throw new IllegalArgumentException("вы или уже умерли, или еще слишком малы!");
                    }
                } catch (ParseException e) {
                    throw new IllegalArgumentException("неверный формат даты рождения!");
                }

                // Создание файла
                String fileName = lastName + ".txt";
                writer = new BufferedWriter(new FileWriter(fileName, true));

                // Запись данных в файл
                writer.write(lastName + " " + firstName + " " + middleName + " " + birthDateString + " " + phoneNumber
                        + " " + gender);
                writer.newLine();

                // Закрытие файла
                writer.close();
                System.out.println("Данные успешно записаны в файл " + fileName);

            } catch (IOException e) {
                System.out.println("Ошибка записи в файл: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка в данных: " + e.getMessage());
            } finally {
                if (writer != null) {
                    try {
                        writer.close();
                    } catch (IOException e) {
                        System.out.println("Ошибка закрытия файла: " + e.getMessage());
                    }
                }
            }
        }
    }
}
