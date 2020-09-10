import java.util.*;

public class Howl {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fenrir = scan.next();
        StringBuilder me = new StringBuilder("");

        while (me.length() <= fenrir.length()) {
            if (me.length() == 0) {
                me.append("AHOW");
            }
            else {
                if (me.substring(me.length() - 1).equals("W")) {
                    me.append("H");
                }
                else if (me.substring(me.length() - 1).equals("H")) {
                    me.append("O");
                }
                else {
                    me.append("W");
                }
            }
        }
        System.out.println(me);
    }
}
