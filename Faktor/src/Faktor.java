import java.util.Scanner;

public class Faktor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        double db = b-0.99;
        int c = (int) (Math.ceil(a*db));

        System.out.println(c);
    }
}
