public class type_casting {
    public static void main(String[] args) {
        // Implicit type casting (widening)
        int num = 100;
        long longNum = num; // int to long
        double doubleNum = longNum; // long to double

        System.out.println("Implicit Type Casting:");
        System.out.println("int: " + num);
        System.out.println("long: " + longNum);
        System.out.println("double: " + doubleNum);

        // Explicit type casting (narrowing)
        doubleNum = 9.78;
        longNum = (long) doubleNum; // double to long
        num = (int) longNum; // long to int

        System.out.println("\nExplicit Type Casting:");
        System.out.println("double: " + doubleNum);
        System.out.println("long: " + longNum);
        System.out.println("int: " + num);
    }

}
