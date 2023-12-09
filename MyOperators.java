import java.io.*;

class MyOperators {
    public static void main(String[] args) {
        // Logical Operators
        boolean a = true;
        boolean b = false;
        // Logical AND
        System.out.println("a && b = " + (a && b));
        // Logical OR
        System.out.println("a || b = " + (a || b));
        // Logical NOT
        System.out.println("!(a && b) = " + !(a && b));

        // Bitwise Operators
        int c = 60; /* 60 = 0011 1100 */
        int d = 13; /* 13 = 0000 1101 */
        // Bitwise AND
        // evaluates to 12 which is 0000 1100 (try it yourself)
        System.out.println("c & d = " + (c & d));
        // Bitwise OR
        // evaluates to 61 which is 0011 1101
        System.out.println("c | d = " + (c | d));

        // Ternary Operator
        int x = 10;
        // if x == 1, y = 20; else y = 30
        int y = (x == 1) ? 20 : 30;
        System.out.println("int y = (x == 1) ? 20 : 30;");
        System.err.println("y = " + y);

        // Shift Operators
        // << left shift operator - shifts a bit pattern to the left
        // which in decimal is equivalent to multiplying by 2
        // so << 2 is in decimal equivalent to multiplying by 2^2 = 4
        // Example: 0000 1100 << 2 = 0011 0000
        // Decimal: 12 << 2 = 48
        System.out.println("12 << 2 = " + (12 << 2));

        // Instanceof Operator
        String name = "James";
        // following will return true since name is type of String
        boolean result = name instanceof String;
        System.out.println("name instanceof String = " + result);
    }
}