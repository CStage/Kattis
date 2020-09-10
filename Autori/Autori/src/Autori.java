import java.util.Scanner;

public class Autori {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String raw = scan.nextLine();
        String[] split = raw.split("-");
        String finale = "";
        for (String i:split) {
            finale += i.substring(0,1);
        }

        System.out.println(finale);
    }
    
}
