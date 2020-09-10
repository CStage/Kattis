import java.util.Scanner;

public class Pizza2 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int R = scan.nextInt();
        int C = scan.nextInt();
        double pizzaArea = Math.pow(R, 2)*Math.PI;
        double crust = pizzaArea - Math.pow((R-C), 2)*Math.PI;
        double CheeseP = 0;
        
        if ((crust/pizzaArea)!=0)
            CheeseP=(1-(crust/pizzaArea))*100;

        System.out.println(CheeseP);
    }
}
