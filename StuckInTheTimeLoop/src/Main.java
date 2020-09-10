import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input = 0;
        boolean validInput = false;
        Scanner sc = new Scanner(System.in);
        while (!validInput) {
                if (sc.hasNextInt()) {
                    input = sc.nextInt();
                    if (1 <= input && input <= 100) {
                        validInput = true;
                    }
                    else {
                        System.out.println("Please input an integer between 1 and 100");
                        sc.nextLine();
                    }
                }
                else {
                    System.out.println("Invalid input. Please input an integer");
                    sc.nextLine();
                }

            }
        
        for (int i = 1; i <= input; i++) {
            System.out.println(i + " Abracadabra");
        }

    }
}

