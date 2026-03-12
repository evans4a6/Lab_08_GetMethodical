import java.util.Scanner;

public class CtoFTableDisplay {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

        System.out.printf("%-10s %-10s\n", "Celsius", "Fahrenheit");
        System.out.println("_________________________");

        for (int celsius = -100; celsius <= 100; celsius++)
        {
            double f = CtoF(celsius);
            System.out.printf("%-10d %-10.2f\n", celsius, f);
        }


    }

    // method
    public static double CtoF(double Celsius)
    {
        return Celsius * (9.0 / 5.0) + 32;

    }
 }

