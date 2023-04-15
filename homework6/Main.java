/*
 * Создать  класс Ноутбук, выделить поля и методы.
 * Создать множество ноутбуков.
 * Написать методы, которые будет запрашивать у пользователя  критерии фильтрации 
 * и выведет ноутбуки, отвечающие фильтру. 
 */

package homework6;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import homework6.tasks.Notebooks;

public class Main {
    public static void main(String[] args) {
        String isFilter;
        String filterNumber;
        Scanner inObj = new Scanner(System.in);
        System.out.print("\033[H\033[J");

        Map<Integer, Notebooks> stock = new HashMap<Integer, Notebooks>();

        stock.put(1, new Notebooks("Guomi", "OLOEY Intel N5105 ", "Windows 10 Pro", "1920x1080", "Intel Celeron N5105",
                "Integrated", "Intel", "Red"));
        stock.put(2, new Notebooks("Hrenomi", "Hrenomi 123", "Windows 11", "1920x1080",
                "Core i3-1115G4", "Integrated", "Intel", "Black"));
        stock.put(3, new Notebooks("Hvatomi", "Hvatomi 456", "Windows 10", "1920x1080",
                "Core i3-1115G4", "Integrated", "Intel", "Blue"));
        stock.put(4, new Notebooks("Hvatomi", "Hvatomi 457", "Windows 10", "1920x1080",
                "Core i3-1115G4", "Integrated", "Intel", "Yellow"));
        stock.put(5, new Notebooks("Dundomi", "Dundomi 777", "Windows 11", "1920x1080", "Core i3-1115G4",
                "Integrated", "Intel", "Red"));
        stock.put(6, new Notebooks("Asus", "ROG Zephyrus duo 16 GX650", "Red Hat", "1920x1080", "Core i3-1115G4",
                "AMD Ryzen 9 7945HX ", "AMD", "Red"));
        stock.put(7, new Notebooks("Apple", "M1 Pro", "Ventura", "3024x1964", "M1 pro", "Integrated", "Apple M1 Pro",
                "Silver"));

        while (true) {
            System.out.print("\033[H\033[J");
            System.out.print("\nWhat filter do you want to use:> ");
            System.out.print(
                    "\n1. Trade mark; 2. Model; 3. OS; 4. Resolution; 5. CPU model; 6. Video type; 7. Video model; 8. Color.");
            System.out.print("\nInput number from 1 to 8  or 0 for exit > ");

            filterNumber = inObj.nextLine();
            System.out.println(filterNumber);

            if (filterNumber.equals("0")) {
                System.out.println("Buy!");
                break;
            }

            switch (filterNumber) {
                case "1":
                    getTradeMarks(stock).forEach(System.out::println);
                    System.out.println("\nInput brand > ");
                    isFilter = inObj.nextLine();
                    printNotebooks((filterTradeMarks(stock, isFilter)));
                    break;

                case "2":
                    getModels(stock).forEach(System.out::println);
                    System.out.print("\nInput model > ");
                    isFilter = inObj.nextLine();
                    printNotebooks((filterModels(stock, isFilter)));
                    break;

                case "3":
                    getOses(stock).forEach(System.out::println);
                    System.out.print("\nInput operation system > ");
                    isFilter = inObj.nextLine();
                    printNotebooks((filterOses(stock, isFilter)));
                    break;
                case "4":
                    getResolutions(stock).forEach(System.out::println);
                    System.out.print("\nInput resolution of screen > ");
                    isFilter = inObj.nextLine();
                    printNotebooks((filterResolutions(stock, isFilter)));
                    break;
                case "5":
                    getCpuModels(stock).forEach(System.out::println);
                    isFilter = inObj.nextLine();
                    printNotebooks((filterCpuModels(stock, isFilter)));
                    break;
                case "6":
                    getVideoTypes(stock).forEach(System.out::println);
                    System.out.print("\nInput type of video board > ");
                    isFilter = inObj.nextLine();
                    printNotebooks((filterVideoTypes(stock, isFilter)));
                    break;
                case "7":
                    getVideoModels(stock).forEach(System.out::println);
                    System.out.print("\nInput models ov video board > ");
                    isFilter = inObj.nextLine();
                    printNotebooks((filterVideoModels(stock, isFilter)));
                    break;
                case "8":
                    getColors(stock).forEach(System.out::println);
                    System.out.println("\nInput color > ");
                    isFilter = inObj.nextLine();
                    printNotebooks((filterByColor(stock, isFilter)));
                    break;
            }
            System.out.println("\nI'm waiting, input something for continue > ");
            isFilter = inObj.nextLine();
        }
        inObj.close();

    }

    public static Collection<Notebooks> filterTradeMarks(Map<Integer, Notebooks> notebooksMap, String tradeMark) {
        return notebooksMap.values().stream()
                .filter(notebook -> notebook.getTradeMark().equals(tradeMark))
                .sorted(Comparator.comparing(Notebooks::getTradeMark))
                .collect(Collectors.toList());
    }

