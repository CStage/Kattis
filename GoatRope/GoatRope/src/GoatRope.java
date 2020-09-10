import java.util.Scanner;

public class GoatRope {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        double slope = (y2-y1)/(x2-x1);
        double reciprocal = -(1/(y2-y1)/(x2-x1));

        int y = reciprocal*(x-x1)+y1;


    }
}
