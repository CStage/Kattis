import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Cetvrta {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> y = new ArrayList<Integer>();
        ArrayList<Integer> x = new ArrayList<Integer>();
        int x1 = 0;
        int y1 = 0;

        for (int i=1; i<=6; i++) {
            if (i % 2 == 0) {
                y.add(scan.nextInt());                
            }
            else {
                x.add(scan.nextInt());
            }
        }
        for (int i : x) {
            if (Collections.frequency(x, i)==1) {
                x1 = i;

            }
        }
        for (int i : y) {
            if (Collections.frequency(y, i)==1) {
                y1 = i;
            }
        }  
        System.out.println(x1 + " " + y1);
        
        scan.close();
        }
    }

