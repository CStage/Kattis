import java.util.Scanner;

public class Cold {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int collected = scan.nextInt();
        int amount = 0;
        for (int i=1; i<=collected; i++) {
            if(scan.nextInt() < 0)
            amount+=1;
        }

        System.out.println(amount);
    }
}