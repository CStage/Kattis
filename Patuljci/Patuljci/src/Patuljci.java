import java.util.Scanner;

public class Patuljci {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[9];
        for (int i=1; i<=9; i++) {
            array[i]=scan.nextInt();
        }
        int sum = 0;
        for (int i : array) {
            sum+=i;
        }
    }
}
