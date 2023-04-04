/*
 Каталог товаров книжного магазина сохранен в виде двумерного списка 
 List<ArrayList<String>> так, 
 что на 0-й позиции каждого внутреннего списка содержится название жанра, 
 а на остальных позициях - названия книг. 
 Напишите метод для заполнения данной структуры.
*/
package seminar_three.tasks;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

    public static List<ArrayList<String>> catalog = new ArrayList<>();

    public static void run() {
        ArrayList<String> poetry = new ArrayList<>();
        poetry.add("Поэзия");
        poetry.add("Левитанский");
        poetry.add("Дубаев");
        poetry.add("Мандельштамм");
        poetry.add("Облако без штанов");


 //       ArrayList<String> prose = (ArrayList<String>) List.of("Проза","Олле Лукойе","Рассказы","Романы","Фигли-мигли");
 //       ArrayList<String> science = (ArrayList<String>) List.of("Науки","Книжкф по Java толстая","Python");
        fillBooksCatalog(poetry);
 //       fillBooksCatalog(science);
 //       fillBooksCatalog(prose);
    
    }

    public static void fillBooksCatalog(ArrayList<String> booksStack) {
        catalog.add(booksStack);
        System.out.println(catalog);
    }
    
}
