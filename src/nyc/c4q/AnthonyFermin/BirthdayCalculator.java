package nyc.c4q.AnthonyFermin;

import java.util.Calendar;
import java.util.Scanner;

/** Anthony Fermin
 *
 */
public class BirthdayCalculator {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Calendar currentDate = Calendar.getInstance();
        Calendar birthday = Calendar.getInstance();
        Calendar lastDay = Calendar.getInstance();

        int currentDayOfYear = currentDate.get(Calendar.DAY_OF_YEAR);
        int currentYear = currentDate.get(Calendar.YEAR);
        int daysAway = 0;
        int birthDayOfYear;

        lastDay.set(currentYear,11, 31);
        int lastDayOfCurrentYear = lastDay.get(Calendar.DAY_OF_YEAR);

        System.out.println("Enter your birthday");
        System.out.print("What is the month (1-12): ");
        int month = in.nextInt();
        System.out.print("What is the day (1-31): ");
        int day = in.nextInt();

        birthday.set(currentYear,month - 1, day);
        birthDayOfYear = birthday.get(birthday.DAY_OF_YEAR);

        String birthdayString = "";
        if(currentDayOfYear < birthDayOfYear){
            daysAway = birthDayOfYear - currentDayOfYear;
            birthdayString = "Your birthday is " + daysAway + " days away.";
        }else if(currentDayOfYear > birthDayOfYear){
            birthday.set(currentYear + 1, month - 1, day);
            birthDayOfYear = birthday.get(birthday.DAY_OF_YEAR);
            daysAway = lastDayOfCurrentYear - currentDayOfYear + birthDayOfYear;
            birthdayString = "Your birthday is " + daysAway + " days away.";
        }else if(currentDayOfYear == birthDayOfYear){
            daysAway = 0;
            birthdayString = "Your birthday is " + daysAway + " days away! Happy Birthday!";
        }

        System.out.println(birthdayString);


    }

}
