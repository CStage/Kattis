import java.util.Scanner;

public class Herman {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int R = scan.nextInt();
        double euclidean = Math.pow(R, 2)*Math.PI;
        double taxi = Math.pow(R, 2)*2;

        System.out.println(euclidean);
        System.out.println(taxi);
    }
}
