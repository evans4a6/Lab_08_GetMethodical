import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = SafeInput.getRangedInt(in, "Enter your birth year [1950-2015]", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter your birth month [1-12]", 1,12);
           int maxDay = 31;
            switch (month)
            {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12: maxDay = 31;
                break;
                case 4: case 6: case 9: case 11: maxDay = 30;
                break;
                case 2: maxDay = 29;
                break;
            }
        int day = SafeInput.getRangedInt(in, "Enter your day of birth [1-" + maxDay + "]", 1, maxDay);
        int hour = SafeInput.getRangedInt(in, "Enter the hour of your birth [1-24]",1,24);
        int minute = SafeInput.getRangedInt(in, "Enter the minute of your birth [1-59]",1,59);

        System.out.println("You were born on " + month + "/" + day + ", " + year + " at " + hour + ":" + minute + " O'Clock.");
    }
}


