// Пусть дан список сотрудников:

// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Иван Иванов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Иван Иванов
// Мария Рыкова
// Анна Крутова
// Марина Лугова
// Анна Владимирова
// Петр Лыков
// Иван Мечников
// Петр Петин
// Петр Лыков
// Иван Ежов

// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.

package homework5.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {

    public static void run() {

        // Сначала засунем народ например в массив

        String[] persArray = { "Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Иван Иванов",
                "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина", "Иван Иванов",
                "Мария Рыкова", "Анна Крутова", "Марина Лугова", "Анна Владимирова", "Петр Лыков",
                "Иван Мечников", "Петр Петин", "Петр Лыков", "Иван Ежов" };

        // System.out.println(Arrays.toString(persArray));

        List<String> persList = new ArrayList<>(Arrays.asList(persArray));

        Map<String, Integer> persMap = countWords(persList);

        persMap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);

    }

    private static Map<String, Integer> countWords(List<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        for (String s : list) {
            int count = result.containsKey(s) ? result.get(s) + 1 : 1;
            result.put(s, count);

        }
        return result;
    }

}
