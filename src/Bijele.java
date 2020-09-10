import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Bijele {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] proper = {1, 1, 2, 2, 2, 8};
        int[] actual = new int[6];

        for (int i = 0; i < actual.length; i++) {
            actual[i] = sc.nextInt();
        }
        for (int i = 0; i < actual.length; i++) {
            System.out.println(proper[i] - actual[i] + " ");
        }
        sc.close();
    }
}
