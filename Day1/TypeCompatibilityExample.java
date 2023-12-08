public class TypeCompatibilityExample {
    public static void main(String[] args) {
        // Widening (Implicit) Conversion
        int intValue = 42;
        long longValue = intValue;

        // Narrowing (Explicit) Conversion
        long longValue2 = 123456789012345L;
        int intValue2 = (int) longValue2;

        // Casting between Floating-Point and Integral Types
        double doubleValue = 3.14;
        int intValue3 = (int) doubleValue;

        // Automatic Type Promotion in Expressions
        int intVal = 5;
        double doubleVal = 2.5;
        double result = intVal + doubleVal;

        System.out.println("Widening Conversion: " + longValue);
        System.out.println("Narrowing Conversion: " + intValue2);
        System.out.println("Casting Floating-Point to Integral: " + intValue3);
        System.out.println("Automatic Type Promotion: " + result);
    }
}
