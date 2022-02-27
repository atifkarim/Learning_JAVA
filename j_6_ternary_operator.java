import java.util.Scanner;

public class j_6_ternary_operator{
    public static void main(String[] args) {
        System.out.println("Ternary Operator");

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        String y = (x > 0) ? "Greater than zero" : "Less than zero";
        System.out.println(y);
    }
}