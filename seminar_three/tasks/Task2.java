/*
 * Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
 * Вывести название каждой планеты и количество его повторений в списке.
 * 
 * Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
 */

package seminar_three.tasks;

import java.util.ArrayList;
import java.util.Collections;

public class Task2 {

    public static ArrayList<String> planets = new ArrayList<>();

    public static void run() {
        planets.add("Venus");
        planets.add("Mars");
        planets.add("Earth");
        planets.add("Moon");
        planets.add("Mercury");
        planets.add("Jupiter");
        planets.add("Mars");
        planets.add("Earth");
        planets.add("Moon");
        planets.add("Earth");
        planets.add("Moon");
        planets.add("Mercury");
        planets.add("Jupiter");
        planets.add("Mars");
        /*
         * planets.forEach((body) -> {
         * System.out.println(body + " -> " + Collections.frequency(planets, body));
         * if (Collections.frequency(planets, body) > 1) {
         * planets.remove(body);
         * }
         * });
         */
        planets.forEach((body) -> {
            System.out.println(body + " -> " + Collections.frequency(planets, body));
        });
        int idx = 0;

        while (idx < planets.size()) {
            String current = planets.get(idx);
            if (Collections.frequency(planets, current) > 1) {
                // Remove item
                planets.remove(idx);
            } else {
                ++idx;
            }
        }
        System.out.println("---------  After cleaning  --------------");
        planets.forEach((body) -> {
            System.out.println(body + " -> " + Collections.frequency(planets, body));
        });
    }

}
