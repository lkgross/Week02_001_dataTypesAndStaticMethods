package bsu.comp152;

public class Week02 {
    public static void main(String[] args) {
        System.out.println("Computation with numbers:");
        System.out.println(12 + 12);
        System.out.println(12 - 12);
        System.out.println(12 * 12);
        // Watch for "integer divides"!
        System.out.println(25/12);
        // We can avoid integer divides.
        System.out.println(25.0/12);
        System.out.println(25/12.);
        System.out.println(25./12.);
        System.out.println((double) 25 / (double) 12);
        // Watch out for the order of operations.
        System.out.println( (double) (25 / 12));
        System.out.println(true && false);
    }
}