import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the $10 and under store!\n");

        double total = 0;
        boolean done = false;

        do {

            double itemCost = SafeInput.getRangedDouble(in, "Enter the cost of your item", 0.5, 10);
            total = total + itemCost;
            done = SafeInput.getYNConfirm(in, "Are you done shopping?");

        }while (!done);

        System.out.printf("The total cost of your purchase is %.2f", total);
    }
}
