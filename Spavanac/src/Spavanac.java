import java.util.Scanner;

public class Spavanac {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (b-45 < 0) {
            if (a - 1 < 0) {
                a = 23;
            }
            else {
                a -= 1;
            }
            b = 60-(45-b);
            System.out.println(a + " " + b);
        }
        else {
            System.out.println(a + " " + (b-45));
        }
    }
}
