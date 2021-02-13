import java.util.Arrays;

public class selection {
    public static void sel_sort(double array[]) {
        //traverse unsorted array
        for (int i = 0; i < array.length - 1; i++) {
            //Find the  max element in unsorted array
            double maxNum = array[i];
            int max = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
            }
            //swapping  max elements with compared elements
            double swap = array[i];
            array[i] = array[max];
            array[max] = swap;
        }
    }

    public static void main(String args[]) {
        double[] array = new double[]{150.00, 200.00, 154.98, 335.01, 475.12, 555.87, 216.38};
        System.out.println("Before selection sort: " +    Arrays.toString(array));
        sel_sort(array);//call
        System.out.println(" ");
        System.out.println("Sorted Array:" + Arrays.toString(array));
        System.out.println(" ");
        System.out.println("The largest value: " +  "£" + array[0]);


        }

    }






