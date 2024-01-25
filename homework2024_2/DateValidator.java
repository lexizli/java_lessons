package homework2024_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateValidator {

    public static boolean isValidDate(String input) {
        // Проверяем формат даты
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false);
        try {
            Date date = dateFormat.parse(input);
        } catch (ParseException e) {
            return false;
        }

        // Проверяем диапазон даты
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

        try {
            Date minDate = yearFormat.parse("1900");
            Date maxDate = yearFormat.parse("2022");
            
            // Используем строку input здесь, чтобы проверить дату
            Date date = dateFormat.parse(input);

            if (date.before(minDate) || date.after(maxDate)) {
                return false;
            }
        } catch (ParseException e) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "1.1.2020";

        if (isValidDate(input)) {
            System.out.println("Дата действительна.");
        } else {
            System.out.println("Дата недействительна.");
        }
    }
}