import java.util.Objects;
import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String SSN_regEx = "^\\d{3}-\\d{2}-\\d{4}$";
        String UC_ID_regEx = "[Mm]\\d{5}$";
        String menu_regEx = "^[OoSsVvQq]$";

        String SSN = SafeInput.getRegExString(in, "Enter your SSN", SSN_regEx);
            System.out.println("Your SSN is " + SSN);
        String UC_ID = SafeInput.getRegExString(in, "Enter your UC School ID", UC_ID_regEx);
            System.out.println("Your UC ID is " + UC_ID);
        String menu = SafeInput.getRegExString(in, "Choose an option from the menu [Open(O), Save(S), View(V), Quit(Q)]", menu_regEx);
        System.out.println("You chose " + menu);


    }
}
