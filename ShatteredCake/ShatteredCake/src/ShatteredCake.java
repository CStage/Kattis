import java.util.Scanner;

public class ShatteredCake {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int W = scan.nextInt();
        int N = scan.nextInt();
        int L = 0;
        int w = 0;
        int l = 0;
        int area = 0;

        for (int i=1; i<=N; i++) {
            w = scan.nextInt();
            l = scan.nextInt();
            area += w*l;

        }
        L = area/W;

        System.out.println(L);
    }
}
