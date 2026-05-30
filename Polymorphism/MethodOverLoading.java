public class MethodOverLoading {

    public int add(int a, int b) {
        System.out.println("add1 works========>");
        return a + b;
    }

    public double add(double a, double b) {
        System.out.println("add2 works========>");
        return a + b;
    }

    public int add(int a, int b, int c) {
        System.out.println("add3 works========>");
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverLoading example = new MethodOverLoading();

        System.out.println("add(int, int): " + example.add(5, 10));
        System.out.println("add(double, double): " + example.add(4.5, 3.2));
        System.out.println("add(int, int, int): " + example.add(1, 2, 3));
    }
}
