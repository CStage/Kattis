import java.util.ArrayList;
import java.util.Scanner;

public class Sibice {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int W = scan.nextInt();
        int H = scan.nextInt();
        double d = Math.sqrt((Math.pow(W, 2)+Math.pow(H, 2)));
        ArrayList<String> fits = new ArrayList<String>();

        for (int i=1; i<=N; i++) {
            int relevant = scan.nextInt();
            if (relevant <= d) {
                fits.add("DA");
            }
            else {
                fits.add("NE");
            }
        }
        
        for (String i : fits) {
            System.out.println(i);
        }

    }
}
