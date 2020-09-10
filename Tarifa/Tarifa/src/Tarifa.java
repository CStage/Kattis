import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int N = scan.nextInt();
        int remainder = 0;
        
        for (int i=1; i<=N; i++) {
            int P = scan.nextInt();
            remainder += X-P;
        }
        remainder+=X;

        System.out.println(remainder);
    }
}
