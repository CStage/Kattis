import java.util.Scanner;

public class IsItHalloween {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.next();
        int day = scan.nextInt();

        if (month.equalsIgnoreCase("oct") && day==31 || (month.equalsIgnoreCase("dec") && day==25)) {
            System.out.println("yup");
        }
        else {
            System.out.print("nope");
        }

    }
}
