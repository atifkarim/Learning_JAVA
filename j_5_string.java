import java.util.Scanner;

// import javax.swing.text.StyledEditorKit;

public class j_5_string {
    public static void main(String[] args) {
        System.out.println("Give the passowrd\n");

        String system_password = "fake_pass";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.println("password: " + password);
        System.out.println("Check here the output: ");
        System.out.println(system_password.equals(password));

        if (password.equals(system_password)) {
            System.out.println("Access granted");
        } else if (password.equals("pass")) {
            System.out.println("Try more");
        } else {
            System.out.println("Access denied");
        }
        scanner.close();
    }

}
