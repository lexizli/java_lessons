package homework6;

import java.util.HashMap;
import java.util.Map;

import homework6.tasks.Notebooks;

public class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");

        Map<Integer, Notebooks> stock = new HashMap<Integer, Notebooks>();

        stock.put(1, new Notebooks(
                1,
                "Guomi", "OLOEY Intel N5105 ", "Windows 10 Pro", "1920x1080", "Intel Celeron N5105", "Integrated", "Intel",
                15.4, 36.38, 1.99, 24.35, 30000.0, 3000, 2, 4, 3200, 8000, 256000, 1800));
        stock.put(2, new Notebooks(
                2,
                "Hrenomi", "RedmiBook 15 JYU4525RU", "Windows 11 Home", "1920x1080", "Core i3-1115G4", "Integrated",
                "UHD Graphics",
                15.4, 36.38, 1.99, 24.35, 40000.0, 3000, 2, 4, 3200, 8000, 256000, 1900));
        stock.put(3, new Notebooks(
                3,
                "Hvatomi", "RedmiBook 15 JYU4525RU", "Windows 10 Home", "1920x1080", "Core i3-1115G4", "Integrated",
                "UHD Graphics",
                14.0, 36.38, 1.99, 24.35, 20000.0, 3000, 2, 4, 3200, 8000, 128000, 1650));
        stock.put(4, new Notebooks(
                7,
                "Dundomi", "RedmiBook 15 JYU4525RU", "Windows 11 Pro", "1920x1080", "Core i3-1115G4", "Integrated",
                "UHD Graphics",
                16, 36.38, 1.99, 24.35, 500000, 3000, 2, 4, 3200, 16000, 256000, 2800));
        stock.put(5, new Notebooks(
                4,
                "Asus", "ROG Zephyrus duo 16 GX650", "Windows 11 Pro", "1920x1080", "AMD Ryzen 9 7945HX ", "GeForce RTX 4090 (24 Гб)", "NVIDIA",
                16, 36.38, 1.99, 24.35, 924000, 3000, 2, 4, 3200, 64000, 4096000, 3000));
        stock.put(6, new Notebooks(
                11,
                "Apple", "M1 Pro", "Ventura 13.3.1", "1920x1080", "M1 pro", "Integrated",
                "UHD Graphics",
                14.4, 36.38, 1.99, 24.35, 139999.0, 3000, 6, 12, 3200, 16000, 512000, 1800));

        // for (Map.Entry<Integer, Notebooks> note : stock.entrySet()) {
        //     System.out.printf("Key: %s  Value: %s \n", note.getKey(), note.toString());
        // }

        for (Map.Entry<Integer, Notebooks> note : stock.entrySet()) {
            Notebooks seek = note.getValue();
            String noteTM = seek.getTradeMark();
            if (noteTM.equals("Asus")  ) {
            System.out.println(noteTM);
            }

          
        }

        

    }
}
