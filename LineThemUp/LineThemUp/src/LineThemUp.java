import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class LineThemUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        TreeSet<String> names = new TreeSet<String>();
        ArrayList<String> input = new ArrayList<String>();
        boolean descending = false;
        boolean ascending = false;
        
        for (int i = 1; i<=N; i++) {
            String name = scan.next();
            input.add(name);
            names.add(name);
        }
        TreeSet<String> treereverse = (TreeSet<String>) names.descendingSet();


        int index = 0;
        for (String i : treereverse) {
            if (i == input.get(index)){
                descending = true;
            }
            else {
                descending = false;
                break;
            }
            index+=1;

        }
        index = 0;
        for (String i : names) {
            if (i == input.get(index)){
                ascending = true;
            }
            else {
                ascending = false;
                break;
            }
            index+=1;
    }
    if (ascending) {
        System.out.println("INCREASING");
    }
    else if (descending) {
        System.out.println("DECREASING");
    }
    else {
        System.out.println("NEITHER");
    }
}
}
