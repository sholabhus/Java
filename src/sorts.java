//Task  3 - age
import java.util.Arrays;

public class sorts {
    public static void InsertionSort(int array[]) {

        int num = array.length;
        for (int i = 1; i < num; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }


    public static void main(String args[]) {
        int[] age = {17, 21, 97, 66, 55, 30, 33, 45, 58, 67, 38, 39, 41, 19, 23};
        System.out.println("--- Before sorting  data " + Arrays.toString(age));
        System.out.println();
        InsertionSort(age);// calling InsertionSort
        System.out.println("--- Sorting the data from min to max---:" + Arrays.toString(age));
        System.out.println("" );
        System.out.println("--- range 30-40 :" );


            for (int i = 0; i < age.length; i++) ;
        for (int n : age) {
            if (n >= 30 && n <= 40) {
                System.out.println(n );


            }
        }
    }
}






















