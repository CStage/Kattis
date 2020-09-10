import java.util.Scanner;

public class DetailedDifferences {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();

        for (int i = 1; i<=cases; i++) {
            String first = scan.next();
            String second = scan.next();
            String result = "";
            for (int j = 0; j < first.length(); j++) {
                if(first.substring(j, j+1).equals(second.substring(j, j+1)))
                    result += ".";

                else {
                    result += "*";
                }
            }
            System.out.println(first);
            System.out.println(second);
            System.out.println(result);
            System.out.println();
        }
    }
}
