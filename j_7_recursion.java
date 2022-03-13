import java.util.Scanner;

public class j_7_recursion {

    static int do_recursion(int value) {
        if (value == 0 || value == 1) {
            return 1;
        }
        else {
            return value * do_recursion(value - 1);
        }
      }

    public static void main(String[] args) {
        System.out.println("Recursion");

        System.out.print("Enter a positive integer: ");
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        int a = sc.nextInt();

        if(a < 0) {
            System.out.println("The number is negative");
            System.exit(0);
        }
        else {
            int result = do_recursion(a);
            System.out.println("Result is: "+ result);
        }
    }
}
