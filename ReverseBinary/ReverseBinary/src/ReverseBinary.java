import java.util.Scanner;

public class ReverseBinary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        String binaryRepresentation = "";
        String fixedBinary = "";

        while (input > 1) {
            binaryRepresentation+=String.valueOf(input % 2);
            input = input/2;
        }
        binaryRepresentation+=String.valueOf(input);

        for (int i=binaryRepresentation.length()-1; i>-1; i--) {
            char c = binaryRepresentation.charAt(i);
            fixedBinary+=c;


        }
        System.out.println(binaryRepresentation);
    }
    
}
