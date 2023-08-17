package algo2.task;

public class FillArray {
    //  fill integer array with random values
    public static int[] fillArray(int[] myArray) {

        int borders = myArray.length;

        for (int i = 0; i < borders; i++) {
            myArray[i] = (int) (Math.random() * borders * 2);
        }
        return myArray;

    }
}
