import java.util.Scanner;

public class Filip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();

        int firstInt = Integer.parseInt(first.substring(2) + first.substring(1, 2) + first.substring(0, 1));
        int secondInt = Integer.parseInt(second.substring(2) + second.substring(1, 2) + second.substring(0, 1));

        System.out.println(Integer.max(firstInt, secondInt));
    }
}
