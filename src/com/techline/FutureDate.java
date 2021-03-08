package com.techline;
/*
(Find future dates) Write a program
1.that prompts the user
to enter an integer for today’s day of the week (Sunday is 0,
 Monday is 1, . . . , and Saturday is 6).
 2. Also prompt the user
 to enter the number of days after today for a future day and
 display the future day of the week.
*/

import java.util.Scanner;

public class FutureDate {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter todays date: ");
        int todaysDate = in.nextInt();
        System.out.print("Enter the number of days after today: ");
        int daysAfterToday = in.nextInt();
        int future_date = (todaysDate + daysAfterToday) % 7;
        String day_of_week = "";
        switch (todaysDate) {
            case 0:
                day_of_week = "Sunday";
                break;
            case 1:
                day_of_week = "Monday";
                break;
            case 2:
                day_of_week = "Tuesday";
                break;
            case 3:
                day_of_week = "Wednesday";
                break;
            case 4:
                day_of_week = "Thursday";
                break;
            case 5:
                day_of_week = "Friday";
                break;
            case 6:
                day_of_week = "Saturday";
                break;
        }

/*        if (todaysDate == 0)
        {
            day_of_week = "Sunday";
        }
        else if (todaysDate == 1)
        {
            day_of_week = "Monday";

        }
        else if (todaysDate == 2)
        {
            day_of_week = "Tuesday";
        }
        else if (todaysDate == 3)
        {
            day_of_week = "Wednesday";
        } else if (todaysDate == 4)
        {
            day_of_week = "Thursday";
        }
        else if (todaysDate == 5)
        {
            day_of_week = "Friday";
        } else if (todaysDate == 6)
        {
            day_of_week = "Saturday";
        }*/

        if (future_date == 0)
        {
            System.out.printf("Today is "+day_of_week+ " and the future day is Sunday", day_of_week);
        }
        else if(future_date == 1)
        {
            System.out.printf("Today is  "+day_of_week+ " and the future day is Monday ", day_of_week);
        }
        else if(future_date == 2)
        {
            System.out.printf("Today is "+day_of_week+ " and the future day is Tuesday ", day_of_week);
        }
        else if(future_date == 3)
        {
            System.out.printf("Today is "+day_of_week+ " and the future day is Wednesday", day_of_week);
        }else if(future_date == 4)
        {
            System.out.printf("Today is  "+day_of_week+ " and the future day is Thursday", day_of_week);
        }
        else if(future_date == 5)
        {
            System.out.printf("Today is "+day_of_week+ " and the future day is Friday", day_of_week);
        }
        else if(future_date == 6)
        {
            System.out.printf("Today is "+day_of_week+ " and the future day is Saturday", day_of_week);
        }

    }
}
