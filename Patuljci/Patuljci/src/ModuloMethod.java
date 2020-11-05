public class ModuloMethod {

    public ModuloMethod() {

    }
    public static int getModulo(int a, int b) {
        if (a/b*b != a) {
            return a-a/b*b;
        }
        return 0;
    }
    public static void main(String[] args) {

    System.out.println( getModulo(10, 8));
    System.out.println(getModulo(8, 10));
    System.out.println(getModulo(101, 20));  
    }
}
