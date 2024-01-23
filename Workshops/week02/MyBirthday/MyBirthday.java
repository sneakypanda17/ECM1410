package Workshops.week02.MyBirthday;
import java.util.Scanner;
public class MyBirthday {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int currentDate = 23;
            int currentDay = 2;
            final int daysInAWeek = 7;
            System.out.println("Input your birthday date:");
            int myBirthdayDate = input.nextInt();
            int myBirthdayDay = (myBirthdayDate-currentDate)%daysInAWeek+currentDay;
            myBirthdayDay = myBirthdayDay%daysInAWeek;
            System.out.println("Your birthday is on day: " + myBirthdayDay + " of the week");
        }
    }
}
