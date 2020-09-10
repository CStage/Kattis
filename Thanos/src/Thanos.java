import java.util.ArrayList;
import java.util.Scanner;

public class Thanos {

    public static void log() {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int[] results = new int[T];

        for (int i = 1; i <= T; i++) {
            int P = scan.nextInt();
            int R = scan.nextInt();
            int F = scan.nextInt();


                double year = Math.floor(Math.log(F / P) / Math.log(R))+1;
                int year2 = (int) year;

                if (year2 <0) {
                    results[i-1] = 0;
                }
                else {
                    results[i - 1] = year2;
                }
            }

        for (int i : results) {
            System.out.println(i);
        }
        scan.close();

    }
    public static void naive() {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int[] results = new int[T];
        int P = 0;
        int R = 0;
        int F = 0;

        for (int i = 1; i <= T; i++) {
            P = scan.nextInt();
            R = scan.nextInt();
            F = scan.nextInt();

            int years = 0;
            while (P<=F) {
                P*=R;
                years += 1;


        }
        results[i-1]=years;
    }
        for (int i : results) {
            System.out.println(i);
        }
        

    }

    public static void naiveTroels() {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int[] results = new int[T];
        int P = 0;
        int R = 0;
        int F = 0;

        for (int i = 1; i <= T; i++) {
            P = scan.nextInt();
            R = scan.nextInt();
            F = scan.nextInt();

            int years = 0;
            while (P<=F) {
                F/=R;
                years += 1;


        }
        results[i-1]=years;
    }
        for (int i : results) {
            System.out.println(i);
        }

    }

    public static boolean checkForOverflow(double x, double y) {
        return (x==(x*y/y));
    }

    public static void main(String[] args) {
        naiveTroels();

        
    }
}



