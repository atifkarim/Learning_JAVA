// Here want to know what is the differnecet between primitive and non-primitive data type
// Primitive data type is the data type which is not object.
// Non-primitive data type is the data type which is object.
// See here: https://www.geeksforgeeks.org/difference-between-primitive-and-non-primitive-data-types/

public class j_4_int_Integer {
    public static void main(String[] args) {
        int x = 45; // primitive type
        Integer y = new Integer(45); // wrapper class
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
    }

}