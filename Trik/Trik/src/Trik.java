import java.util.Scanner;

public class Trik {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String raw = scan.nextLine();
        int position = 1;

        char[] moves = raw.toCharArray();

        for (char i : moves) {
            if (position == 1) {
                if (i=='A') {
                    position=2;                
                }
                if (i=='C') {
                    position=3;
                }

            }
            else if (position==2) {
                if (i=='A') {
                    position=1;
                }
                if (i=='B') {
                    position=3;
                }
            }
            else {
                if (i=='B') {
                    position=2;
                }
                if (i=='C') {
                    position=1;
                }
            }

            
        }
        System.out.println(position);

    }
}
