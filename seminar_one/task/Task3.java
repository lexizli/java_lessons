package seminar_one.task;

public class Task3 {
    public static void run() {
        int[] digits = {1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1};
        int seriesMax = 0;
        int series = 0;
        for (int i : digits) {
            if (i == 1) {
                series++;
            } else {
                if (series > seriesMax) {
                    seriesMax = series;
                }
                series = 0;
            }
        }
        System.out.println(seriesMax);
        System.out.println(series);

    }
    
}
