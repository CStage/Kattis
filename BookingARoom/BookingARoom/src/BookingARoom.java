import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BookingARoom {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int n = scan.nextInt();
        ArrayList<Integer> occupied = new ArrayList<Integer>();
        boolean tooLate = true;

        for (int i=0; i<n; i++){
            occupied.add(scan.nextInt());
        }

        for (int i=1; i<=r; i++){
            if (!occupied.contains(i)) {
                System.out.println(i);
                tooLate = false;
                break;
            }
        }
        if (tooLate) {
            System.out.println("too late");
        }
    }
}
