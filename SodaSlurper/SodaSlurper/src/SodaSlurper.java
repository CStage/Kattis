import java.util.Scanner;

public class SodaSlurper {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int e = scan.nextInt();
        int f = scan.nextInt();
        int c = scan.nextInt();
        int empty = e+f;
        int dranken = 0;

        while(empty >= c) {
            empty-=c;
            empty+=1;
            dranken +=1;
        }

        System.out.println(dranken);




    }
}