    public static Collection<Notebooks> filterModels(Map<Integer, Notebooks> notebooksMap, String Model) {
        return notebooksMap.values().stream()
                .filter(notebook -> notebook.getModel().equals(Model))
                .sorted(Comparator.comparing(Notebooks::getTradeMark))
                .collect(Collectors.toList());
    }

    public static Collection<Notebooks> filterOses(Map<Integer, Notebooks> notebooksMap, String Os) {
        return notebooksMap.values().stream()
                .filter(notebook -> notebook.getOs().equals(Os))
                .sorted(Comparator.comparing(Notebooks::getTradeMark))
                .collect(Collectors.toList());
    }

    public static Collection<Notebooks> filterResolutions(Map<Integer, Notebooks> notebooksMap, String Resolution) {
        return notebooksMap.values().stream()
                .filter(notebook -> notebook.getResolution().equals(Resolution))
                .sorted(Comparator.comparing(Notebooks::getTradeMark))
                .collect(Collectors.toList());
    }

    public static Collection<Notebooks> filterCpuModels(Map<Integer, Notebooks> notebooksMap, String CpuModel) {
        return notebooksMap.values().stream()
                .filter(notebook -> notebook.getCpuModel().equals(CpuModel))
                .sorted(Comparator.comparing(Notebooks::getTradeMark))
                .collect(Collectors.toList());
    }

    public static Collection<Notebooks> filterVideoTypes(Map<Integer, Notebooks> notebooksMap, String VideoType) {
        return notebooksMap.values().stream()
                .filter(notebook -> notebook.getVideoType().equals(VideoType))
                .sorted(Comparator.comparing(Notebooks::getTradeMark))
                .collect(Collectors.toList());
    }

    public static Collection<Notebooks> filterVideoModels(Map<Integer, Notebooks> notebooksMap, String VideoModel) {
        return notebooksMap.values().stream()
                .filter(notebook -> notebook.getVideoModel().equals(VideoModel))
                .sorted(Comparator.comparing(Notebooks::getTradeMark))
                .collect(Collectors.toList());
    }

    public static Collection<Notebooks> filterByColor(Map<Integer, Notebooks> notebooksMap, String color) {
        return notebooksMap.values().stream()
                .filter(notebook -> notebook.getColor().equals(color))
                .sorted(Comparator.comparing(Notebooks::getTradeMark))
                .collect(Collectors.toList());
    }

    public static void printNotebooks(Collection<Notebooks> notebooksCollection) {
        notebooksCollection.stream()
                .forEach(notebook -> System.out.printf("%s —— \t %s | %s | %s | %s | %s | %s | %s \n",
                        notebook.getTradeMark(), notebook.getModel(), notebook.getOs(), notebook.getResolution(),
                        notebook.getCpuModel(), notebook.getVideoType(), notebook.getVideoModel(),
                        notebook.getColor()));
    }

    public static Set<String> getColors(Map<Integer, Notebooks> notebooks) {
        return notebooks.keySet().stream()
                .map(key -> notebooks.get(key).getColor())
                .collect(Collectors.toSet());
    }

    public static Set<String> getTradeMarks(Map<Integer, Notebooks> notebooks) {
        return notebooks.keySet().stream()
                .map(key -> notebooks.get(key).getTradeMark())
                .collect(Collectors.toSet());
    }

    public static Set<String> getModels(Map<Integer, Notebooks> notebooks) {
        return notebooks.keySet().stream()
                .map(key -> notebooks.get(key).getModel())
                .collect(Collectors.toSet());
    }

    public static Set<String> getOses(Map<Integer, Notebooks> notebooks) {
        return notebooks.keySet().stream()
                .map(key -> notebooks.get(key).getOs())
                .collect(Collectors.toSet());
    }

    public static Set<String> getResolutions(Map<Integer, Notebooks> notebooks) {
        return notebooks.keySet().stream()
                .map(key -> notebooks.get(key).getResolution())
                .collect(Collectors.toSet());
    }

    public static Set<String> getCpuModels(Map<Integer, Notebooks> notebooks) {
        return notebooks.keySet().stream()
                .map(key -> notebooks.get(key).getCpuModel())
                .collect(Collectors.toSet());
    }

    public static Set<String> getVideoTypes(Map<Integer, Notebooks> notebooks) {
        return notebooks.keySet().stream()
                .map(key -> notebooks.get(key).getVideoType())
                .collect(Collectors.toSet());
    }

    public static Set<String> getVideoModels(Map<Integer, Notebooks> notebooks) {
        return notebooks.keySet().stream()
                .map(key -> notebooks.get(key).getVideoModel())
                .collect(Collectors.toSet());
    }

    /*
     * — collect sets for filtres
     * — output falues for filtres
     * — get filter number and filter value
     * — output data for given filter
     */
}