import java.util.Scanner;

public class TwoStones {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a % 2 == 0) {
            System.out.print("Bob");
        }
        else {
            System.out.print("Alice");
        }
    }
}
