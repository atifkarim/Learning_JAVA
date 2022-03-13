import java.util.Scanner;
import java.math.BigInteger;

public class j_7_recursion {

    public static BigInteger do_recursion(int value) {
        BigInteger factorial_1 = BigInteger.ONE;
        BigInteger factorial_2 = BigInteger.valueOf(value);

        if (value == 0 || value == 1) {
            return factorial_1;
        }
        else {
            return factorial_2.multiply(do_recursion(value - 1));
        }
      }

    public static void main(String[] args) {
        System.out.println("Recursion");

        System.out.print("Enter a positive integer: ");
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        int a = sc.nextInt();
        BigInteger b = BigInteger.valueOf(a);
        System.out.println("BigInteger Value: " + b);;

        if(a < 0) {
            System.out.println("The number is negative");
            System.exit(0);
        }
        else {
            System.out.println("Result is: "+ do_recursion(b.intValue()));
        }
    }
}
