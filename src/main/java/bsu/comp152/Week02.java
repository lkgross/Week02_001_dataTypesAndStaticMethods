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
        /*
         * Casting an integer as a double is a
         * widening type conversion.
         */
        System.out.println( (double) (25 / 12));
        /*
         * Casting a double as an integer is a
         * narrowing type conversion.
         * Data can be lost when the decimal part is dropped (truncated).
         */
        System.out.println((int) 2.0833);
        // Calculate 25 % 12 ("25 mod 12" or "25 modulus 12").
        System.out.println(25 % 12);
        // The mod operator gives the remainder.
        // In Java: and is &&:
        System.out.println(true && false);
        // In Java: or is ||
        System.out.println(true || false);
        System.out.println(!true);
        // We can do concatenation with +:
        System.out.println("True or true is " + (true || true) +
                ".");
        System.out.println("3 + 5 is " + 3+5);
        // 3 and 5 were treated as strings.
        System.out.println(3 + 5);
        System.out.println("3" + "5");
        // The character data type (char) stores each character numerically.
        System.out.println('3' + '5');
        System.out.println("The character 3 is: " + '3');
        // Java is a strongly typed language:
        // variables must be declared by type:
        int num1 = 25;
        // These are inline initializations.
        // Inline initializations declare a type
        // and assign a value on one line.
        int num2 = 12;
        System.out.println(num1 + num2);
        // Could do declaration statements first.
        int num3;
        int num4;
        // Then assign values.
        num3 = 3;
        num4 = 4;
        System.out.println(num3 - num4);
        // We can declare multiple variables at once:
        int a, b;
        a = 1234;
        b = 99;
        System.out.println(a*b);
        String name = "Laura";
        System.out.println("The prof's name is " + name);




    }
}