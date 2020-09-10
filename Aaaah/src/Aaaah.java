import java.util.Scanner;

public class Aaaah {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String jonMarius = scan.next();
        String doctor = scan.next();

        if (jonMarius.length() >= doctor.length()) {
            System.out.println("go");
        }
        else {
            System.out.println("no");
        }
    }
}
