import java.util.Scanner;

public class quadrant {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cOne = scan.nextInt();
        int cTwo = scan.nextInt();

        if (cOne > 0 && cTwo > 0) {
            System.out.println(1);
        }
        else if (cOne < 0 && cTwo > 0) {
            System.out.println(2);
        }
        else if (cOne < 0 && cTwo < 0) {
            System.out.println(3);
        }
        else if (cOne > 0 && cTwo < 0) {
            System.out.println(4);
        }
    }
}
