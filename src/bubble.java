import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class bubble {
    public static void bubbleSort(int arrnum[]) {

        int num = arrnum.length;
        for (int i = 0; i < num - 1; i++)
            //keeps track of position
            for (int j = 0; j < num - i - 1; j++)

                //if left value is greater than right value
                if (arrnum[j] > arrnum[j + 1]) {
                    //swap arrnum[j + 1 and arrnum[j]
                    int value = arrnum[j];
                    arrnum[j] = arrnum[j + 1];
                    arrnum[j + 1] = value;
                }

    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int[] arrnum = new int[]{34, 2, 10, 6, 7, 5, 1, 5};

        //count the number of times a value occur
        int count = 0;
        for (int i = 0; i < arrnum.length; i++) {
            if (arrnum[i] == num) {
                count++;

            }

        }

        bubbleSort(arrnum);
        System.out.println(Arrays.toString(arrnum));
        if (count == 1) {
            System.out.println("We found" + " " + count + " " + "count of " + num);
        } else {
            System.out.println("We found" + " " + count + " " + "counts of " + num);

        }
    }
}


