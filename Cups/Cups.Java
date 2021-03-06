import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Cups {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String color = "";
        int radius = 0;
        int iRef = 0;
        TreeMap<Integer, String> cups = new TreeMap<Integer, String>();
        for(int i = 1; i<=N; i++) {
            if (scan.hasNextInt()){
                iRef=scan.nextInt();
                color=scan.next();
                radius = iRef/2;
                cups.put(radius, color);
            }
            else {
                color=scan.next();
                radius=scan.nextInt();
                cups.put(radius, color);
            }

        }
        for(Map.Entry entry : cups.entrySet()) {
            System.out.println(entry.getValue());

        }
    }
}
