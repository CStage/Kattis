import java.util.Scanner;

public class Babybites {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        boolean fishy = false;

        for (int i = 1; i<=count; i++) {
            if (scan.hasNextInt()){

                int bite = scan.nextInt();
                if (bite !=i) {
                    fishy = true;
                }
            }

            else {
                String bite = scan.next();
                if (!(bite.equals("mumble"))) {
                    fishy = true;
                }

            } 
                        
        }
        if (fishy)
        System.out.println("something is fishy");

        else
        System.out.println("makes sense");
    }
}