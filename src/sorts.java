
import java.util.Arrays;

public class sorts {

    public static void main(String[] args) {
        int age[] = {17, 21, 97, 66, 55, 30, 33, 45, 58, 67, 38, 39, 41, 19, 23};
        Arrays.sort(age); // sort age  from min to max
        System.out.println("---Before Sorting---:" + Arrays.toString(age));
        for (int n : age) {   //convert array to integer

            for (int i = 0; i < n; i++) ;
            if (n >= 30 && n <= 40) {
                System.out.println(" ");
                System.out.println(n);
            }
        }
    }
}














