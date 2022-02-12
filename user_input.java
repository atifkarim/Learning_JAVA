import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        System.out.println("HI !! Who are you???");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, I am " + name);
        System.out.println("Hello, " + scanner.nextLine());
    }

}
