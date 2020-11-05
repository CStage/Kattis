import java.util.Scanner;

public class Main {
    public Main() {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int T = 0;
        String tempdest = "";
        ArrayList<String> destinations = new ArrayList<String>();
        for (int i=1; i<=n; i++) {
            T = scan.nextInt();
            for (int j=1; j<=T; j++) {
                tempdest=scan.next();
                if (!(destinations.contains(tempdest))) {
                    destinations.add(tempdest);
                }
            }
            System.out.println(tempdest.size());
        }


    }
    }
}