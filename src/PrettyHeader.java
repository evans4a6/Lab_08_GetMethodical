import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your header message: ");
        String userMsg = in.nextLine();
        SafeInput.prettyHeader(userMsg);
    }
}
