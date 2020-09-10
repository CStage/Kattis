import java.util.Scanner;

public class ReverseBinaryKattis {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        String binaryRepresentation = "";

        while (input > 1) {
            binaryRepresentation+=String.valueOf(input % 2);
            input = input/2;
        }
        binaryRepresentation+=String.valueOf(input);

        
        int base = 0;
        int result = 0;
        for (int i=0; i<binaryRepresentation.length(); i++) {
            char c = binaryRepresentation.charAt(i);
            int cInt = Character.getNumericValue(c);
            result = base * 2 + cInt;
            base = result;

        }
        System.out.println(result);
    }
    
}
