import java.util.ArrayList;
import java.util.Scanner;

public class Modulo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> AL = new ArrayList<Integer>();
        ArrayList<Integer> removals = new ArrayList<Integer>();
        for(int i=1; i<=10; i++) {
            int temp = scan.nextInt() % 42;
            if (!AL.contains(temp)) {
                AL.add(temp);
            }
        }
        System.out.println(AL.size());
    }
}
